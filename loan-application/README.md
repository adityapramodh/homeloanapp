# Loan Application Project

This is a full-stack web application designed for processing home loan applications.

## Technology Stack
- Frontend: React.js
- Backend: Spring Boot
- Database: MySQL

## Prerequisites
- Java 8 or above
- Node.js and npm
- MySQL

## Running the Application

1. **Backend**

   Navigate to the root directory of the backend project (where the `pom.xml` file is located) and run the following command to start the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

   The backend server will start on `http://localhost:8080`.

2. **Frontend**

   Navigate to the root directory of the frontend project (where the `package.json` file is located) and install the necessary npm packages using:

    ```bash
    npm install
    ```

   After the installation is complete, start the React application with:

    ```bash
    npm start
    ```

   The frontend server will start on `http://localhost:3000`.

3. **MySQL**

   Make sure your MySQL server is running. Update the `spring.datasource.url`, `spring.datasource.username` and `spring.datasource.password` properties in the `application.properties` file of the Spring Boot application with your MySQL server's URL, username, and password.

## Usage

- Open your web browser and navigate to `http://localhost:3000` to access the application.
- Fill in the form with the required details and click 'Submit' to apply for a loan.
- The applications will appear as cards on the page.
- You can delete an application by clicking on the 'X' button on the top right of each card.

## Note

Please ensure both the frontend and backend servers are running to use the application successfully.