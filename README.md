OAuth secured, use demo credentials or request me for access

Backend service for [https://johnathankhoa.retool.com/app/blogportfolio/Home](https://johnathankhoa.retool.com/apps/blogPortfolio)

This is an example full-stack application running on AWS Cloud

Spring Boot Java Tomcat Webservlet instance deployed on Elastic Beanstalk (Platform Corretto 21 running on 64bit Amazon Linux 2023/4.4.2)

For controlling service access, configure the service role and EC2 instance profile on AWS that Elastic Beanstalk uses to manage your environment. Choose an EC2 key pair to securely log in to your EC2 instances.

The capacity and scaling for the environment’s instances are customizable and also provide security groups to control instance traffic.

MySQL Community engine DB instance deployed on RDS/EC2, monitored with Cloudwatch, logging health, cpu usage, database connections

Snapshots and backups stored on S3, use this to restore or create new DB instances

Frontend created with Retool we builder, for fast startup on applications that require user accounts, user roles, permissions, and oauthentication. 

Tech Stack:

Java, Spring Framework, Maven, HTTP, REST API, JPA, JDBC, Hibernate, SQL Datasource, Jakarta, Lombok

AWS Elastic Beanstalk, EC2, RDS, S3

Retool, JavaScript, TypeScript

Linux, Windows

IntelliJ IDEA, VSCode
