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
	
INSERT INTO book (book_name, book_description, price, isbn, quantity) VALUES
	('Щоденник слабака.Книга 1', 'Мова: українська', 125.00, '978-966-948-239-6', 4),					#1
    ('Щоденник слабака.33 нещастя.Книга 8', 'Мова: українська', 130.00, '978-966-948-170-2', 4),		#2
    ('Щоденник слабака. Книга 7. Третій зайвий', 'Мова: українська', 125.00, '978-617-7535-73-6', 4),	#3
    ('Нічне кіно', 'Мова: українська', 208.00, '978-966-917-290-7', 3),									#4
    ('Токийский гуль. Книга 1', 'Мова: російська', 248.00, '978-5-389-15107-9', 2),						#5
    ('Маятник Фуко', 'Мова: українська', 290.00, '978-966-03-8207-7', 1),								#6
    ('Бавдоліно', 'Мова: українська', 232.00, '978-966-03-8150-6', 1),									#7
    ('Програмування мовою Python', 'Мова: українська', 335.00, '978-966-10-5611-3', 8),					#8
    ('Эволюция Гвардиолы', 'Мова: російська', 255.00, '978-966-03-8506-1', 7),							#9
    ('Українська діаспора', 'Мова: українська', 221.00, '978-966-03-7875-9', 10),						#10
    ('Сатирикон. Поезії', 'Мова: українська', 163.00, '978-966-03-7593-2', 1)							#11
;    	