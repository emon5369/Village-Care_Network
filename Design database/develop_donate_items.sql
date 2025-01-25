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
-- Table structure for table `donate_items`
--

DROP TABLE IF EXISTS `donate_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donate_items` (
  `username` varchar(25) DEFAULT NULL,
  `fullName` varchar(25) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL,
  `itemName` varchar(25) DEFAULT NULL,
  `recipient` varchar(30) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  `message` varchar(100) DEFAULT NULL,
  `date` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donate_items`
--

LOCK TABLES `donate_items` WRITE;
/*!40000 ALTER TABLE `donate_items` DISABLE KEYS */;
INSERT INTO `donate_items` VALUES ('y','Yusuf','01633605248','Shirt','None','Office','Hello','15-12-2023'),('takia_nawrin','Takia Nawrin','01712345678','Shirts','Local Charity','Dhaka, Bangladesh','Donating some shirts for a good cause.','2023-01-01'),('monira_akter','Monira Akter','01823456789','Pants','Orphanage Home','Chittagong, Bangladesh','Hope these pants find someone in need.','2023-02-15'),('md_rahman','Md. Rahman','01934567890','Dresses','Women\'s Shelter','Rajshahi, Bangladesh','Contributing dresses for women in need.','2023-03-10'),('tahmina_akter','Tahmina Akter','01645678901','Jackets','Homeless Shelter','Khulna, Bangladesh','Donating warm jackets for the winter.','2023-04-05'),('ahmed_khan','Ahmed Khan','01756789012','Sweaters','Local School','Barisal, Bangladesh','Providing sweaters for school children.','2023-05-20'),('sadia_islam','Sadia Islam','01867890123','Scarves','Elderly Care Center','Sylhet, Bangladesh','Donating scarves for the elderly.','2023-06-15'),('kamal_hossain','Kamal Hossain','01978901234','T-shirts','Community Center','Dhaka, Bangladesh','Contributing T-shirts for community activities.','2023-07-01'),('ayesha_rahman','Ayesha Rahman','01689012345','Kamiz','Orphanage Home','Chittagong, Bangladesh','Donating kamizes for orphaned girls.','2023-08-10'),('rajib_hasan','Rajib Hasan','01790123456','Jeans','Local Charity','Rajshahi, Bangladesh','Contributing jeans for those in need.','2023-09-05'),('farida_islam','Farida Islam','01801234567','Hats','Homeless Shelter','Khulna, Bangladesh','Providing hats for the homeless.','2023-10-20'),('nusrat_jahan','Nusrat Jahan','01912345678','Socks','Women\'s Shelter','Barisal, Bangladesh','Donating socks for women in need.','2023-11-15'),('imran_ali','Imran Ali','01623456789','Coats','Local School','Sylhet, Bangladesh','Contributing coats for school children.','2023-12-01'),('sabina_hassan','Sabina Hassan','01734567890','Shawls','Elderly Care Center','Dhaka, Bangladesh','Providing shawls for the elderly.','2024-01-10'),('rafi_ahmed','Rafi Ahmed','01845678901','Pajamas','Community Center','Chittagong, Bangladesh','Donating pajamas for community activities.','2024-02-05'),('meherun_nessa','Meherun Nessa','01956789012','Skirts','Orphanage Home','Rajshahi, Bangladesh','Contributing skirts for orphaned girls.','2024-03-20'),('shahidul_islam','Shahidul Islam','01667890123','Gloves','Local Charity','Khulna, Bangladesh','Providing gloves for those in need.','2024-04-15'),('shahnaz_begum','Shahnaz Begum','01778901234','Trousers','Homeless Shelter','Barisal, Bangladesh','Donating trousers for the homeless.','2024-05-01'),('rafiqul_haque','Rafiqul Haque','01889012345','Blazers','Women\'s Shelter','Sylhet, Bangladesh','Contributing blazers for women in need.','2024-06-10'),('farzana_yasmin','Farzana Yasmin','01990123456','Vests','Local School','Dhaka, Bangladesh','Providing vests for school children.','2024-07-05'),('kamal_hossain2','Kamal Hossain','01601234567','Panjabi','Elderly Care Center','Chittagong, Bangladesh','Donating Panjabir for the elderly.','2024-08-20'),('y','Yusuf','01633605248','Jacket','None','University','No','15-12-2023');
/*!40000 ALTER TABLE `donate_items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-15 10:58:58
