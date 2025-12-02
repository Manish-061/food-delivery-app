# 🍔 Food Delivery Application

A full-stack food delivery application built with **Spring Boot** backend, **React** for both Admin and Customer panels, and **MongoDB** database. The application provides a complete ecosystem for managing food items, orders, and administrative tasks, as well as a seamless ordering experience for customers.

## 📋 Table of Contents
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation & Setup](#-installation--setup)
- [Environment Configuration](#-environment-configuration)
- [Running the Application](#-running-the-application)
- [API Documentation](#-api-documentation)
- [Screenshots](#-screenshots)
- [Contributing](#-contributing)
- [License](#-license)

## ✨ Features

### Customer Panel Features
- 🛍️ **Browse Food**: Explore a variety of food items with categories
- 🛒 **Cart Management**: Add items to cart, adjust quantities
- 💳 **Secure Checkout**: Integrated payment gateway (Razorpay)
- 📦 **Order Tracking**: View order status and history
- 🔐 **Authentication**: Secure Login and Signup functionality
- 📱 **Responsive UI**: Optimized for mobile and desktop

### Admin Panel Features
- 📝 **Food Management**: Add, edit, and delete food items
- 📋 **Order Management**: View and update order status (Processing, Out for Delivery, Delivered)
- 📊 **Dashboard**: Overview of business metrics
- 🖼️ **Image Upload**: Upload food images to AWS S3
- 🔐 **Secure Access**: Protected admin routes

### Backend API Features
- 🔐 **RESTful API**: Well-structured REST endpoints
- 🛡️ **Security**: JWT-based authentication and authorization
- 📦 **MongoDB Integration**: NoSQL database for scalability
- ☁️ **AWS S3 Integration**: Cloud storage for images
- 💸 **Payment Integration**: Razorpay payment gateway support
- ✅ **Data Validation**: Request validation and error handling
- 🚀 **Spring Boot**: Modern Java framework

## 🛠️ Tech Stack

### Backend (foodiesapi)
- **Framework**: Spring Boot 3.4.7
- **Language**: Java 21
- **Database**: MongoDB
- **Cloud Storage**: AWS S3
- **Security**: Spring Security, JWT
- **Payments**: Razorpay
- **Build Tool**: Maven
- **Additional**: Lombok, Spring Data MongoDB, Spring Validation

### Frontend (adminpanel & customerpanel)
- **Framework**: React 19.1.0
- **Build Tool**: Vite 7.0.4
- **UI Framework**: Bootstrap 5.3.8
- **Icons**: Bootstrap Icons
- **HTTP Client**: Axios
- **Routing**: React Router DOM
- **Notifications**: React Toastify

## 📁 Project Structure

```
Food_Delivery_Application/
├── 📂 foodiesapi/                 # Spring Boot Backend API
│   ├── 📂 src/main/java/in/manish/foodiesapi/
│   │   ├── 📂 config/             # Security & App Config
│   │   ├── 📂 controller/         # REST Controllers
│   │   ├── 📂 entity/             # Database entities
│   │   ├── 📂 io/                 # Request/Response DTOs
│   │   ├── 📂 repository/         # Data repositories
│   │   └── 📂 service/            # Business logic
│   ├── 📂 src/main/resources/     # Application properties
│   └── 📄 pom.xml                 # Maven dependencies
├── 📂 adminpanel/                 # React Admin Dashboard
│   ├── 📂 src/
│   │   ├── 📂 assets/             # Images and static files
│   │   ├── 📂 components/         # Reusable components
│   │   ├── 📂 pages/              # Admin pages (Add Food, List Orders)
│   │   └── 📂 services/           # API service functions
│   ├── 📄 package.json            # NPM dependencies
│   └── 📄 vite.config.js          # Vite configuration
├── 📂 customerpanel/              # React Customer App
│   ├── 📂 src/
│   │   ├── 📂 assets/             # Images and static files
│   │   ├── 📂 components/         # Reusable components
│   │   ├── 📂 pages/              # Customer pages (Home, Cart, Place Order)
│   │   └── 📂 context/            # Global state (StoreContext)
│   ├── 📄 package.json            # NPM dependencies
│   └── 📄 vite.config.js          # Vite configuration
└── 📄 README.md                   # Project documentation
```

## 📋 Prerequisites

Before running this application, make sure you have the following installed:

- **Java 21** or higher
- **Node.js 18** or higher
- **MongoDB** (local or cloud instance)
- **Maven 3.6** or higher
- **AWS Account** (for S3 storage)
- **Razorpay Account** (for payments)

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/Manish-061/food-delivery-app.git
```

### 2. Backend Setup (foodiesapi)

```bash
# Navigate to backend directory
cd foodiesapi

# Install dependencies
mvn clean install
```

### 3. Frontend Setup

**Admin Panel:**
```bash
# Navigate to admin panel directory
cd adminpanel

# Install dependencies
npm install
```

**Customer Panel:**
```bash
# Navigate to customer panel directory
cd ../customerpanel

# Install dependencies
npm install
```

## ⚙️ Environment Configuration

### Backend Configuration

Update `src/main/resources/application.properties` or set environment variables:

```properties
# MongoDB Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/foodies

# AWS S3 Configuration
aws.access.key=${AWS_ACCESS_KEY}
aws.secret.key=${AWS_SECRET_KEY}
aws.region=ap-south-1
aws.s3.bucketname=foodies-food-manish

# Razorpay Configuration
razorpay.key.id=${RAZORPAY_KEY_ID}
razorpay.key.secret=${RAZORPAY_KEY_SECRET}

# JWT Configuration
jwt.secret=${JWT_SECRET}
```

### Environment Variables

Set the following environment variables in your system or IDE:

```bash
# Windows (PowerShell)
$env:AWS_ACCESS_KEY="your-aws-access-key"
$env:AWS_SECRET_KEY="your-aws-secret-key"
$env:RAZORPAY_KEY_ID="your-razorpay-key-id"
$env:RAZORPAY_KEY_SECRET="your-razorpay-key-secret"
$env:JWT_SECRET="your-secure-jwt-secret"
```

## 🏃‍♂️ Running the Application

### 1. Start Backend Server

```bash
cd foodiesapi
mvn spring-boot:run
```
The backend will start on `http://localhost:8080`

### 2. Start Admin Panel

```bash
cd adminpanel
npm run dev
```
The admin panel will typically start on `http://localhost:5173`

### 3. Start Customer Panel

```bash
cd customerpanel
npm run dev
```
The customer panel will typically start on `http://localhost:5174` (or the next available port)

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api
```

### Key Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| **Auth** | | |
| POST | `/api/users/register` | Register new user |
| POST | `/api/users/login` | User login |
| **Food** | | |
| GET | `/api/foods` | Get all food items |
| POST | `/api/foods` | Add new food item (Admin) |
| DELETE | `/api/foods/{id}` | Delete food item (Admin) |
| **Cart** | | |
| POST | `/api/cart/add` | Add item to cart |
| POST | `/api/cart/remove` | Remove item from cart |
| POST | `/api/cart/get` | Get user cart |
| **Order** | | |
| POST | `/api/order/place` | Place new order |
| POST | `/api/order/verify` | Verify payment |
| GET | `/api/order/userorders` | Get user order history |
| GET | `/api/order/list` | Get all orders (Admin) |
| POST | `/api/order/status` | Update order status (Admin) |

## 🎯 Usage Guide

### Customer Journey
1. **Sign Up/Login**: Create an account to start ordering.
2. **Browse**: Explore the menu and filter by categories.
3. **Add to Cart**: Select items and manage quantities in the cart.
4. **Checkout**: Enter delivery details and proceed to payment.
5. **Track**: Monitor the status of your order in "My Orders".

### Admin Journey
1. **Login**: Access the admin dashboard.
2. **Manage Menu**: Add new dishes with images, descriptions, and prices.
3. **Process Orders**: View incoming orders and update their status (e.g., from "Processing" to "Out for Delivery").

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Manish**
- GitHub: [@Manish-061](https://github.com/Manish-061)
- LinkedIn: [Manish Kumar](www.linkedin.com/in/09-2003-manish)

## 🙏 Acknowledgments

- Spring Boot & React Communities
- MongoDB
- AWS & Razorpay
