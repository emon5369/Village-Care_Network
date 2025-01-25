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
-- Table structure for table `volunteer_info`
--

DROP TABLE IF EXISTS `volunteer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer_info` (
  `Full_Name` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Username` varchar(50) NOT NULL,
  `Passward` varchar(50) DEFAULT NULL,
  `Date_of_Birth` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Phone_Number` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Available_Hour` varchar(50) DEFAULT NULL,
  `Available_days` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteer_info`
--

LOCK TABLES `volunteer_info` WRITE;
/*!40000 ALTER TABLE `volunteer_info` DISABLE KEYS */;
INSERT INTO `volunteer_info` VALUES ('Md Yusuf','mdyusuf18@gmail.com','aladeen','1818','Aug 18, 2001','Male','01633605248','Hazaribag','6-9 hours','Monday Tuesday Wednesday Thursday '),('Maim Khan Alo','maimkhan@gmail.com','Alooo','1212','Apr 12.1999','Male','01623698745','Afsar Uddin Road, Dhaka','>9 hours','Saturday Sunday Monday Tuesday Wednesday Thursday '),('Marimum Anika','mariumanika@gmail.com','Anka','0202','May 14, 1996','Female','01987654321','Mirpur Road, Dhaka','3-6 hours','Saturday Monday Tuesday Thursday '),('Maftun Apurba','maftunapurba@gmail.com','apurbaa','2525','May 25, 1998','Male','013698547964','Lautola Bosila,Dhaka','>9 hours','Saturday Sunday Monday Tuesday '),('Radia Tasmin Arony','radiaaa@gmail.com','aroony','313131','Dec 31, 2000','Female','019865387464','Agargaon City ,Dhaka','<3 hours','Saturday Sunday Monday Tuesday Wednesday Friday '),('Awhona Rahman','afawhonarahman@gmail.com','awhonaa','2020','Nov 20, 2000','Female','016525258964','Laalbagh , Azimpur','>9 hours','Saturday Sunday Monday Friday '),('Md Emon Hosain','emonhosain01@gmail.com','eemon','0101','Dec 6, 2000','Male','01612228572','Gabtola Moshjid , Jigatola','<3 hours','Saturday Sunday Tuesday Wednesday '),('Elhum Shaikot','elhumshaikot@gmail.com','elluellu','1313','Jan 13, 1997','Male','01916171815','Bashundhara','6-9 hours','Saturday Sunday Monday Tuesday Friday '),('Md Eyahia ','mdeyahia15@gmail.com','eyahiaa','1515','Dec 15, 1970','Male','01714070418','Mitali Road , Jigatola','3-6 hours','Saturday Sunday Monday Tuesday Friday '),('Fayek Shareef','shareef@gmail.com','feku','9090','Dec 9, 2000','Male','017894131215','USA','>9 hours','Sunday Monday Friday '),('Marzuk Ahmed','marzukahmed@gmail.com','mazzuk','5505','Sep 5, 2000','Male','017894555555','Bokshi Bazar Road ,Dhaka','3-6 hours','Sunday Monday Wednesday Thursday Friday '),('Fahmida Meem','fahmidameem@gmail.com','meeem','161616','Feb 16, 2000','Female','019875258964','Laalbagh nobinogar','3-6 hours','Sunday Monday Tuesday Wednesday Friday '),('Monira Akter','moniraakter31@gmail.com','moniralala','3131','Mar 31, 2001','Female','01717605668','jigatola , Dhaka','>9 hours','Saturday Sunday Monday Tuesday Wednesday Thursday '),('Johura Rina','johurarina@gmail.com','rinaaa','010101','Apr 1, 1971','Female','01711020330','Mitali Road , Jigatola','<3 hours','Saturday Sunday Monday Tuesday Wednesday '),('Ratna Bishwash','ratnabishwash@gmail.com','roton','1717','Jan 30, 1997','Female','01529638741','Jhinaidah,Jessore','3-6 hours','Sunday Monday Tuesday Wednesday Thursday '),('Abrar Sadaf','abrar@gmail.com','sadaf','202020','Nov 20, 2000','Female','019865355555','Elephant Road ,Dhaka','6-9 hours','Sunday Monday Wednesday Thursday Friday '),('Sadia Sultana','sadiasultana@gmail.com','sadiaa','2424','Nov 24, 1998','Female','015556987464','Azimpur tulatola,Dhaka','>9 hours','Saturday Sunday Monday Tuesday Friday '),('Mabia Sultana','mabiasultana@gmail.com','shovaa','191919','Jul 18, 1995','Female','01625256565','Uttora sector 16, Dhaka','<3 hours','Saturday Sunday Monday Tuesday Wednesday Thursday '),('Takia Nowrin','takianowrin16@gmail.com','takianowrin','1618','Mar 16, 2000','Female','01948204978','17/b/1 mitali road, jigatola ,Dhaka-1209','3-6 hours','Saturday Thursday Friday '),('Tanvir Mahmud','tanvirmahmud@gmail.com','tanvir','1919','Nov 19, 1994','Male','01683389998','Uttora sector 10','>9 hours','Saturday Sunday Monday Tuesday '),('Suraiya Tazin','suraiyatazin@gmail.com','tazinn','3030','Jun 30, 1998','Female','015558547964','Mirpur 1,Dhaka','3-6 hours','Saturday Sunday Monday '),('Afia Joty','afiajoty@gmail.com','zebaa','0707','Sep 7, 2000','Female','01652523694','Kaderabadh Housing, Mdpur','6-9 hours','Saturday Sunday Tuesday Wednesday Friday ');
/*!40000 ALTER TABLE `volunteer_info` ENABLE KEYS */;
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
