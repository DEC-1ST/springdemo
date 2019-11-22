CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `name` varchar(100) DEFAULT NULL,
                        `account_id` varchar(50) DEFAULT NULL,
                        `token` char(36) DEFAULT NULL,
                        `gmt_create` bigint(20) DEFAULT NULL,
                        `gmt_modified` bigint(20) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

