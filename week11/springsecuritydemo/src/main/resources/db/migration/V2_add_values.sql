INSERT INTO `construction`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('1', 'admin@gmail.com', 'Kyzzhibek', 'Orozbekova', '$2a$12$zp3RhE/uW05aCTvgHP6M2uB7AkQ2a2Ac4fg0uvVBiX1zCUNNeBtSC', 'ADMIN', 'ACTIVE');
INSERT INTO `construction`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('2', 'user@gmail.com', 'Man', 'Userov', '$2a$12$TnNpjed7gd3Mc.m1XKvyPufaT5EI45d207HuPUjHfo723ssxn4hrq', 'USER', 'ACTIVE');
INSERT INTO `construction`.`users` (`user_id`, `email`, `first_name`, `last_name`, `password`, `role`, `status`) VALUES ('3', 'user2@gmail.com', 'Frau', 'Userova', '$2a$12$k9HQbLaKLdUmeb5IxocRwe8K469MPoqfcC5sakM.mkpGoh3ISCpHq', 'ADMIN', 'ACTIVE');

INSERT INTO `construction`.`product` (`prod_id`, `date_of_manifacture`, `expiry_date`, `product_name`, `price`, `category_id`) VALUES ('1', '2022-04-05 00:00:00', '2022-04-06 00:00:00', 'hammer', '140', '1');
INSERT INTO `construction`.`product` (`prod_id`, `date_of_manifacture`, `expiry_date`, `product_name`, `price`, `category_id`) VALUES ('2', '2022-04-05 00:00:00', '2022-04-06 00:00:00', 'axe', '329', '1');

INSERT INTO `construction`.`categories` (`category_id`, `category_name`) VALUES ('1', 'construction supplies');
INSERT INTO `construction`.`categories` (`category_id`, `category_name`) VALUES ('2', 'Construction material');

INSERT INTO `construction`.`order` (`order_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `construction`.`order` (`order_id`, `user_id`) VALUES ('2', '1');

INSERT INTO `construction`.`order_detail` (`order_id`, `prod_id`) VALUES ('1', '1');
INSERT INTO `construction`.`order_detail` (`order_id`, `prod_id`) VALUES ('2', '2');