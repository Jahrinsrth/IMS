-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ims
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `courseCode` varchar(20) NOT NULL,
  `courseName` varchar(45) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `noOfSubject` int(11) DEFAULT NULL,
  `courseFee` double DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`courseCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('A001','ACCA','2018-10-02',2,80000,2,'ACCA is the global professional accounting body offering the charted accountant qualification '),('BM01','BM','2018-10-12',2,40000,2,'Business Management is a course of study leading to an A.A.S degree'),('CA01','CA','2018-10-10',2,90000,1,'Charted accountancy is the first accountants to form a professional accounting body');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_attendance`
--

DROP TABLE IF EXISTS `emp_attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp_attendance` (
  `year` int(11) NOT NULL,
  `month` varchar(20) NOT NULL,
  `eid` int(4) unsigned zerofill NOT NULL,
  `date` int(11) NOT NULL,
  `att_time` time DEFAULT NULL,
  `leave_time` time DEFAULT NULL,
  `ot_hours` int(11) DEFAULT '0',
  PRIMARY KEY (`year`,`month`,`date`,`eid`),
  KEY `eid` (`eid`),
  CONSTRAINT `emp_attendance_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_attendance`
--

LOCK TABLES `emp_attendance` WRITE;
/*!40000 ALTER TABLE `emp_attendance` DISABLE KEYS */;
INSERT INTO `emp_attendance` VALUES (2018,'October',0001,1,'01:01:00',NULL,0);
/*!40000 ALTER TABLE `emp_attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_interview`
--

DROP TABLE IF EXISTS `emp_interview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp_interview` (
  `NIC` char(12) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `EmpType` varchar(20) NOT NULL,
  `interviewStatus` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`NIC`,`EmpType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_interview`
--

LOCK TABLES `emp_interview` WRITE;
/*!40000 ALTER TABLE `emp_interview` DISABLE KEYS */;
INSERT INTO `emp_interview` VALUES ('662314752V','Hasantha Weerakoon','Lecturer','PASS'),('665231478V','Lakshan Nanayakkara','Manager','FAIL'),('905841235V','Dinuth Perera','Manager','PASS'),('925841235V','Nadeesh Siriwardana','Manager','PASS'),('955841235V','Sanuli Kulasooriya','Manager','Fail'),('966521478V','Priyashan Fernando','Lecturer','PASS'),('966521961V','hiruni dep','Lecturer','PASS');
/*!40000 ALTER TABLE `emp_interview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_leave`
--

DROP TABLE IF EXISTS `emp_leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp_leave` (
  `eid` int(4) unsigned zerofill NOT NULL,
  `leaveDate` date NOT NULL,
  `leaveType` varchar(15) DEFAULT NULL,
  `noOfDays` float DEFAULT '0',
  PRIMARY KEY (`eid`,`leaveDate`),
  CONSTRAINT `emp_leave_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employee` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_leave`
--

LOCK TABLES `emp_leave` WRITE;
/*!40000 ALTER TABLE `emp_leave` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_leave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `userID` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `FullName` varchar(50) DEFAULT NULL,
  `NIC` char(12) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `BDate` date DEFAULT NULL,
  `MaStatus` varchar(10) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Mobile` varchar(20) DEFAULT NULL,
  `Home` varchar(20) DEFAULT NULL,
  `DateJoined` date DEFAULT NULL,
  `EmpType` varchar(30) DEFAULT NULL,
  `EduQulification` varchar(100) DEFAULT 'NO',
  `Experience` varchar(100) DEFAULT 'NO',
  `subject` varchar(20) DEFAULT 'NO',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (0001,'Nadeesh Siriwardana','925841235V','No:31, New road, Kalutara','male','1992-10-03','Married','nadeesh@gmail.com','0710258938','0342224530','2015-06-13','Manager','Bsc degree in Accounting','Working as a instructor in NSBM University','No'),(0002,'Priyashan Fernando','966521478V','No:52/1Kalutara','male','1956-10-20','Married','priyashan@gmail.com','0712547899','011255478','2014-06-13','Lecturer','Bsc degree in Accounting','Working as Senior lecturer in ACBT','Business Taxation'),(0003,'Hasantha Weerakoon','662314752V','No:20, Colombo 03','female','1966-10-20','Married','hasantha@gmail.com','071258433','0112500774','2012-06-13','Manager','Bsc degree in Management','Working as manager in MAS holdings','No'),(0004,'Dinuth Perera','905841235V','Piriwena road, Malabe','male','1995-11-20','Unmarried','dinu@gmail.com','071452899','0124785362','2011-06-13','Manager','Bsc degree in Hospitality Managment','5 Year Working experience in Marina Foods(pvt) ltd','No');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrytest`
--

DROP TABLE IF EXISTS `entrytest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrytest` (
  `NIC` varchar(12) NOT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `OL_year` int(11) DEFAULT NULL,
  `indexNo` int(11) DEFAULT NULL,
  `test_Result` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `maths` char(2) DEFAULT NULL,
  `english` char(2) DEFAULT NULL,
  `language` char(2) DEFAULT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrytest`
--

LOCK TABLES `entrytest` WRITE;
/*!40000 ALTER TABLE `entrytest` DISABLE KEYS */;
INSERT INTO `entrytest` VALUES ('947896325V','0717954658','G.C Rathnayake',2012,30116,'pass','114/9| AVARIAWATTE ROAD  Wattala','A','A','A'),('97156324598V','0778965326','Silva',2012,62536,'Fail','No. 22/1, Wilgoda Rd, Kurunegala.','C','F','C'),('971590432V','0717954658','G.C Rathnayake',2012,30116,'pass','114/9| AVARIAWATTE ROAD  Wattala','A','A','A'),('974563214V','0757739896','Ishan',2013,30565,'Pass','635, Galle Road, Rawathawalta','A','A','A'),('979989856V','0767739896','Fasrin',2013,30117,'Pass','244/2A Manikkamulla Road,Gothatuwa','A','B','A');
/*!40000 ALTER TABLE `entrytest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `examCode` varchar(5) NOT NULL,
  `batch` varchar(20) DEFAULT NULL,
  `examType` varchar(20) DEFAULT NULL,
  `examDate` date DEFAULT NULL,
  `examTime` time DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `subjectCode` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`examCode`),
  KEY `fk_exam` (`subjectCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES ('E001','1','JANUARY','2018-01-01','08:45:00',3,'SA01');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hall`
--

DROP TABLE IF EXISTS `hall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hall` (
  `hallNum` int(11) NOT NULL,
  `capacity` int(11) DEFAULT NULL,
  PRIMARY KEY (`hallNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hall`
--

LOCK TABLES `hall` WRITE;
/*!40000 ALTER TABLE `hall` DISABLE KEYS */;
INSERT INTO `hall` VALUES (1,20);
/*!40000 ALTER TABLE `hall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issueresource`
--

DROP TABLE IF EXISTS `issueresource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `issueresource` (
  `sid` int(11) NOT NULL,
  `ISBN_num` varchar(30) NOT NULL,
  `issueDate` date NOT NULL,
  `expiryDate` date DEFAULT NULL,
  `returnDate` date DEFAULT NULL,
  `issueresourcecol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ISBN_num`,`sid`,`issueDate`),
  KEY `fk1_issueResource` (`sid`),
  CONSTRAINT `fk1_issueResource` FOREIGN KEY (`sid`) REFERENCES `student` (`userID`),
  CONSTRAINT `fk2_issueResource` FOREIGN KEY (`ISBN_num`) REFERENCES `libraryresources` (`ISBN_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issueresource`
--

LOCK TABLES `issueresource` WRITE;
/*!40000 ALTER TABLE `issueresource` DISABLE KEYS */;
INSERT INTO `issueresource` VALUES (100,'1284572630','2018-09-26','2018-10-03','2018-09-26',NULL),(101,'1348321780','2018-09-23','2018-09-30','2018-09-23',NULL),(100,'6129034780','2018-09-23','2018-09-30','2018-09-23',NULL);
/*!40000 ALTER TABLE `issueresource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecture_time`
--

DROP TABLE IF EXISTS `lecture_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lecture_time` (
  `timePeriod` varchar(30) NOT NULL,
  `day` varchar(10) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `hallNum` int(11) DEFAULT NULL,
  `LectrerName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`timePeriod`,`day`,`subject`),
  KEY `fk3_Lecture_time` (`hallNum`),
  CONSTRAINT `fk3_Lecture_time` FOREIGN KEY (`hallNum`) REFERENCES `hall` (`hallNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecture_time`
--

LOCK TABLES `lecture_time` WRITE;
/*!40000 ALTER TABLE `lecture_time` DISABLE KEYS */;
INSERT INTO `lecture_time` VALUES ('10.30 am to 12.30 pm','Friday','accounts',1,'null'),('256','Sunday','accounts',1,'null'),('65','Saturday','accounts',1,'null'),('8.30 am to 10.30 pm','Wednesday','Financial Accounting',1,'null'),('8.30 to 10.30','Tuesday','Business Taxation',1,'null'),('8.30hjc','Friday','accounts',1,'null'),('8.30hjc','Monday','accounts',1,'null');
/*!40000 ALTER TABLE `lecture_time` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libraryresources`
--

DROP TABLE IF EXISTS `libraryresources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libraryresources` (
  `ISBN_num` varchar(30) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `authorName` varchar(40) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `edition` float DEFAULT NULL,
  `subject` varchar(30) DEFAULT NULL,
  `Availability` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ISBN_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libraryresources`
--

LOCK TABLES `libraryresources` WRITE;
/*!40000 ALTER TABLE `libraryresources` DISABLE KEYS */;
INSERT INTO `libraryresources` VALUES ('1284572630','The Founder Dilemmas','Noam Wasserman',1500,3,'Assurance',0),('1348321780','Dust','Yvonne Adhiambo',1200,5,'Assurance',0),('4856738270','The Science of Getting Rich','Wallace Wattles',1500,2,'Financial Accounting',1),('5834102930','The Moor Account','Laila Lalami',2300,5,'mangement accounting',1),('6129034780','Acres of Diamonds','Russell Conwell',2000,1,'Business Taxation',0),('8945830290','Linchpin: Are You Indispensable?','Seth Godin',3200,3,'Financial Accounting',1);
/*!40000 ALTER TABLE `libraryresources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `userType` varchar(20) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `userID` int(11) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`userType`,`userID`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('Lecturer','BBB',2,'123'),('Lecturer','fff',29,'fff'),('Lecturer','sss',31,'123'),('Lecturer','Ganeesha',60,'ganeesha123'),('Lecturer','Fasrin',63,'fasrin123'),('Lecturer','Jahrin',66,'jahrin123'),('Lecturer','Rushaid',67,'rushaid123'),('Lecturer','Wazeem',71,'wazeem123'),('Lecturer','Nirash',74,'nirash123'),('Lecturer','Hiruni',77,'hiruni123'),('Lecturer','Rashmini',80,'rashmini123'),('Lecturer','Fasrin',100,'fasrin123'),('Lecturer','Ganeesha',101,'ganeesha123'),('Lecturer','Jahrin',102,'jahrin123'),('Lecturer','Rushaid',103,'rushaid123'),('Lecturer','Wazeem',104,'wazeem123'),('Lecturer','Nirash',105,'nirash123'),('Lecturer','Hiruni',106,'hiruni123'),('Lecturer','Rashmini',107,'rashmini123'),('Manager','jhrn',30,'123'),('Manager','Fasrin',61,'fasrin1234'),('Manager','Jahrin',62,'jahrin1234'),('Manager','Ganeesha',64,'ganeesha1234'),('Manager','Rushaid',68,'rushaid1234'),('Manager','Wazeem',72,'wazeem1234'),('Manager','Nirash',75,'nirash1234'),('Manager','Hiruni',78,'hiruni1234'),('Manager','Rashmini',81,'rashmini1234'),('Manager','Fasrin',108,'fasrin1234'),('Manager','Jahrin',109,'jahrin1234'),('Manager','Ganeesha',110,'ganeesha1234'),('Manager','Rushaid',111,'rushaid1234'),('Manager','Wazeem',112,'wazeem1234'),('Manager','Nirash',113,'nirash1234'),('Manager','Hiruni',114,'hiruni1234'),('Manager','Rashmini',115,'rashmini1234'),('Student','Wazeem',70,'wazeem'),('Student','Fasrin',102,'123456789'),('Student','Fasrin',116,'fasrin'),('Student','Ganeesha',117,'ganeesha'),('Student','Jahrin',118,'jahrin'),('Student','Rushaid',119,'rushaid'),('Student','Wazeem',120,'wazeem'),('Student','Nirash',121,'nirash'),('Student','Hiruni',122,'hiruni'),('Student','Rashmini',123,'rashmini');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `result` (
  `studentID` varchar(5) NOT NULL,
  `Subject_name` varchar(20) NOT NULL,
  `marks` int(11) NOT NULL,
  PRIMARY KEY (`studentID`,`Subject_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES ('100','Financial Accounting',50),('3','accounts',50);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary` (
  `year` int(11) NOT NULL,
  `month` varchar(15) NOT NULL,
  `EID` int(4) unsigned zerofill NOT NULL,
  `bonus` double DEFAULT '0',
  `deductions` double DEFAULT '0',
  `basic_salary` double DEFAULT '0',
  `no_pay` double DEFAULT '0',
  `net_salary` double DEFAULT '0',
  `gross_salary` double DEFAULT '0',
  `festival` double DEFAULT '0',
  `OT` double DEFAULT '0',
  `balance_sal` double DEFAULT '0',
  `gross_Amt` double DEFAULT '0',
  `EPF` double DEFAULT '0',
  PRIMARY KEY (`year`,`month`,`EID`),
  KEY `EID` (`EID`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`EID`) REFERENCES `employee` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (2018,'October',0001,1000,0,25000,-29166.666666666668,53166.66666666667,26000,0,0,53166.66666666667,53166.66666666667,2000),(2018,'October',0002,2000,0,30000,-35000,64600,32000,0,0,64600,64600,2400),(2018,'October',0003,1000,0,23000,-26833.333333333332,48993.33333333333,24000,0,0,48993.33333333333,48993.33333333333,1840),(2018,'October',0004,1000,0,22000,-25666.666666666668,46906.66666666667,23000,0,0,46906.66666666667,46906.66666666667,1760);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stu_attendance`
--

DROP TABLE IF EXISTS `stu_attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stu_attendance` (
  `sid` int(11) NOT NULL,
  `date` date NOT NULL,
  `subjectCode` varchar(5) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sid`,`date`,`subjectCode`),
  KEY `subjectCode` (`subjectCode`),
  CONSTRAINT `stu_attendance_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student` (`userID`),
  CONSTRAINT `stu_attendance_ibfk_2` FOREIGN KEY (`subjectCode`) REFERENCES `subject` (`subCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stu_attendance`
--

LOCK TABLES `stu_attendance` WRITE;
/*!40000 ALTER TABLE `stu_attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `stu_attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `regDate` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contactNum` int(11) DEFAULT NULL,
  `parentName` varchar(50) DEFAULT NULL,
  `parentOC` varchar(30) DEFAULT NULL,
  `p_WorkingPlace` varchar(70) DEFAULT NULL,
  `courseCode` varchar(20) DEFAULT NULL,
  `NIC` varchar(12) DEFAULT NULL,
  `w_Telephone` int(11) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  KEY `constraint fk1_student_idx` (`NIC`),
  KEY `constraint fk2_ Student_idx` (`courseCode`),
  CONSTRAINT `constraint fk1_Student` FOREIGN KEY (`NIC`) REFERENCES `entrytest` (`NIC`),
  CONSTRAINT `constraint fk2_ Student` FOREIGN KEY (`courseCode`) REFERENCES `course` (`courseCode`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (100,'Fasrin Aleem','Male','1997-06-07','244/2A Manikkamulla Road Gothatuwa.','2018-09-17','fasrinaleem@gmail.com',767739896,'S.M Aleem','Principal','Malwana','A001','979989856V',716283896),(101,'G.C Rathnayake','Female','1995-12-12','114/9  Avariawatte Road Wattala.','2018-09-17','gcrathnayake@gmail.com',717955469,'Rathnayake','Business','Mabola','BM01','947896325V',776894628),(102,'Fasrin Aleem','Male','1997-10-01','Gothatuwa','2018-10-01','fasrinaleem@gmail.com',767739896,'Aleem','Businesss','Wattala','BM01','971590432V',716283936);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_exam`
--

DROP TABLE IF EXISTS `student_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_exam` (
  `examCode` varchar(5) NOT NULL,
  `studentID` varchar(5) NOT NULL,
  PRIMARY KEY (`examCode`,`studentID`),
  KEY `examCode` (`examCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_exam`
--

LOCK TABLES `student_exam` WRITE;
/*!40000 ALTER TABLE `student_exam` DISABLE KEYS */;
INSERT INTO `student_exam` VALUES ('E001','100'),('E001','101');
/*!40000 ALTER TABLE `student_exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentfeedback`
--

DROP TABLE IF EXISTS `studentfeedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentfeedback` (
  `feedbackID` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) NOT NULL,
  `course` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`feedbackID`,`userID`),
  KEY `studentfeedback_ibfk_1_idx` (`userID`),
  CONSTRAINT `studentfeedback_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `student` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentfeedback`
--

LOCK TABLES `studentfeedback` WRITE;
/*!40000 ALTER TABLE `studentfeedback` DISABLE KEYS */;
INSERT INTO `studentfeedback` VALUES (100,100,'Assuarnce','Should give some references','2018-09-29'),(101,101,'IPCC','good','2018-05-21');
/*!40000 ALTER TABLE `studentfeedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `subCode` varchar(5) NOT NULL,
  `subName` varchar(20) DEFAULT NULL,
  `courseCode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`subCode`),
  KEY `courseCode_idx` (`courseCode`),
  CONSTRAINT `courseCode` FOREIGN KEY (`courseCode`) REFERENCES `course` (`courseCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('SA01','Financial Accounting','A001'),('SA02','Business Taxation','A001'),('SB01','mangement accounting','BM01'),('SC01','Assurance ','CA01'),('SC02','IPCC','CA01');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `total_leave`
--

DROP TABLE IF EXISTS `total_leave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `total_leave` (
  `empID` int(4) unsigned zerofill NOT NULL,
  `working_year` int(11) NOT NULL DEFAULT '0',
  `medical` float DEFAULT '0',
  `annual` float DEFAULT '0',
  `casual` float DEFAULT '0',
  PRIMARY KEY (`empID`,`working_year`),
  CONSTRAINT `total_leave_ibfk_1` FOREIGN KEY (`empID`) REFERENCES `employee` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `total_leave`
--

LOCK TABLES `total_leave` WRITE;
/*!40000 ALTER TABLE `total_leave` DISABLE KEYS */;
/*!40000 ALTER TABLE `total_leave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-01 19:35:10
