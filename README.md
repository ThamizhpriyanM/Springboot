# Grade Management System

This is a Spring Boot application for managing student grades. The application allows users to submit grades for students and view a list of all grades. The application uses an in-memory data store to manage grades and Thymeleaf for the front-end.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Grade Management System allows users to add, update, and view student grades. It includes form validation to ensure the grades are entered correctly.

## Features

- Add new grades
- Update existing grades
- View a list of all grades

## Prerequisites

- Java 8 or higher
- Maven

## Setup

1. **Clone the repository:**
https://github.com/ThamizhpriyanM/Springboot.git

2. **Build the project:**

    ```sh
    mvn clean install
    ```

## Running the Application

1. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

2. **Access the application:**

    Open your web browser and go to `http://localhost:8080`.


## Endpoints

- **GET /** - Displays the grade submission form.
- **GET /grade** - Lists all grades.
- **POST /handlesubmit** - Handles grade form submission.

## Usage

1. **Submit a new grade:**

    Navigate to `http://localhost:8080/` and fill out the grade submission form. Click "Submit" to add or update the grade.

2. **View grades:**

    Navigate to `http://localhost:8080/grade` to see a list of all grades. Click "Update" next to a grade to edit it.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License.

