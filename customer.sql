Create Database customer;

CREATE TABLE `customer`.`customer_info` (
  `customer_id` int(11) NOT NULL auto_increment,
  `name` varchar(35) NOT NULL,
  `mobile` varchar(14) NOT NULL,
  `email` varchar(60) NOT NULL,
  `address` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;