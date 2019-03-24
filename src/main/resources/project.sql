CREATE TABLE `project` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   `role` varchar(45) NOT NULL,
   `duration` varchar(45) NOT NULL,
   `skills` varchar(200) NOT NULL,
   `description` varchar(200) NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `id_UNIQUE` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8