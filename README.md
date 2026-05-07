Geo (Country and City) API Service

A Spring Boot REST API for managing Countries and Cities with JPA, H2 database, pagination, and Swagger documentation.

Project Overview

This project provides REST APIs to:

- Create and manage Countries
- Create and manage Cities
- Fetch cities by country with pagination
- Fetch city details by ID
- Explore APIs via Swagger UI

: 

Make sure you have the following installed:

- Java 21
- Maven 3.8+
- Git
- Postman or Bruno (for API testing)
- Browser (for Swagger UI)

Tech Stack: 
Spring Boot 3.x
Spring Data JPA
H2 In-Memory Database
Spring Web
Spring Validation
SpringDoc OpenAPI (Swagger)

Project Setup:
1️) Clone Repository
git clone https://github.com/Ankita-Malani/Engineering-interview-playbook-tmlux.git
cd tmlux-code

2)Build Project
mvn clean install

3) Run Application
mvn spring-boot:run

Application will start at:
http://localhost:8080

H2 Database Console: 
- Access H2 database: http://localhost:8080/h2-console

JDBC Settings:
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password:

Swagger UI (API Documentation) : Swagger is enabled using SpringDoc OpenAPI.
- Access URL: http://localhost:8080/swagger-ui.html or http://localhost:8080/swagger-ui/index.html

API Endpoints

1) Country APIs
  - Get all countries
    GET /countries
  - Create country
    POST /countries
        {
          "name": "India"
        }

2) City APIs
 - Create city
      POST /cities
      {
        "name": "Mumbai",
        "population": 20000000,
        "zipCode": "400001",
        "description": "Financial capital",
        "countryId": 1
      }
- Get city by ID
      GET /cities/{cityId}
- Get cities by country (Pagination)
      GET /countries/{countryId}/cities?page=0&size=10&sort=name,asc

Pagination Example
{
  "content": [],
  "totalElements": 10,
  "totalPages": 1,
  "size": 10,
  "number": 0
}

Testing Instructions: 
- http://localhost:8080/swagger-ui.html or http://localhost:8080/swagger-ui/index.html
  
Test Flow (Recommended Order)
- Step 1: Create Country
      POST /addCountries
- Step 2: Create City
      POST /addCities
- Step 3: Get All Countries
      GET /countries
- Step 4: Get Cities by Country
      GET /countries/{id}/cities?page=0&size=10
- Step 5: Get City by ID
      GET /cities/{id}

Notes
Database is H2 in-memory, so data resets on restart
Ensure correct countryId when creating cities
Use valid sorting fields: id, name, population

Project Summary: Spring Boot backend project demonstrating:

REST API design
JPA relationships
Pagination
Swagger/OpenAPI
Clean layered architecture
