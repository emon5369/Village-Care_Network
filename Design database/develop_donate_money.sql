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
-- Table structure for table `donate_money`
--

DROP TABLE IF EXISTS `donate_money`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donate_money` (
  `username` varchar(25) DEFAULT NULL,
  `fullName` varchar(25) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `amount` varchar(30) DEFAULT NULL,
  `payment` varchar(20) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  `date` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donate_money`
--

LOCK TABLES `donate_money` WRITE;
/*!40000 ALTER TABLE `donate_money` DISABLE KEYS */;
INSERT INTO `donate_money` VALUES ('y','Yusuf','01633605248','$500','Bkask','Hello','15-12-2023'),('takia_nawrin','Takia Nawrin','01712345678','500','bKash','Donating 500 BDT via bKash for a good cause.','2023-01-01'),('monira_akter','Monira Akter','01823456789','1000','Nagad','Donating 1000 BDT via Nagad. Hope it helps.','2023-02-15'),('md_rahman','Md. Rahman','01934567890','2000','Rocket','Contributing 2000 BDT via Rocket for those in need.','2023-03-10'),('tahmina_akter','Tahmina Akter','01645678901','3000','bKash','Donating 3000 BDT via bKash for a good cause.','2023-04-05'),('ahmed_khan','Ahmed Khan','01756789012','5000','Nagad','Providing 5000 BDT via Nagad. Hope it makes a difference.','2023-05-20'),('sadia_islam','Sadia Islam','01867890123','1000','Rocket','Donating 1000 BDT via Rocket. Every little bit counts.','2023-06-15'),('kamal_hossain','Kamal Hossain','01978901234','2000','bKash','Contributing 2000 BDT via bKash for those in need.','2023-07-01'),('ayesha_rahman','Ayesha Rahman','01689012345','3000','Nagad','Donating 3000 BDT via Nagad. Let it bring some relief.','2023-08-10'),('rajib_hasan','Rajib Hasan','01790123456','500','Rocket','Contributing 500 BDT via Rocket. Every little helps.','2023-09-05'),('farida_islam','Farida Islam','01801234567','1000','bKash','Providing 1000 BDT via bKash. Hope it brings positive change.','2023-10-20'),('nusrat_jahan','Nusrat Jahan','01912345678','2000','Nagad','Donating 2000 BDT via Nagad. Supporting a good cause.','2023-11-15'),('imran_ali','Imran Ali','01623456789','3000','Rocket','Contributing 3000 BDT via Rocket for those in need.','2023-12-01'),('sabina_hassan','Sabina Hassan','01734567890','5000','bKash','Donating 5000 BDT via bKash for a good cause.','2024-01-10'),('rafi_ahmed','Rafi Ahmed','01845678901','1000','Nagad','Providing 1000 BDT via Nagad. Let it make a difference.','2024-02-05'),('meherun_nessa','Meherun Nessa','01956789012','2000','Rocket','Contributing 2000 BDT via Rocket for those in need.','2024-03-20'),('shahidul_islam','Shahidul Islam','01667890123','3000','bKash','Donating 3000 BDT via bKash. Every little helps.','2024-04-15'),('shahnaz_begum','Shahnaz Begum','01778901234','500','Nagad','Contributing 500 BDT via Nagad. Supporting a good cause.','2024-05-01'),('rafiqul_haque','Rafiqul Haque','01889012345','1000','Rocket','Providing 1000 BDT via Rocket. Let it bring positive change.','2024-06-10'),('farzana_yasmin','Farzana Yasmin','01990123456','2000','bKash','Donating 2000 BDT via bKash. Hope it brings relief.','2024-07-05'),('kamal_hossain2','Kamal Hossain','01601234567','3000','Nagad','Contributing 3000 BDT via Nagad for those in need.','2024-08-20'),('y','Yusuf','01633605248','$2000','Bkash','Design .','15-12-2023'),('y','Emon Hossain','094494949','$2000','Select','no','15-12-2023');
/*!40000 ALTER TABLE `donate_money` ENABLE KEYS */;
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
