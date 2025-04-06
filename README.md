# dRoute-eureka-server

## Overview
The `dRoute-eureka-server` is a service discovery server for the dRoute project. It enables microservices to register themselves and discover other services dynamically, ensuring seamless communication in a distributed system.

## Features
- Centralized service registry for microservices.
- Dynamic service discovery.
- High availability and fault tolerance.
- Support for multiple environments (e.g., development, staging, production).

## Prerequisites
- Java 17 or higher
- Spring Boot 3.x
- Maven 3.8+ or Gradle 7.x+

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/dRoute-eureka-server.git
   cd dRoute-eureka-server
   ```

2. **Create and configure the `.env` file**:  
   Before running the project, you must create a `.env` file in the root directory. Without the `.env` file, the project will not run. Below is an example of the `.env` file:
   ```properties
   # Cloud Config Server URL
   DROUTE_CLOUD_CONFIG_SERVER_URL=http://localhost:8888
   ```

   Ensure the `.env` file is added to `.gitignore` to prevent sensitive information from being committed to the repository.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the server:
   ```bash
   java -jar target/dRoute-eureka-server.jar
   ```

5. Access the Eureka dashboard at `http://localhost:8761`.

## Using the `.env` File
- The `.env` file is used to store environment-specific variables securely.
- The application will automatically load variables from the `.env` file if properly configured.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the dRoute License. See the `LICENSE` file for details.