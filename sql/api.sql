CREATE TABLE `wallet_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
	`money` decimal(14,2),
  `user_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
	`create_date` TIMESTAMP DEFAULT now(),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC


CREATE TABLE `wallet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
	`money` decimal(14,2),
  `user_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC