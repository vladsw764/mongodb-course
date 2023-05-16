# MongoDB course

This repository contains project related to non-relational database, specifically MongoDB. It includes small project that demonstrate various aspects of my working with MongoDB.

## Prerequisites

Before running the application, ensure that you have the following prerequisites installed:

- Docker: [Install Docker](https://docs.docker.com/get-docker/)
- MongoDB: [Install MongoDB](https://docs.mongodb.com/manual/installation/)

## Getting Started

Follow these steps to set up and run the application:

1. Start MongoDB using Docker:

   ```bash
   docker-compose up -d
   ```
This command will start a MongoDB container using the configuration specified in the docker-compose.yaml file.

2. Connect to MongoDB:
   Use a MongoDB client or the command-line interface to connect to the running MongoDB instance. By default, MongoDB is accessible on localhost at port 27017. You can use the default connection settings or modify them as needed.
3. Start the Application:
   In the project root directory, run the following command to start the application:
```bash
./mvnw spring-boot:run
```
This command will build the project and start the Spring Boot application.
4. Access the Application:
   Once the application has started successfully, you can access it by navigating to http://localhost:8080 in your web browser.
   
## Configuration

You can customize the application's configuration by modifying the following files:

`application.yaml`: Contains the application-level configurations such as server port, database connection details, etc.


## Request examples

**REQUEST: POST**
`http://localhost:8080/api/v1/students
`

**Status: 201 CREATED**

**Body:**
```
{
    "firstName" : "Vlad", 
    "lastName" : "Isariev", 
    "email": "vladsw@gmail.com", 
    "gender" : "MALE", 
    "address": {
        "country" : "USA", 
        "postCode":"123", 
        "city":"LA"
    },
    "favouriteSubjects" : ["computer science", "math"], 
    "totalSpentInBooks" : 10
}
```

**Response:**

**Id Of Document:**
`64634194ed109f6f02a02c22
`

---


**REQUEST: GET**
`http://localhost:8080/api/v1/students/vladsw@gmail.com
`

**Status: 200 OK**

**Response:**
```
{
   "id": "64634e333fa87c610cbbf17e",
   "firstName": "Vlad",
   "lastName": "Isariev",
   "email": "vladsw@gmail.com",
   "gender": "MALE",
   "address": {
   "country": "USA",
   "postCode": "123",
   "city": "LA"
   },
   "favouriteSubjects": [
   "computer science",
   "math"
   ],
   "totalSpentInBooks": 10,
   "created": "2023-05-16T12:34:43.564"
}
```

## Contact:

**_EMAIL: vladsw764@icloud.com_**