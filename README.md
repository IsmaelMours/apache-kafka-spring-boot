# Spring Kafka App

Spring Kafka App is a sample application that demonstrates the integration of Spring Boot with Apache Kafka for building scalable and distributed messaging systems.

## Features

- **Producer:** Send messages to Kafka topics.
- **Consumer:** Consume messages from Kafka topics.
- **Integration:** Demonstrate Spring Kafka integration for both producing and consuming messages.
- **Scalability:** Illustrate the scalability benefits of using Apache Kafka.

## Getting Started

Follow these steps to get the Spring Kafka App up and running on your local machine.

### Prerequisites

- [Java](https://www.oracle.com/java/) installed.
- [Apache Kafka](https://kafka.apache.org/) installed and running.

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/spring-kafka-app.git
    ```

2. Navigate to the project directory:

    ```bash
    cd spring-kafka-app
    ```

3. Open `application.properties` and configure your Kafka broker details:

    ```properties
    spring.kafka.bootstrap-servers=your_kafka_broker_address
    ```

4. Start the Spring Boot application:

    ```bash
    ./mvnw spring-boot:run
    ```

## Usage

1. Run the Spring Kafka App.
2. Use the provided API or the configured Kafka Producer to send messages to Kafka topics.
3. Observe the consumption of messages by the Kafka Consumer in the application logs.

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Apache Kafka](https://kafka.apache.org/)

## Contributing

Feel free to contribute to the development of Spring Kafka App. Please follow the [contribution guidelines](CONTRIBUTING.md) for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Hat tip to anyone whose code was used.
- Inspiration.
- etc.

Happy messaging with Kafka!
