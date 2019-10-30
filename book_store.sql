DROP DATABASE IF EXISTS book_store;
CREATE DATABASE book_store CHAR SET utf8mb4;
USE book_store;

CREATE TABLE customer (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(80) NOT NULL,
    last_name VARCHAR(80) NOT NULL,
    email VARCHAR(80) NOT NULL,
    customer_role VARCHAR(60) NOT NULL,
    customer_password VARCHAR(70) NOT NULL
);

CREATE TABLE book (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book_name VARCHAR(120) NOT NULL,
    book_description TEXT,
    price DECIMAL(5,2) NOT NULL,
    isbn VARCHAR(20) NOT NULL UNIQUE,
    quantity INT NOT NULL
); 

CREATE TABLE bucket_order (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    customer_id INT NOT NULL,
    book_id INT NOT NULL,
    purchase_date DATE NOT NULL
);

ALTER TABLE bucket_order ADD FOREIGN KEY (customer_id)
	REFERENCES customer(id);
ALTER TABLE bucket_order ADD FOREIGN KEY (book_id)
	REFERENCES book(id);