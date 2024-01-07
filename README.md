# Farmers-online-shopping-using-E-Digital-Marketing
web development for Online Vegetable Sales Application With FrontEnd
1.We have developed this web development for an Online Vegetable Sales Application.
2.This website performs all the fundamental CRUD operations of any Online Vegetable Sales Application with user validation at every step.
3.This project is developed by team of 3 Back-end Developers during project week in Masai School.


Tech Stack:

1.Java

2.python

3.spring Boots

4.HTML

5.CSS

6.Javascript

7.MySQL

8.Swagger

Modules:

1.Login, Logout Module

2.User Module

3.Admin Module

Features:

1.User and Admin authentication & validation with JWT Authentication.

2.Admin Features:

Administrator Role of the entire application
Only registered admins with valid Authentication token can add/update/delete customer from main database
Admin can access the details of different User/Customers .

3.User Features:

A user can register himself or herself on the platform.
He/She can check the Buy Vegetable ,Placed order Makes payment and Many more Functionality.


Contributors:

@Rohan Mahangare

@Vivek Gupta

@Niharika Pandey


ER Diagram:

Installation & Run
Before running the website, you should update the database config inside the application.properties file.
Update the port number, username and password as per your local database config.

    server.port=8088

    spring.datasource.url=jdbc:mysql://localhost:3306/salesApp
    
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    
    spring.datasource.username=SQLUsername(i.e=root)
    
    spring.datasource.password=SQLUserPassword(i.e=root)

website Root Endpoint

https://localhost:8088/

http://localhost:8088/swagger-ui/

website Endpoints
Login Module
POST //api/adminlogin : Admin can login with Email and password provided at the time of registation


