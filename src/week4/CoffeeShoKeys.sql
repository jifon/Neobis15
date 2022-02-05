ALTER TABLE product
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);

ALTER TABLE product_coffee
ADD FOREIGN KEY (product_id) REFERENCES product (product_id);

ALTER TABLE product_desssert
ADD FOREIGN KEY (product_id) REFERENCES product (product_id);

ALTER TABLE donut
ADD FOREIGN KEY (product_id) REFERENCES product_desssert (product_id);

ALTER TABLE cake
ADD FOREIGN KEY (product_id) REFERENCES product_desssert (product_id);

ALTER TABLE customer
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);

ALTER TABLE orders
ADD FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
ADD FOREIGN KEY (product_id) REFERENCES product(product_id);

ALTER TABLE employee
ADD FOREIGN KEY (coffee_shop_id) REFERENCES coffee_shop (coffee_shop_id);