# Api_Demo

For details check to the RAW

============== for manual API (POSTMAN) ==============

baseURL = http://localhost:9090


GET {{baseURL}}/myAPI
Headers
Key : Content-Type  Value : application/json

GET {{baseURL}}/getAllCandidates
Headers
Key : Content-Type  Value : application/json

POST {{baseURL}}/addTeamMember
Body JSON
{
    "candidateName": "Any One",
    "candidateDepartment": "AdSales",
    "computerLanguage": "Java",
    "optimistic": true,
    "skills" : "smart worker"
}

PUT {{baseURL}}/updateCandidate
Body JSON
{
    "id" : 1,
    "candidateName": "Omer Akben"
}

DELETE {{baseURL}}/deleteCandidate
Body JSON
{
    "id" : 2
}


============== for data managment SQL ==============

CREATE SCHEMA 'nbcu_together' DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

use nbcu_together;

show tables;

select * from nbcu_together.candidate_entity;
