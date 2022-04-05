CREATE TABLE coffee_shop (
	coffee_shop_id INT AUTO_INCREMENT PRIMARY KEY,
	coffee_shop_name VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phone_number VARCHAR(50) NOT NULL
);

CREATE TABLE product (
	product_id INT PRIMARY KEY,
    coffee_shop_id INT NOT NULL,
	product_name VARCHAR(100) NOT NULL,
    cost DOUBLE NOT NULL,
    date_of_manifacture VARCHAR(50) NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    expiry_date VARCHAR(50) NOT NULL
);

CREATE TABLE product_coffee (

	product_coffee_id INT  PRIMARY KEY,
	product_name VARCHAR(100) NOT NULL,
    cost double NOT NULL,
    date_of_manifacture VARCHAR(50) NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    expiry_date VARCHAR(50) NOT NULL,
	brew_strangth INT NOT NULL,
    coffee_size VARCHAR(25) NOT NULL,
    milk_type VARCHAR(25) NOT NULL,
    sweeteners VARCHAR(25) NOT NULL
);

CREATE TABLE donut (
	product_donut_id INT PRIMARY KEY,
	product_name VARCHAR(100) NOT NULL,
    cost double NOT NULL,
    date_of_manifacture DATE NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    expiry_date VARCHAR(50) NOT NULL,
	glaze VARCHAR(25) NOT NULL,
    filling VARCHAR(25) NOT NULL ,
    powder VARCHAR(25) NOT NULL,
    sweeteners VARCHAR(25) NOT NULL
);

CREATE TABLE cake(
	product_cake_id INT AUTO_INCREMENT PRIMARY KEY,
	product_name VARCHAR(100) NOT NULL,
    cost double NOT NULL,
    date_of_manifacture VARCHAR(50) NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    expiry_date VARCHAR(50) NOT NULL,
	cream VARCHAR(25) NOT NULL,
    filling VARCHAR(25) NOT NULL ,
    powder VARCHAR(25) NOT NULL,
    sweeteners VARCHAR(25) NOT NULL
);


CREATE TABLE customer (
	customer_id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT NOT NULL,
	customer_name VARCHAR(100) NOT NULL,
    number_of_card VARCHAR(50) NOT NULL,
    code_of_card VARCHAR(100) NOT NULL
);


CREATE TABLE orders (
orders_id INT NOT NULL,
customer_id INT NOT NULL,
product_id INT NOT NULL,
PRIMARY KEY(orders_id)
);

CREATE TABLE employee (
	emp_id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT NOT NULL,
    employee_surname VARCHAR(100) NOT NULL,
	employee_name VARCHAR(100) NOT NULL,
    emp_position VARCHAR(50) NOT NULL,
    arrival_date VARCHAR(50) NOT NULL,
    departure_date VARCHAR(50) NOT NULL
);












