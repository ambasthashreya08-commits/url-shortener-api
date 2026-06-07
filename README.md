# 🔗 URL Shortener API

<div align="center">

![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-success?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-red?style=for-the-badge&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)

### ⚡ Fast URL Shortening & Redirection Service

Generate short URLs and redirect users to the original destination using a lightweight Spring Boot backend.

</div>

---

# 🎯 Project Overview

URL Shortener API is a backend application built using Spring Boot that converts long URLs into short, shareable links.

The application supports:

✅ URL shortening

✅ URL redirection

✅ Statistics tracking

✅ REST API architecture

✅ Fast in-memory storage

---

# ✨ Features

| Feature | Description |
|----------|-------------|
| 🔗 Shorten URLs | Convert long URLs into short codes |
| ↪ Redirect URLs | Redirect users to original links |
| 📊 Statistics | View total shortened URLs |
| ⚡ Fast Access | HashMap-based storage |
| 🌐 REST APIs | Built using Spring Boot |
| 🚀 Lightweight | Embedded Tomcat Server |

---

# 🏗️ Tech Stack

```text
Backend
├── Java
├── Spring Boot
├── Maven
└── Embedded Tomcat

Storage
└── HashMap (In-Memory)
```

---

# 📂 Project Structure

```text
url-shortener-api
│
├── src
│   ├── main
│   │   ├── java
│   │   │    └── urlshortener
│   │   │         ├── UrlshortenerApplication.java
│   │   │         └── UrlController.java
│   │   └── resources
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

# ⚙️ Run Application

```bash
mvnw.cmd spring-boot:run
```

Application runs at:

```text
http://localhost:8080
```

---

# 🔄 API Workflow

```text
Long URL
    │
    ▼
Generate Short Code
    │
    ▼
Store Mapping
    │
    ▼
Short URL Created
    │
    ▼
User Accesses Short URL
    │
    ▼
Automatic Redirect
```

---

# 🌐 API Endpoints

### Home

```http
GET /
```

Response:

```text
URL Shortener is running!
```

---

### Generate Short URL

```http
GET /shorten?url=https://google.com
```

Response:

```text
http://localhost:8080/a1b2c3
```

---

### Statistics

```http
GET /stats
```

Response:

```text
Total URLs shortened: 10
```

---

# 📸 Screenshots

### API Running

<img src="assets/home.png" width="900">

---

### URL Generation

<img src="assets/shorten.png" width="900">

---

### Statistics Endpoint

<img src="assets/stats.png" width="900">

---

# 🚀 Future Enhancements

- MySQL Integration
- User Authentication
- Custom Short Codes
- QR Code Generation
- Click Analytics Dashboard

---

# 🧠 Learning Outcomes

- Spring Boot Development
- REST API Design
- Maven Build Management
- Backend Development
- URL Redirection Logic

---

<div align="center">

### 🚀 Built with Spring Boot & Java

</div>
