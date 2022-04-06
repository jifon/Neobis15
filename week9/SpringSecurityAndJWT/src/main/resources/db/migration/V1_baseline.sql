CREATE TABLE `users` (
                         `user_id` bigint NOT NULL AUTO_INCREMENT,
                         `email` varchar(255) DEFAULT NULL,
                         `first_name` varchar(255) DEFAULT NULL,
                         `last_name` varchar(255) DEFAULT NULL,
                         `password` varchar(255) DEFAULT NULL,
                         `role` varchar(255) DEFAULT NULL,
                         `status` varchar(255) DEFAULT NULL,
                         PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `product` (
                           `prod_id` bigint NOT NULL,
                           `date_of_manifacture` datetime NOT NULL,
                           `expiry_date` datetime NOT NULL,
                           `product_name` varchar(255) NOT NULL,
                           `price` double NOT NULL,
                           `category_id` int DEFAULT NULL,
                           PRIMARY KEY (`prod_id`),
                           KEY `FKowomku74u72o6h8q0khj7id8q` (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `order` (
                        `order_id` bigint NOT NULL AUTO_INCREMENT,
                         `user_id` bigint NOT NULL,
                         PRIMARY KEY (`order_id`),
                         KEY `FKs9p0s8b1nh7m2no87xxteu83x` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;






CREATE TABLE `order_detail` (
                                `order_id` bigint NOT NULL,
                                `prod_id` bigint NOT NULL,
                                KEY `FKjkw63ww6tlamnw9ooowb7pk9r` (`prod_id`),
                                KEY `FKplam7wxc4tjbgex0xyk8f0qxo` (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





CREATE TABLE `categories` (
                              `category_id` int NOT NULL AUTO_INCREMENT,
                              `category_name` varchar(255) DEFAULT NULL,
                              PRIMARY KEY (`category_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





CREATE TABLE `hibernate_sequence` (
    `next_val` bigint DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




