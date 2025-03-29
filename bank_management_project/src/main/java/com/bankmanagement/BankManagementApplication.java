
package com.bankmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankManagementApplication.class, args);
    }
}




/*-- Create Database
CREATE DATABASE bankdb;
USE bankdb;

-- Users Table
CREATE TABLE users (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) UNIQUE NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
password VARCHAR(255) NOT NULL,
role ENUM('USER', 'ADMIN') DEFAULT 'USER',
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

        -- OAuth Users Table (for Google/GitHub login)
CREATE TABLE oauth_users (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        provider VARCHAR(50) NOT NULL,
provider_id VARCHAR(100) NOT NULL UNIQUE,
email VARCHAR(100) NOT NULL UNIQUE,
name VARCHAR(100),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

        -- Accounts Table
CREATE TABLE accounts (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        user_id BIGINT NOT NULL,
        account_number VARCHAR(20) UNIQUE NOT NULL,
balance DECIMAL(15,2) NOT NULL DEFAULT 0.00,
account_type ENUM('SAVINGS', 'CURRENT') NOT NULL,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

        -- Transactions Table
CREATE TABLE transactions (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        account_id BIGINT NOT NULL,
        transaction_type ENUM('DEPOSIT', 'WITHDRAW', 'TRANSFER') NOT NULL,
amount DECIMAL(15,2) NOT NULL,
timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (account_id) REFERENCES accounts(id) ON DELETE CASCADE
);

        -- Loan Table
CREATE TABLE loans (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        user_id BIGINT NOT NULL,
        amount DECIMAL(15,2) NOT NULL,
interest_rate DECIMAL(5,2) NOT NULL,
tenure INT NOT NULL, -- in months
status ENUM('PENDING', 'APPROVED', 'REJECTED') DEFAULT 'PENDING',
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

        -- Admin Users
INSERT INTO users (username, email, password, role)
VALUES ('admin', 'admin@bank.com', '$2a$10$abcdef1234567890', 'ADMIN');

-- Sample User
INSERT INTO users (username, email, password, role)
VALUES ('john_doe', 'john@example.com', '$2a$10$abcdef1234567890', 'USER');
INSERT INTO users (username, email, password, role)
VALUES ('Rajasekhar', 'konetirajasekhar665@gmail.com', 'Raja@2002', 'ADMIN');
select * from users;
*/