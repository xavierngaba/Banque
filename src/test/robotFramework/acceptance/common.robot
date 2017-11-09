*** Settings ***
Library           DatabaseLibrary
Library           Process
Library           DateTime
Library           Collections

*** Keywords ***
Connect DB
    Connect To Database	com.mysql.jdbc.Driver jdbc:mysql://localhost:3306/banque_db  root  ''  default
Disconnect DB
    Disconnect From Database