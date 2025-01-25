-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: develop
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `requestedtask`
--

DROP TABLE IF EXISTS `requestedtask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requestedtask` (
  `TaskID` int DEFAULT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Skills_Required` varchar(50) DEFAULT NULL,
  `Duration` varchar(50) DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requestedtask`
--

LOCK TABLES `requestedtask` WRITE;
/*!40000 ALTER TABLE `requestedtask` DISABLE KEYS */;
INSERT INTO `requestedtask` VALUES (231,'IT Support','IT and Technology','2023-01-01','Approved'),(232,'Carpentry Work','Carpentry','2023-02-15','Rejected'),(233,'House Cleaning','Sweeping or Cleaning','2023-03-10','Completed'),(234,'Agricultural Assistance','Agricultural Skills','2023-04-05','Completed'),(235,'Health Checkup','Healthcare','2023-05-20',NULL),(236,'Electrical Repair','Electrical/Mechanical skills','2023-06-15',NULL),(237,'Language Tutoring','Language Proficiency','2023-07-01',NULL),(238,'Event Coordination','Event Planning','2023-08-10',NULL),(239,'Software Development','IT and Technology','2023-09-05',NULL),(2310,'Furniture Building','Carpentry','2023-10-20',NULL),(2311,'Office Cleaning','Sweeping or Cleaning','2023-11-15',NULL),(2312,'Crop Harvesting','Agricultural Skills','2023-12-01',NULL),(2313,'Nursing Assistance','Healthcare','2024-01-10',NULL),(2314,'Mechanical Engineering','Electrical/Mechanical skills','2024-02-05',NULL),(2315,'Language Translation','Language Proficiency','2024-03-20',NULL),(2316,'Wedding Planning','Event Planning','2024-04-15',NULL),(2317,'Database Management','IT and Technology','2024-05-01',NULL),(2318,'Woodwork Repair','Carpentry','2024-06-10',NULL),(2319,'Street Cleaning','Sweeping or Cleaning','2024-07-05',NULL),(2320,'Livestock Care','Agricultural Skills','2024-08-20',NULL),(101,'Computer Study','IT and Technology','2023-12-23','Completed');
/*!40000 ALTER TABLE `requestedtask` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-15 10:58:59
