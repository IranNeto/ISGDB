ISGDB is a DBMS (Database Management System) designed and developed by me with the purpose
of sharp my developer and software engineer skills like (planning, documentation, etc) 
and also understand how a database works underneath. Anyone is free to join and contribute upon
the version System design specification. 

v1.0 in constuction

Search for development detail in HISTORY file

# ISGDB

#### Introduction

Database management system (DBMS) is the software that interacts with end users, applications, 
and the database itself to capture and analyze the data. The DBMS software additionally encompasses 
the core facilities provided to administer the database. The sum total of the database, the DBMS 
and the associated applications can be referred to as a "database system".

#### v1.0

Database and DBMS
The database will be a very simple version of key/value ones. The objective is to be able to read 
and write basic key/value objects and be able to retrieve the value information upon a key. Obviously, 
the data has to be persisted and be available on every request no matter what happens.

The communication can be made by raw tcp sockets. Is responsibility to the developer to add more information 
to the communication protocol or not. SGDB will listen to port 6666 and parse the command and keep the communication 
alive but the connection must be closed after 30 seconds or a shutdown message. The general command format will be:

| VERB arg1 arg2  |
|-----------------|

| Command         | Meaning                                      |
|-----------------|----------------------------------------------|
| GET foo         | Search for value of 'foo' key                |
| INSERT red blue | Store index 'red' associated to value 'blue' |
| SHUTDOWN        | Shutdown the SGDB                            |

SGDB also must be able to give all responses and provide errors or exception causes to the user. 
Criteria as performance, atomic operation, etc will not be included in this version just one client
making operations.