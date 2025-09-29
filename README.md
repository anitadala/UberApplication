Description 

UberApplication is a monolithic backend built with Java Spring Boot. It includes modules for users, drivers, rides, fare calculation, payments, and admin. All features are deployed as a single unit, making it ideal for learning layered architecture, backend flows, and monolith vs microservices trade-offs.
🚖 UberApplication

UberApplication is a monolithic backend project built with Java + Spring Boot, designed to simulate the core functionalities of a ride-hailing platform. All modules are tightly integrated into a single deployable unit, making it easier to understand application flow in a traditional architecture.

🛠️ Tech Stack

Backend: Java, Spring Boot

Database: MySQL / PostgreSQL

Build & Deploy: Maven 

🚀 Features

User Module – Manage rider and driver accounts.

Ride Module – Request, assign, and complete rides.

Fare Calculation – Compute fare based on distance & time.

Payment Handling – Process basic ride payments.

Admin Module – Monitor users, drivers, and rides.

📂 Project Structure
/UberApplication
│── src/main/java/...   # Controllers, Services, Models, Repositories
│── src/main/resources  # Application configs
│── pom.xml 

🎯 Why Monolithic?

This project follows a monolithic architecture, bundling all modules (user, ride, payment, admin) into one application. It is ideal for:

Practicing Spring Boot layered design (Controller → Service → Repository).

Learning end-to-end backend flows.

Understanding monolith vs. microservices trade-offs.

📌 Use Cases

Learning project for backend developers.

Demonstration of ride-hailing backend logic.

Base for future migration into microservices.
