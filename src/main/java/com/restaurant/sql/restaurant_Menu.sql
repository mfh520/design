-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: restaurant
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `Menu`
--

DROP TABLE IF EXISTS `Menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Menu` (
  `vno` int(11) NOT NULL,
  `vname` varchar(10) NOT NULL,
  `price` int(11) NOT NULL,
  `season` varchar(4) NOT NULL,
  `menuType` varchar(12) NOT NULL,
  `publish` int(11) NOT NULL,
  `isdelete` int(11) NOT NULL,
  `privatE` int(11) NOT NULL,
  `preMark` int(11) NOT NULL,
  `publicScore` double NOT NULL,
  `privateScore` double NOT NULL,
  PRIMARY KEY (`vno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Menu`
--

LOCK TABLES `Menu` WRITE;
/*!40000 ALTER TABLE `Menu` DISABLE KEYS */;
INSERT INTO `Menu` VALUES (10001,'烤鸭11',25,'春季','正餐',0,0,0,5,4,0),(10002,'土豆炖肉',15,'冬季','正餐',0,0,1,5,3,0),(10003,'炒白菜',10,'冬季','正餐',0,0,1,5,0,0),(10004,'炖酸菜',5,'冬季','正餐',0,0,1,5,5,0),(10005,'萝卜',5,'冬季','正餐',0,0,1,5,0,0),(10006,'可口可乐',7,'通用','酒水',1,0,1,5,0,0),(10007,'小米粥',22,'121','早餐',0,0,0,5,0,0),(10008,'白菜',10,'春季','早餐',1,0,0,5,11,2),(10009,'白菜',10,'秋季','正餐',0,1,1,5,0,0),(10010,'胡萝卜',123,'春季','早餐',1,0,1,5,11,1),(10011,'tuuuu',34,'春季','早餐',1,1,0,0,2,0),(10012,'2q2223',234,'春季','早餐',1,0,1,0,8,1),(10013,'wewe',34,'春季','早餐',1,0,0,0,1,0),(10014,'qwe',34,'春季','早餐',1,0,0,0,1,0),(10015,'',34,'春季','早餐',0,1,0,0,0,0),(10016,'qqqqq',34,'春季','早餐',0,1,0,0,0,0),(10017,'qweqw',34,'春季','早餐',1,0,0,0,1,0),(10018,'lll',23,'春季','早餐',0,1,0,0,0,0),(10019,'枪枪枪枪',12,'春季','早餐',1,0,0,0,1,0);
/*!40000 ALTER TABLE `Menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-16 22:27:23
