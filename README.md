# JHipster Lab

Welcome to the **JHipster Lab** project! This repository demonstrates the development of a microservices-based architecture generated with **JHipster**. The project includes:
- Two microservices: `ms1` and `ms2`
- A gateway for API management and routing

## Table of Contents

- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Project Structure](#project-structure)
- [Running the Application](#running-the-application)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

This project leverages the following technologies:

- [JHipster](https://www.jhipster.tech/): A development platform to generate, develop, and deploy Spring Boot + Angular/React/Vue applications.
- [Spring Boot](https://spring.io/projects/spring-boot): Backend framework for microservices.
- [MariaDB](https://mariadb.org/): Database system.
- [Docker](https://www.docker.com/): Containerization platform for consistent environment setup.
- [Maven](https://maven.apache.org/): Build automation tool for Java projects.

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 17 or higher
- Node.js (v16 or higher)
- Docker & Docker Compose
- Maven
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Olacgk/Jhipster-Lab.git
   ```

2. Install dependencies:
   ```bash
   ./mvnw install
   ```

3. Start the services using Docker Compose:
   ```bash
   mvn -Pdev
   ```

## Project Structure

The project is organized as follows:

- **gateway/**: The API gateway for routing and authentication.
- **ms1/**: First microservice with its own domain logic.
- **ms2/**: Second microservice with its own domain logic.
- **README.md**: This documentation file.

## Running the Application

1. Start the Docker containers keycloak and jhipster-registry:
   ```bash
   docker-compose -f .\src\main\docker\jhipster-registry.yml up -d
   ```
    ```bash
   docker-compose -f .\src\main\docker\keycloak.yml up -d
   ```

2. Start a microservice or the gateway
  - in dev mode
  ```bash
   mvn -Pdev
   ```
  - in prod mode
  ```bash
   mvn -Pprod
   ```

3. Access the gateway:
   - Open your browser and go to: [http://localhost:9090](http://localhost:9090)

4. Test the microservices:
   - Microservice 1: [http://localhost:9091](http://localhost:9091)
   - Microservice 2: [http://localhost:9092](http://localhost:9092)


## Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Create a pull request.


---
