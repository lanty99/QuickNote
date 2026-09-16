# QuickNote

A simple REST API for creating, reading, updating, and deleting notes.

## Features

- Create, view, update, and delete notes
- Input validation (titles can't be blank)
- Data persisted to a database

## Built with

- Java, Spring Boot, Spring Data JPA, H2

## Endpoints

| Method | Endpoint      | Description       |
|--------|---------------|--------------------|
| GET    | /notes        | Get all notes      |
| POST   | /notes        | Create a note      |
| PUT    | /notes/{id}   | Update a note      |
| DELETE | /notes/{id}   | Delete a note      |

## How to run

1. Clone the repo
2. Open in IntelliJ IDEA
3. Run the main application class

## What I learned

Built as an introduction to backend development — entity modeling, repository patterns, REST endpoint design, and request validation with Spring Boot.

## Future plans for the project

Build a frontend and continue to learn different skills of programming.