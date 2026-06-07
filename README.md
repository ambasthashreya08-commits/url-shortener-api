# URL Shortener API

A simple URL Shortener built using Spring Boot and Java. This project allows users to generate short URLs for long links and redirect users back to the original URL using the generated short code.

## Features

* Generate short URLs for long links
* Redirect users to the original URL
* REST API based implementation
* Random short code generation using UUID
* In-memory URL storage using HashMap
* Lightweight and easy to run

## Tech Stack

(Spring Boot + Maven)
* Java 25
* Spring Boot
* Maven
* REST APIs
* Embedded Tomcat Server

## Project Structure

```text
src/
 ├── main/
 │    ├── java/
 │    │     └── urlshortener/
 │    │            ├── UrlshortenerApplication.java
 │    │            └── UrlController.java
 │    └── resources/
 └── test/
```

## API Endpoints

### Home Endpoint

```http
GET /
```

Response:

```text
URL Shortener is running!
```

### Generate Short URL

```http
GET /shorten?url=https://google.com
```

Example Response:

```text
http://localhost:8080/8dea66
```

### Redirect to Original URL

```http
GET /8dea66
```

Automatically redirects to:

```text
https://google.com
```

## Running the Application

Clone the repository:

```bash
git clone https://github.com/ambasthashreya08-commits/url-shortener-api.git
cd url-shortener-api
```

Run using Maven Wrapper:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

## Sample Workflow

1. Start the application.
2. Open:

```text
http://localhost:8080/shorten?url=https://google.com
```

3. Copy the generated short URL.
4. Open the short URL in a browser.
5. The application redirects to the original website.

## Future Enhancements

* Database integration (MySQL/PostgreSQL)
* Custom short codes
* URL expiration
* Click analytics
* User authentication
* QR code generation

## Author

Shreya Ambastha
