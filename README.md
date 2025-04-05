# Blog Portfolio Backend Service

This repository contains the backend service for the [Blog Portfolio](https://johnathankhoa.retool.com/apps/blogPortfolio) application. The frontend was created using **Retool web builder**, enabling rapid development for applications requiring **user accounts**, **roles**, **permissions**, and **authentication**.

## Live Demo & Access
- **Guest Credentials**: Available at [RabbitMQ Demo Page](https://www.jkn95.dev/demos/rabbitmq)
- **Access Request**: Contact for permissions to explore the application further.

---

## Features

### Frontend Integration
- Built with **Retool**, enabling dynamic query execution and seamless controller mapping to frontend UI components.

### Full-Stack Microservices Architecture
- Scalable backend designed to allow **create**, **view**, **modify**, and **delete** operations based on **user roles** and **permissions**.

---

### Backend Architecture

#### **Spring Boot Application**
- **Platform**: Elastic Beanstalk (Corretto 21 on 64-bit Amazon Linux 2023/4.4.2)
- **Deployment Configuration**:
  - Service role and EC2 instance profile for environment management.
  - EC2 key pair for secure instance access.
  - Customizable capacity and scaling options.
  - Security groups to control traffic flow.

#### **Database**
- **MySQL Community Engine**:
  - Hosted on **AWS RDS** and monitored with **CloudWatch** (logging health metrics, CPU usage, and database connections).
  - Snapshots and backups stored securely on **AWS S3** for easy restoration and instance creation.

#### **Tech Stack**
- **Backend**:
  - Java, Spring Framework, Maven
  - REST API, JPA, JDBC, Hibernate
  - Jakarta, Lombok

- **Cloud Services**:
  - AWS Elastic Beanstalk, EC2, RDS, S3

---

## Visual Overview

### Frontend Integration in Retool:
![Frontend Example](https://github.com/user-attachments/assets/5fde1aa8-db69-48fb-9def-5cd66b70eb63)

### Application Workflow:
![Workflow Example](https://github.com/user-attachments/assets/d3f4acd8-7b3e-457c-8c53-1e1a71f0a1cf)

### Scalable Architecture:
![Microservice Example](https://github.com/user-attachments/assets/91cfdc93-fcde-47a4-99ac-8905739b07ec)

### Spring Boot Deployment:
![Tomcat Instance](https://github.com/user-attachments/assets/397ba452-e0ec-4474-8170-6388a098318a)

### Security and Configuration:
![Configuration Example](https://github.com/user-attachments/assets/b61ef82f-63a9-4ff9-a101-8b0b0d82901a)

### RDS Monitoring:
![Database Monitoring](https://github.com/user-attachments/assets/4d735014-799e-44b1-91bb-c4bd6d690512)

### Snapshot Backup:
![Backup Example](https://github.com/user-attachments/assets/97f3aa15-6809-411e-b2fb-161dce00fd64)

---

This updated version organizes content logically, highlights features clearly, and ensures the tech stack and architecture stand out for recruiters. Let me know if you'd like additional refinements!
