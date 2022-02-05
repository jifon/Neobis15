-- CREATE TABLE coffee_shop (
-- 	coffee_shop_id INT AUTO_INCREMENT PRIMARY KEY,
-- 	coffee_shop_name VARCHAR(50) NOT NULL,
--     address VARCHAR(100) NOT NULL,
--     phone_number VARCHAR(50) NOT NULL
-- );

-- CREATE TABLE product (
-- 	product_id INT PRIMARY KEY,
--     coffee_shop_id INT NOT NULL,
-- 	product_name VARCHAR(100) NOT NULL,
--     cost DOUBLE NOT NULL,
--     date_of_manifacture DATE NOT NULL,
--     phone_number VARCHAR(50) NOT NULL,
--     expiry_date DATE NOT NULL
-- );

-- CREATE TABLE product_coffee (

-- 	product_coffee_id INT  PRIMARY KEY,
-- 	product_name VARCHAR(100) NOT NULL,
--     cost double NOT NULL,
--     date_of_manifacture DATE NOT NULL,
--     phone_number VARCHAR(50) NOT NULL,
--     expiry_date DATE NOT NULL,
-- 	brew_strangth INT NOT NULL,
--     coffee_size VARCHAR(25) NOT NULL, 
--     milk_type VARCHAR(25) NOT NULL,  
--     sweeteners VARCHAR(25) NOT NULL
-- );

-- CREATE TABLE donut (
-- 	product_donut_id INT PRIMARY KEY,
-- 	product_name VARCHAR(100) NOT NULL,
--     cost double NOT NULL,
--     date_of_manifacture DATE NOT NULL,
--     phone_number VARCHAR(50) NOT NULL,
--     expiry_date DATE NOT NULL,
-- 	glaze VARCHAR(25) NOT NULL,
--     filling VARCHAR(25) NOT NULL ,  
--     powder VARCHAR(25) NOT NULL, 
--     sweeteners VARCHAR(25) NOT NULL
-- );

-- CREATE TABLE cake(
-- 	product_cake_id INT AUTO_INCREMENT PRIMARY KEY,
-- 	product_name VARCHAR(100) NOT NULL,
--     cost double NOT NULL,
--     date_of_manifacture DATE NOT NULL,
--     phone_number VARCHAR(50) NOT NULL,
--     expiry_date DATE NOT NULL,
-- 	cream VARCHAR(25) NOT NULL,
--     filling VARCHAR(25) NOT NULL ,  
--     powder VARCHAR(25) NOT NULL, 
--     sweeteners VARCHAR(25) NOT NULL
-- );


-- CREATE TABLE customer (
-- 	customer_id INT AUTO_INCREMENT PRIMARY KEY,
--     coffee_shop_id INT NOT NULL,
-- 	customer_name VARCHAR(100) NOT NULL,
--     number_of_card VARCHAR(50) NOT NULL,
--     code_of_card VARCHAR(100) NOT NULL
-- );


-- CREATE TABLE orders (
-- orders_id INT NOT NULL,
-- customer_id INT NOT NULL,
-- product_id INT NOT NULL,
-- PRIMARY KEY(orders_id)
-- );

-- CREATE TABLE employee (
-- 	emp_id INT AUTO_INCREMENT PRIMARY KEY,
--     coffee_shop_id INT NOT NULL,
--     employee_surname VARCHAR(100) NOT NULL,
-- 	employee_name VARCHAR(100) NOT NULL,
--     emp_position VARCHAR(50) NOT NULL, 
--     arrival_date DATE NOT NULL,
--     departure_date DATE NOT NULL
-- );

ALTER TABLE product
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);

ALTER TABLE product_coffee
ADD FOREIGN KEY (product_coffee_id) REFERENCES product (product_id);

ALTER TABLE donut
ADD FOREIGN KEY (product_donut_id) REFERENCES product (product_id);

ALTER TABLE cake
ADD FOREIGN KEY (product_cake_id) REFERENCES product (product_id);

ALTER TABLE customer
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);

ALTER TABLE orders
ADD FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
ADD FOREIGN KEY (product_id) REFERENCES product(product_id);

ALTER TABLE employee
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);












