# ApnaStay

**ApnaStay** is your trusted companion for finding the perfect accommodations, whether you're traveling for leisure, work, or a quick getaway. We bring you an array of options, from cozy homestays to luxurious hotels, ensuring every stay feels like home. With a focus on affordability, comfort, and convenience, ApnaStay is here to make your travel experiences seamless and memorable. Wherever you go, make it "Apna" (yours)!

## Features

- **User Management:**  
  - Register, login, and manage user profiles.
  - Admins can view and delete users.
  - Users can view their booking history.

- **Room Management:**  
  - Add, update, delete, and view rooms (admin).
  - View all available rooms and filter by date/type.
  - Upload room photos and manage room details.

- **Booking System:**  
  - Book rooms for specific dates.
  - View all bookings (admin).
  - Cancel bookings.

- **Authentication & Security:**  
  - JWT-based authentication.
  - Role-based access control (Admin/User).

- **API-driven:**  
  - RESTful endpoints for all operations.

## Tech Stack

- **Backend:** Java 17, Spring Boot 3.4.1
- **Database:** MySQL (via JPA/Hibernate)
- **Security:** Spring Security, JWT
- **Build Tool:** Maven
- **Cloud Storage:** AWS S3 (for room photos)
- **Testing:** Spring Boot Test, Spring Security Test

## Getting Started

### Prerequisites

- Java 17+
- Maven
- MySQL

### Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/apnastay_backend.git
   cd apnastay_backend
   ```

2. **Configure the database:**  
   Update your `application.properties` (in `src/main/resources/`) with your MySQL credentials and database URL.

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

### API Overview

#### Authentication

- `POST /auth/register` — Register a new user
- `POST /auth/login` — Login and receive JWT

#### Users

- `GET /users/all` — List all users (admin)
- `GET /users/get-by-id/{userId}` — Get user by ID
- `DELETE /users/delete/{userId}` — Delete user (admin)
- `GET /users/get-logged-in-profile-info` — Get logged-in user's profile
- `GET /users/get-user-bookings/{userId}` — Get user's booking history

#### Rooms

- `POST /rooms/add` — Add new room (admin)
- `GET /rooms/all` — List all rooms
- `GET /rooms/types` — List all room types
- `GET /rooms/room-by-id/{roomId}` — Get room by ID
- `GET /rooms/all-available-rooms` — List all available rooms
- `GET /rooms/available-rooms-by-date-and-type` — Filter available rooms
- `PUT /rooms/update/{roomId}` — Update room (admin)
- `DELETE /rooms/delete/{roomId}` — Delete room (admin)

#### Bookings

- `POST /bookings/book-room/{roomId}/{userId}` — Book a room
- `GET /bookings/all` — List all bookings (admin)
- `GET /bookings/get-by-confirmation-code/{confirmationCode}` — Get booking by confirmation code
- `DELETE /bookings/cancel/{bookingId}` — Cancel a booking

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is for demonstration and educational purposes.
