CREATE DATABASE  IF NOT EXISTS `springboot` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `springboot`;
-- MySQL dump 10.13  Distrib 5.6.11, for Win32 (x86)
--
-- Host: localhost    Database: springboot
-- ------------------------------------------------------
-- Server version	5.6.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `pincode` varchar(6) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `user_fk` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3sfnlgskxl8kf1kb2m0vddur4` (`user_fk`),
  CONSTRAINT `FK3sfnlgskxl8kf1kb2m0vddur4` FOREIGN KEY (`user_fk`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Ranchi','india','800008','JH',1),(2,'kolkata','india','534532','wb',2),(3,'Vaikunth','india','123332','Swarg',1),(4,'Dhanbad','india','800008','JH',1);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `storage_folder_name` varchar(45) NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `joining_date` datetime DEFAULT NULL,
  `nationality` varchar(25) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `passport_number` varchar(45) DEFAULT NULL,
  `resident_permit` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `corporate_id` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `last_modified_by` bigint(20) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `storage_forder_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Manjeet','Kumar','Mehta','device',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `geo_location`
--

DROP TABLE IF EXISTS `geo_location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `geo_location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `zip` varchar(10) DEFAULT NULL,
  `area` varchar(60) DEFAULT NULL,
  `street` varchar(60) DEFAULT NULL,
  `branch` varchar(45) DEFAULT NULL,
  `created` datetime NOT NULL,
  `created_by` bigint(20) NOT NULL,
  `last_modified` datetime NOT NULL,
  `last_modified_by` bigint(20) NOT NULL,
  `created_by_task_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `geo_location`
--

LOCK TABLES `geo_location` WRITE;
/*!40000 ALTER TABLE `geo_location` DISABLE KEYS */;
/*!40000 ALTER TABLE `geo_location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `org`
--

DROP TABLE IF EXISTS `org`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `org` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `address_fk` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6r27lry4vvj4d7mty7m88mrpg` (`address_fk`),
  CONSTRAINT `FK6r27lry4vvj4d7mty7m88mrpg` FOREIGN KEY (`address_fk`) REFERENCES `address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='					';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `org`
--

LOCK TABLES `org` WRITE;
/*!40000 ALTER TABLE `org` DISABLE KEYS */;
INSERT INTO `org` VALUES (1,'God','India',1,1),(2,'Evil','Sri lanka',1,2),(3,'sehvag','india',1,1),(4,'vaas','sri lanka',1,2),(5,'sachin','india',1,1),(6,'virat','india',1,1),(7,'God','India',1,1),(8,'God','India',1,1),(9,'God','India',1,1),(10,'God','India',1,4);
/*!40000 ALTER TABLE `org` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy`
--

DROP TABLE IF EXISTS `policy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `policy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `policy_number` varchar(100) NOT NULL,
  `policy_issue_date` datetime DEFAULT NULL,
  `policy_effective_date` datetime NOT NULL,
  `policy_expiry_date` datetime NOT NULL,
  `storage_folder_name` varchar(45) DEFAULT NULL,
  `policy_status` varchar(45) DEFAULT NULL,
  `policy_value` decimal(10,2) DEFAULT NULL,
  `created` datetime NOT NULL,
  `created_by` bigint(20) NOT NULL,
  `last_modified` datetime NOT NULL,
  `last_modified_by` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy`
--

LOCK TABLES `policy` WRITE;
/*!40000 ALTER TABLE `policy` DISABLE KEYS */;
/*!40000 ALTER TABLE `policy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `principal`
--

DROP TABLE IF EXISTS `principal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `principal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `legal_name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `office_address_id` int(11) DEFAULT NULL,
  `storage_folder_name` varchar(45) NOT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `created` datetime NOT NULL DEFAULT '2014-09-12 00:00:00',
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `last_modified` datetime NOT NULL DEFAULT '2014-09-12 00:00:00',
  `last_modified_by` bigint(20) NOT NULL DEFAULT '0',
  `icon_id` int(11) DEFAULT NULL,
  `branch_name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `worth` decimal(20,5) DEFAULT NULL,
  `turnover` decimal(20,5) DEFAULT NULL,
  `number_of_branch_employees` int(11) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `sub_category` varchar(45) DEFAULT NULL,
  `owner_partner` varchar(45) DEFAULT NULL,
  `business_domain` varchar(45) DEFAULT NULL,
  `ho_branch` varchar(100) DEFAULT NULL,
  `main_product_line` varchar(45) DEFAULT NULL,
  `established_date` datetime DEFAULT NULL,
  `profit` decimal(20,5) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `corporate_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `principal`
--

LOCK TABLES `principal` WRITE;
/*!40000 ALTER TABLE `principal` DISABLE KEYS */;
/*!40000 ALTER TABLE `principal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `org_fk` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmk2bp4a89v3ygr777w5oyti22` (`org_fk`),
  CONSTRAINT `FKmk2bp4a89v3ygr777w5oyti22` FOREIGN KEY (`org_fk`) REFERENCES `org` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'','it is weapoin','dhanush','45','fight',1),(2,'\0','weapon','teer','12','fighter',2),(3,'','it is hathiyar','pistol','450','fighter',2),(4,'','it hathiyar','goli','4510','goli',1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) DEFAULT NULL,
  `role` varchar(45) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkipq0epw9t7dv8j9bsmrg3wdg` (`user_id`),
  CONSTRAINT `FKkipq0epw9t7dv8j9bsmrg3wdg` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `system`
--

DROP TABLE IF EXISTS `system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `system` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `storage_folder_name` varchar(45) NOT NULL,
  `created` datetime NOT NULL,
  `created_by` bigint(20) NOT NULL,
  `last_modified` datetime NOT NULL,
  `last_modified_by` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `system`
--

LOCK TABLES `system` WRITE;
/*!40000 ALTER TABLE `system` DISABLE KEYS */;
/*!40000 ALTER TABLE `system` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `email` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `user_name` varchar(60) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_lqjrcobrh9jc8wpcar64q1bfh` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'','abc@gmail.com','123','ram'),(2,'','xyz@gmail.com','1234','ravan');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendor`
--

DROP TABLE IF EXISTS `vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `sub_category` varchar(45) DEFAULT NULL,
  `corporate_type` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `office_address_id` int(11) DEFAULT NULL,
  `created` datetime NOT NULL,
  `created_by` bigint(20) NOT NULL DEFAULT '0',
  `last_modified` datetime NOT NULL DEFAULT '2014-09-12 00:00:00',
  `last_modified_by` bigint(20) NOT NULL DEFAULT '0',
  `legal_name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `branch_name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `worth` decimal(20,5) DEFAULT NULL,
  `turnover` decimal(20,5) DEFAULT NULL,
  `number_of_branch_employees` int(11) DEFAULT NULL,
  `owner_partner` varchar(45) DEFAULT NULL,
  `business_domain` varchar(45) DEFAULT NULL,
  `ho_branch` varchar(100) DEFAULT NULL,
  `main_product_line` varchar(45) DEFAULT NULL,
  `established_date` datetime DEFAULT NULL,
  `profit` decimal(20,5) DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendor`
--

LOCK TABLES `vendor` WRITE;
/*!40000 ALTER TABLE `vendor` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'springboot'
--

--
-- Dumping routines for database 'springboot'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-25 18:22:22
