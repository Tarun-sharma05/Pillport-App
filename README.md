# Pillport App Ecosystem

The Pillport App is a comprehensive Pharmacy Management System comprising a set of native Android applications for customers and administrators, powered by a Python Flask REST API backend using SQLite.

## Project Structure

This repository contains three main components:
1. **PillPort** (Customer Android App)
2. **Pillport_Admin** (Admin Android App)
3. **pillport_Backand** (Python Flask Backend)

---

### 1. PillPort (Customer App)
A native Android application built for users to browse products, manage their orders, and engage with the pharmacy system.
- **Language**: Kotlin
- **UI Toolkit**: Jetpack Compose (`Material 3`)
- **Architecture & DI**: Dagger Hilt
- **Networking**: Retrofit2 & OkHttp (Gson for parsing)
- **Image Loading**: Coil
- **Local Storage**: DataStore Preferences
- **Mapping & Location**: Google Maps Compose, Google Places SDK, Play Services Location
- **Minimum SDK**: 27
- **Target SDK**: 36

### 2. Pillport_Admin (Admin App)
A native Android application designed for pharmacy administrators to manage products, categories, orders, and user stock.
- **Language**: Kotlin
- **UI Toolkit**: Jetpack Compose (`Material 3`)
- **Architecture & DI**: Dagger Hilt
- **Networking**: Retrofit2
- **Image Loading**: Coil
- **Local Storage**: DataStore Preferences
- **Minimum SDK**: 27
- **Target SDK**: 35

### 3. pillport_Backand (Flask API Backend)
A lightweight REST API managing the primary business logic, database operations, and authentication.
- **Framework**: Python / Flask
- **Database**: SQLite (`pharma.db`)
- **Key Modules**:
  - `userAuthentication`: User signup/login logic.
  - `addOperation`, `updateOperation`, `getOperation`: CRUD operations for orders, products, and users.
  - `createTableOperation`: Automated mapping and DB initialization.

#### API Endpoints Overview
- **Authentication**: `/signup`, `/login`, `/updatepassword`, `/updateuserprofile`
- **Products**: `/allproducts`, `/addproduct`, `/addproductcategory`, `/allproductcategory`
- **Orders**: `/addorder`, `/allorders`, `/approveorder`
- **User & Stock Management**: `/allusers`, `/userinfo`, `/userstock`, `/allusersstockproducts`

---

## Setup & Run Instructions

### Backend (Flask API)
1. Navigate to the backend directory:
   ```bash
   cd pillport_Backand
   ```
2. Install dependencies (e.g., Flask) if not already installed.
3. Run the server:
   ```bash
   python main.py
   ```
   *Note: Upon first run, the SQLite database table architecture will be generated automatically at `pharma.db`.*

### Android Apps (PillPort & Pillport_Admin)
1. Open the respective folder (`PillPort` or `Pillport_Admin`) in Android Studio.
2. Synchronize Gradle files.
3. Make sure to update the Base URL in your Retrofit network configuration to point to your running Flask server's IP address.
4. Build and Run on your emulator or physical Android device.
