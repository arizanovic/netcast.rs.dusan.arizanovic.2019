-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: teretana_d3
-- ------------------------------------------------------
-- Server version	5.6.38-log

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
-- Table structure for table `clan`
--

DROP TABLE IF EXISTS `clan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(45) DEFAULT NULL,
  `prezime` varchar(45) DEFAULT NULL,
  `pol` varchar(45) DEFAULT NULL,
  `godine` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clan`
--

LOCK TABLES `clan` WRITE;
/*!40000 ALTER TABLE `clan` DISABLE KEYS */;
INSERT INTO `clan` VALUES (1,'zzdusandto','kuciarizanovicdto','kucimuskidto',34,'kucid@yahoo.comdto'),(2,'sdfg','sdfg','zenski',3245,'asdf'),(4,'kucidusandto','kuciarizanovicdto','kucimuskidto',34,'kucid@yahoo.comdto'),(5,'5','5','5',5,'5@yahoo.com'),(6,'1ooodusanupdated','oooarizanovicupdated','oomuskiupdated',344444,'ooodusan@yahoo.comupdated'),(7,'2ooodusanupdated','oooarizanovicupdated','oomuskiupdated',344444,'ooodusan@yahoo.comupdated'),(8,'3ooodusanupdated','oooarizanovicupdated','oomuskiupdated',344444,'ooodusan@yahoo.comupdated'),(9,'updated','oooarizanovicupdated','oomuskiupdated',344444,'ooodusan@yahoo.comupdated');
/*!40000 ALTER TABLE `clan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pretplata`
--

DROP TABLE IF EXISTS `pretplata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pretplata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pocetak` datetime NOT NULL,
  `kraj` datetime NOT NULL,
  `clan_id` int(11) NOT NULL,
  `tip_pretplate_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tip_pretplate_idx` (`tip_pretplate_id`),
  KEY `clan_idx` (`clan_id`),
  CONSTRAINT `clan` FOREIGN KEY (`clan_id`) REFERENCES `clan` (`id`),
  CONSTRAINT `tip_pretplate` FOREIGN KEY (`tip_pretplate_id`) REFERENCES `tip_pretplate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pretplata`
--

LOCK TABLES `pretplata` WRITE;
/*!40000 ALTER TABLE `pretplata` DISABLE KEYS */;
INSERT INTO `pretplata` VALUES (1,'2019-02-11 00:00:00','2019-02-11 00:00:00',2,2),(2,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,1),(4,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,1),(5,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,1),(6,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,1),(7,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,1),(8,'2019-02-11 00:00:00','2019-02-11 00:00:00',1,2);
/*!40000 ALTER TABLE `pretplata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `termin`
--

DROP TABLE IF EXISTS `termin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `termin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pocetak` datetime DEFAULT NULL,
  `kraj` datetime DEFAULT NULL,
  `clan_id` int(11) DEFAULT NULL,
  `trener_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `clan1_idx` (`clan_id`),
  KEY `trener_idx` (`trener_id`),
  CONSTRAINT `clan1` FOREIGN KEY (`clan_id`) REFERENCES `clan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `trener` FOREIGN KEY (`trener_id`) REFERENCES `trener` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `termin`
--

LOCK TABLES `termin` WRITE;
/*!40000 ALTER TABLE `termin` DISABLE KEYS */;
INSERT INTO `termin` VALUES (1,'2019-01-15 00:00:00','2019-01-15 00:00:00',1,1),(2,'2019-02-15 00:00:00','2019-02-15 00:00:00',2,2);
/*!40000 ALTER TABLE `termin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tip_pretplate`
--

DROP TABLE IF EXISTS `tip_pretplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tip_pretplate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tip` varchar(45) DEFAULT NULL,
  `cena` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tip_pretplate`
--

LOCK TABLES `tip_pretplate` WRITE;
/*!40000 ALTER TABLE `tip_pretplate` DISABLE KEYS */;
INSERT INTO `tip_pretplate` VALUES (1,'fghhhhhhhhhhhhhhhhhh',222222222222),(2,'mesecna',321);
/*!40000 ALTER TABLE `tip_pretplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trener`
--

DROP TABLE IF EXISTS `trener`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trener` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(45) DEFAULT NULL,
  `prezime` varchar(45) DEFAULT NULL,
  `cena` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trener`
--

LOCK TABLES `trener` WRITE;
/*!40000 ALTER TABLE `trener` DISABLE KEYS */;
INSERT INTO `trener` VALUES (1,'milan','krkobabic-junior',1300),(2,'23','sdfgs',123);
/*!40000 ALTER TABLE `trener` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-27 20:57:48
