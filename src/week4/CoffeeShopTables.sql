CREATE TABLE coffee_shop (
	coffee_shop_id INT AUTO_INCREMENT PRIMARY KEY,
	coffee_shop_name varchar(100) NOT NULL,
    address varchar(250),
    phone_number varchar(100)
);

CREATE TABLE product (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT,
	product_name varchar(100),
    cost double NOT NULL,
    date_of_manifacture date,
    phone_number varchar(100),
    expiry_date date
);

CREATE TABLE product_coffee (
	product_id int AUTO_INCREMENT PRIMARY KEY,
	brew_strangth int,
    coffee_size ENUM('BERRY', 'STRAWBERRY', 'CHOCOLATE', 'COTTAGE'), 
    milk_type ENUM('BERRY', 'STRAWBERRY', 'CHOCOLATE', 'COTTAGE'),  
    sweeteners ENUM('VANILLASUGAR', 'WHITESUGAR', 'MAPLESYRUP', 'HONEY', 'ARTIFACIALSWEETENERS')
);


CREATE TABLE product_desssert (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	filling ENUM('BERRY', 'STRAWBERRY', 'CHOCOLATE', 'COTTAGE'),  
    powder ENUM('PEANUTS', 'POWDEREDSUGAR', 'CANDY'), 
    sweeteners ENUM('VANILLASUGAR', 'WHITESUGAR', 'MAPLESYRUP', 'HONEY', 'ARTIFACIALSWEETENERS')  
);

CREATE TABLE donut (
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	glaze ENUM('CHOKOLATE', 'DALY', 'WHITE')
);

CREATE TABLE cake(
	product_id INT AUTO_INCREMENT PRIMARY KEY,
	cream ENUM('MASCARPON', 'CONDENSEDMILK', 'CHOCOLATE', 'BOILEDCONDENSEDMILK',' WHITECHOCOLATE')
);


ALTER TABLE customer
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);

CREATE TABLE customer (
	customer_id int AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT,
	customer_name varchar(100) NOT NULL,
    number_of_card varchar(50),
    code_of_card varchar(100) /*chek how to save secret valuess*/
);

#storing customer orders 
CREATE TABLE orders (
orders_id int NOT NULL,
customer_id int NOT NULL,
product_id int NOT NULL,
PRIMARY KEY(orders_id)
);

CREATE TABLE employee (
	emp_id INT AUTO_INCREMENT PRIMARY KEY,
    coffee_shop_id INT,
    employee_surname varchar(100),
	employee_name varchar(100),
    emp_position ENUM('BARISTA', 'CASHIER', 'WAITER', 'MANEGER', 'HALLADMINOSTRATOR', 'SCRUBWOMAN'), 
    arrival_date date,
    departure_date date
);
