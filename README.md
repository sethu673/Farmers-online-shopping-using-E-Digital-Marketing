# Farmers-online-shopping-using-E-Digital-Marketing

web development for Online Vegetable Sales Application With FrontEnd

1.We have developed this web development for an Online Vegetable Sales Application.

2.This website performs all the fundamental CRUD operations of any Online Vegetable Sales Application with user validation at every step.

3.This project is developed by team of 3 Back-end Developers during project week in Masai School.


Tech Stack:

1.Java

2.spring Boots

3.HTML

4.CSS

5.Javascript

6.MySQL


Modules:

1.Home Page: Introduction, featured products, navigation links.

2.Login/Register Page: User authentication.

3.Product Listing Page: Display products with filtering and sorting options.

4.Product Details Page: Detailed view of a selected product.

5.Cart Page: Display products added to the cart.

6.Checkout Page: Form for entering shipping details and placing an order.


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

@thanush Kumar

@Dinesh Kumar

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

http://localhost:8088/farmers_online_shopping/

website Endpoints
Login Module
POST //api/adminlogin : Admin can login with Email and password provided at the time of registation


