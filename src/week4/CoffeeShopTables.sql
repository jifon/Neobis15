CREATE TABLE coffee_shop (
	coffee_shop_id INT AUTO_INCREMENT PRIMARY KEY,
	coffee_shop_name VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phone_number VARCHAR(50) NOT NULL
);

CREATE TABLE product (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT NOT NULL,
	product_name VARCHAR(100) NOT NULL,
    cost double NOT NULL,
    date_of_manifacture DATE NOT NULL,
    phone_number VARCHAR(50) NOT NULL,
    expiry_date DATE NOT NULL
);

CREATE TABLE product_coffee (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	brew_strangth INT NOT NULL,
    coffee_size VARCHAR(25) NOT NULL, 
    milk_type VARCHAR(25) NOT NULL,  
    sweeteners VARCHAR(25) NOT NULL
);


CREATE TABLE product_desssert (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	filling VARCHAR(25) NOT NULL ,  
    powder VARCHAR(25) NOT NULL, 
    sweeteners VARCHAR(25) NOT NULL  
);

CREATE TABLE donut (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	glaze VARCHAR(25) NOT NULL
);

CREATE TABLE cake(
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	cream VARCHAR(25) NOT NULL
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
    arrival_date DATE NOT NULL,
    departure_date DATE NOT NULL
);