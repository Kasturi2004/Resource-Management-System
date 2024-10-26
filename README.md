# Resource Management System

## Project Overview

The Resource Management System is a desktop application built to facilitate the booking and management of seats and meeting rooms in a five-floor office building. Each floor has 20 seats and 2 meeting rooms, with two available time slots. The application is designed with separate interfaces for employees and managers, ensuring smooth resource allocation and booking.

The project is developed using **NetBeans** for the frontend and **MySQL** for the backend.

## Features

1. **User Registration & Authentication**  
   - Secure registration and login functionality for employees and managers.

2. **Seat Booking (Employee Interface)**  
   - Employees can book seats on specific floors for designated time slots.
   - Slot times:
     - Morning: 9:00 AM - 12:00 PM
     - Afternoon: 1:30 PM - 5:00 PM
   - Employees need to specify details such as:
     - Name, Email, Description, Requirements, Date of booking, Slot time, Floor No.
   - System checks seat availability and allots based on the specified floor. If no seats are available, a message prompts the user to select another floor or time slot.

3. **Meeting Room Booking (Manager Interface)**  
   - Managers can reserve meeting rooms on floors.
   - Required details include:
     - Name, Employee Email IDs, Description, Requirements, Date of booking, Slot time, and Room No.
   - System checks meeting room availability, guiding managers to select an alternate slot if the room is fully booked.

4. **Real-time Availability**  
   - The system updates seat and room availability, providing instant feedback to users on available resources for selected floors and slots.

## Technology Stack

- **Frontend**: Java Swing (NetBeans IDE)
- **Backend**: MySQL
- **Database**: Database `kasturi` with tables `logins` (for user data) and `bookedSeats` (for seat and room booking data)

## Database Schema

### Table: `logins`
Stores login information of employees and managers.
- **Fields**:
  - `user_id`: INT, Primary Key
  - `username`: VARCHAR
  - `password`: VARCHAR

### Table: `bookedSeats`
Records booking details for seats and meeting rooms.
- **Fields**:
  - `booking_id`: INT, Primary Key
  - `name`: VARCHAR
  - `email`: VARCHAR
  - `description`: TEXT
  - `requirements`: TEXT
  - `date_of_booking`: DATE
  - `slot_time`: VARCHAR (e.g., "9:00 AM - 12:00 PM" or "1:30 PM - 5:00 PM")
  - `floor_no`: INT
  - `room_no`: INT (for meeting rooms only)
  - `type`: ENUM ('seat', 'meeting_room') 

## Getting Started

### Prerequisites

- **Java**: Ensure JDK 8 or above is installed.
- **NetBeans IDE**: Install the latest version of NetBeans for developing and running the project.
- **MySQL**: Set up a MySQL database and create the `database_name` database with the required tables.

### Setup Instructions

1. **Clone the Repository**  
   Clone the repository to your local machine.

2. **Database Configuration**  
   Set up the `database_name` database in MySQL, and create the necessary tables (`logins` and `bookedSeats`) as described in the schema.

3. **Connect Database**  
   Configure the MySQL connection in NetBeans to link the application to the `database_name` database.

4. **Run the Application**  
   Open the project in NetBeans and run the main file. 

5. **User Guide**  
   - **Employee GUI**: `Employee.java` for seat booking
   - **Manager GUI**: `Manager.java` for meeting room booking

## Future Improvements

- Adding notification or reminder emails for upcoming bookings.
- Expanding the time slots or adding custom slot durations.
- Enhancing the UI for a more intuitive booking experience.

## Installation Instructions

To run this project in NetBeans, you need to configure the MySQL connector JAR to enable the Java-MySQL connection.

### Step 1: Download MySQL Connector JAR

1. Go to the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/).
2. Download the MySQL Connector/J JAR file (e.g., `mysql-connector-java-8.0.x.jar`).

### Step 2: Add JAR File to NetBeans Project

1. **Open NetBeans** and open the project.
2. In the **Projects** tab, **right-click** on your project and select **Properties**.
3. Go to **Libraries** in the left menu.
4. Click on **Add JAR/Folder** and navigate to where you downloaded the MySQL Connector JAR file.
5. Select the JAR file and click **Open**.
6. Click **OK** to confirm and add the JAR to your project’s classpath.

### Step 3: Configure Database Connection in Code

Ensure your database connection details are correctly configured in the code. Typically, this involves updating the database URL, username, and password in your database connection code.

Example database connection setup:
```java
String url = "jdbc:mysql://localhost:3306/kasturi"; // Replace 'localhost' and 'kasturi' if needed
String user = "your-username";
String password = "your-password";

Connection conn = DriverManager.getConnection(url, user, password);
```

### Step 4: Run the Project

1. In NetBeans, select the main class (usually containing the `main` method).
2. Click **Run > Run Project** or press `F6`.
3. The application should connect to the database and allow you to start booking resources.

---
## License

This project is for educational purposes and is not licensed for commercial use.  

This README provides a structured overview and setup instructions for your project, making it easy for users to understand and get started. Let me know if you need additional sections or more details!
