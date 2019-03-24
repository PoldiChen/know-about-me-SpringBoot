CREATE TABLE `basic` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `full_name` varchar(45) NOT NULL,
   `first_name` varchar(45) NOT NULL,
   `last_name` varchar(45) NOT NULL,
   `english_name` varchar(45) NOT NULL,
   `birth_date` date NOT NULL,
   `phone` varchar(45) NOT NULL,
   `email` varchar(45) NOT NULL,
   `address` varchar(45) NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `id_UNIQUE` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8