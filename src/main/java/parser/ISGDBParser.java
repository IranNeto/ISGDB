package parser;

import exception.ParserException;
import gateway.ISGDBGateway;

import java.util.HashMap;

public class ISGDBParser {

    private final ISGDBGateway gateway = new ISGDBGateway();

    public void parse(String req) throws Exception {
        HashMap<String, String> response = new HashMap<>();

        String[] reqOperators = req.split(" ");

        if(reqOperators.length != 3)
            //TODO corrigir fluxo de excecoes
            throw new Exception("Formato da requisição inválida");

        switch (reqOperators[0]){
            case "GET":
                response = gateway.get(reqOperators[1]);
                break;
            case "INSERT":
                response = gateway.insert(reqOperators[1], reqOperators[2]);
                break;
            default:
                throw new ParserException("Método Inválido");
        }

    }

    public static void main(String[] args) throws Exception {
        ISGDBParser i = new ISGDBParser();
        i.parse("GET foo");
    }
}
