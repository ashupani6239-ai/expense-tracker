# Expense Tracker REST API

A REST API for tracking personal expenses, built with Java and Spring Boot.

## Features
- Add, view, update and delete expenses
- Filter expenses by category
- Get the total spent per category
- Input validation (title required, amount must be positive)

## Tech Stack
- Java 17
- Spring Boot (Web, Data JPA, Validation)
- H2 in-memory database
- Maven
- Lombok

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/expenses` | Add an expense |
| GET | `/api/expenses` | List all expenses |
| GET | `/api/expenses?category=Food` | Filter by category |
| PUT | `/api/expenses/{id}` | Update an expense |
| DELETE | `/api/expenses/{id}` | Delete an expense |
| GET | `/api/expenses/summary` | Total per category |

## Run Locally
1. Clone the repository
2. Open it in IntelliJ IDEA
3. Run `ExpenseTrackerApplication`
4. Open `http://localhost:8080/api/expenses`

## Example Request
```json
{
  "title": "Lunch",
  "amount": 150,
  "category": "Food"
}
```

## Built With
IntelliJ IDEA


## Author
Ashutosh Pani