-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 18, 2022 at 12:57 PM
-- Server version: 8.0.29
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nationalbloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `NIC` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact_NO` int DEFAULT NULL,
  `Address` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Linked_Branch` varchar(100) NOT NULL,
  `EmployeeID` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(30) NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`NIC`, `Name`, `Contact_NO`, `Address`, `Department`, `Linked_Branch`, `EmployeeID`, `Email`, `Password`) VALUES
('222', '222', 222, '222', '22222', '222', '222', 'sfasfaaaaaaa@gmail.com', '222'),
('25', '25', 25, '2225', '25', '25', '25', 'dddddddddddddddd@gmail.com', '25'),
('333', '333', 3333, '333', '333', '333', '333', 'd3333ff@gmail.com', '333'),
('44t', '44', 44, '44', '44', '44', '44', '44', '44');

-- --------------------------------------------------------

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
CREATE TABLE IF NOT EXISTS `donation` (
  `Donor_NIC` varchar(20) NOT NULL,
  `Donor_Name` varchar(50) NOT NULL,
  `Date` date NOT NULL,
  `Time` int NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Body_Weight` varchar(10) NOT NULL,
  `Blood_Gloucose_Level` varchar(10) NOT NULL,
  `Blood_Pressure` varchar(10) NOT NULL,
  `Body_Temperature` varchar(10) NOT NULL,
  `Donated_Place` varchar(100) NOT NULL,
  `No_Of_Bags` int NOT NULL,
  `Weight_of_Blood` varchar(10) NOT NULL,
  `Incharge_Officer_ID` varchar(10) NOT NULL,
  PRIMARY KEY (`Donor_NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `donation`
--

INSERT INTO `donation` (`Donor_NIC`, `Donor_Name`, `Date`, `Time`, `Blood_Group`, `Body_Weight`, `Blood_Gloucose_Level`, `Blood_Pressure`, `Body_Temperature`, `Donated_Place`, `No_Of_Bags`, `Weight_of_Blood`, `Incharge_Officer_ID`) VALUES
('11', '11', '2022-09-16', 11, 'A+', '11', '11', '11', '11', '11', 11, '11', '11'),
('22', 'dd', '2022-09-16', 22, 'A+', 'ss', 'ss', 'ss', 'ss', 'ss', 12, 'xx', 'xx'),
('223', '11', '2022-09-16', 11, 'A+', '11', '11', '11', '11', '11', 11, '11', '11'),
('33333', '33', '2022-09-16', 33, 'B+', '333', '33', '33', '33', '33', 3, '33', '33'),
('34', '34', '2022-09-16', 34, 'A-', '34', '34', '34', '34', '34', 34, '34', '34'),
('45', 'yasu', '2022-09-16', 1645, 'A-', 'f', 'f', 'f', 'f', 'f', 4, 'f', 'f'),
('66', '66', '2022-09-16', 66, 'A+', '66', '66', '66', '66', '66', 66, '66', '66'),
('98', 'dd', '2022-09-16', 23, 'B+', 'dddd', 'dd', 'dd', 'dd', 'dd', 2, '2', '2'),
('e', 'e', '2022-09-16', 1210, 'B+', 'rr', 'rr', 'rr', 'rr', 'rr', 2, 't', 't'),
('u7', '33', '2022-09-16', 35, 'B+', 'dd', 'dd', 'dd', 'dd', 'dd', 2, '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

DROP TABLE IF EXISTS `donor`;
CREATE TABLE IF NOT EXISTS `donor` (
  `NIC` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `Age` int NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Contact_NO` int NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(25) NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`NIC`, `Name`, `DOB`, `Age`, `Gender`, `Blood_Group`, `Address`, `Contact_NO`, `Email`, `Password`) VALUES
('222', '222', '2022-09-18', 22, 'M', 'A-', '22', 22, 'dddddddddddddd@gmail.com', '222'),
('2222r', 'rrr', '2022-09-02', 12, 'M', 'A-', 'ss', 12, '22', '22'),
('22v', 'ua', '2022-09-09', 10, 'M', 'A-', 'galle', 1111, 'ddd', 'ddd'),
('3333', 'ee', '2022-09-13', 33, 'M', 'B+', 'ee', 22, '2222', '22'),
('33456', '33', '2022-09-05', 44, 'M', 'A-', '44', 44, '44', '44'),
('335h', '22', '2022-09-13', 22, 'M', 'A-', '22', 22, '22', '22'),
('33v', 'ua', '2022-09-09', 10, 'M', 'A-', 'galle', 1111, 'ddd', 'ddd'),
('34', '34', '2022-09-13', 34, 'M', 'B+', 'kk', 34, '34', '34'),
('34567890', 'yasiru', '2022-09-16', 23, 'M', 'A-', 'admsms', 101019191, '2929', 'djj'),
('34t', 'rr', '2022-09-13', 44, 'M', 'B-', '44', 44, '44', '44'),
('356', 'ss', '2022-09-13', 32, 'M', 'AB+', '22', 22, '22', '22'),
('445c', 'ranil', '2022-09-12', 35, 'M', 'B+', 'galle', 4545, 'rr45', '45'),
('556h', 'ppppppp', '2022-09-12', 88, 'M', 'A-', 'hh', 55, 'uuu', '54'),
('5678', 'ee', '2022-09-07', 33, 'M', 'B+', 'ee', 33, 'ee', 'ee'),
('567890', '6542', '2022-09-16', 34, 'M', 'B+', '33', 33, 'yasiruchamudithawijesinghe@gmail.com', 'er'),
('5th', '44', '2022-09-16', 44, 'M', 'A-', '44', 44, 'ds@gmail.com', 'ww'),
('78458585', 'rusiru', '2022-09-13', 23, 'M', 'B-', 'hhhhhahhahaha', 101011010, 'ffff', 'r4'),
('9926119933v', 'chabi', '2022-09-12', 23, 'M', 'A-', 'galle', 9393822, 'yasiru@gamil.com', 'dd3'),
('994419105v', 'yasiru', '2022-09-12', 23, 'M', 'B-', 'galle', 1991838, 'ggg', 'ggg'),
('d43', 'ee', '2022-09-15', 23, 'M', 'A-', 'ff', 234, 'ff', '34'),
('d434', 'ee', '2022-09-15', 23, 'M', 'A-', 'ff', 234, 'ff', '34'),
('dd4', '4', '2022-09-12', 4, 'M', 'A-', '44', 44, '44', '44'),
('ddddddd2', 'dd', '2022-09-12', 12, 'M', 'B+', 'dd11', 11, '11', '11'),
('dddddddd3', 'dd', '2022-09-12', 55, 'M', 'A-', 'tt', 55, '55', '55'),
('ee', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('ee3', 'ww', '2022-09-13', 22, 'M', 'B-', '2222', 2222, '22', '22'),
('eed', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33w', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33ww', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwh', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwhw', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwwwhw', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwwwhwd', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwwwhwdx', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwwwhwdxs', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeds33wwwwhwdxss', 'ee', '2022-09-12', 12, 'F', 'B+', 'ddddddd', 1111, '11', '11'),
('eeee2', 'eeee', '2022-09-09', 12, 'M', 'A+', 'ww', 11, 'aaa', 'aa'),
('eeeeeeeee', 'eeeeeeeeeee', '2022-09-12', 12, 'M', 'B+', '22222222', 2222222, '2222222', '22'),
('gg', 'ff', '2022-09-08', 23, 'M', 'A-', '33333', 3333, '33', '33'),
('ggs', 'ff', '2022-09-08', 23, 'M', 'A-', '33333', 3333, '33', '33'),
('pp45', 'ppppppp', '2022-09-12', 88, 'M', 'A-', 'hh', 55, 'uuu', '54'),
('pppp', 'ppppppp', '2022-09-12', 88, 'M', 'A-', 'hh', 55, 'uuu', '54'),
('rr5', 'ff', '2022-09-08', 23, 'M', 'A-', '33333', 3333, '33', '33'),
('rrrg', 'ss', '2022-09-12', 23, 'M', 'A-', '22', 22, '22', '22'),
('rrrrrrrr', 'rrrr', '2022-09-12', 23, 'M', 'A+', '22f', 123, '33', 's2'),
('ss2', 'ss', '2022-09-12', 22, 'M', 'B+', 'ddddd', 11111, '11', '11'),
('t4', 'tt', '2022-09-13', 4, 'M', 'B-', '4', 4, '4', '44'),
('tttttttttttt5', '55', '2022-09-12', 55, 'M', 'A-', 'err', 33, '33', '33'),
('u6', 'ef', '2022-09-12', 12, 'M', 'A-', 'ff', 234, 'dd', 's2'),
('u62', 'ef', '2022-09-12', 12, 'M', 'A-', 'ff', 234, 'dd', 's2'),
('ww1', 'ww', '2022-09-12', 11, 'M', 'A-', '11', 11, '11', '11'),
('ww1qq', 'ww', '2022-09-12', 11, 'M', 'A-', '11', 11, '11', '11'),
('ww1qqw', 'ww', '2022-09-12', 11, 'M', 'A-', '11', 11, '11', '11');

-- --------------------------------------------------------

--
-- Table structure for table `donorappointment`
--

DROP TABLE IF EXISTS `donorappointment`;
CREATE TABLE IF NOT EXISTS `donorappointment` (
  `NIC` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Contact_No` int NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Time_Slot` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  `Nearest_Center` varchar(20) NOT NULL,
  `Blood_Group` varchar(20) NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `donorappointment`
--

INSERT INTO `donorappointment` (`NIC`, `Name`, `Contact_No`, `Email`, `Time_Slot`, `Date`, `Nearest_Center`, `Blood_Group`) VALUES
('222', '222', 222, 'yasiruchamuditha@gmail.com', '9.00 A.M - 10.00 A.M', '2022-09-09', 'galle', 'A-');

-- --------------------------------------------------------

--
-- Table structure for table `donororganization`
--

DROP TABLE IF EXISTS `donororganization`;
CREATE TABLE IF NOT EXISTS `donororganization` (
  `Reg_No` varchar(20) NOT NULL,
  `Organization_Name` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `MOH` varchar(50) NOT NULL,
  `Contact_No` int NOT NULL,
  PRIMARY KEY (`Reg_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `donororganization`
--

INSERT INTO `donororganization` (`Reg_No`, `Organization_Name`, `Date`, `MOH`, `Contact_No`) VALUES
('33', '33', '2022-09-17', '33', 33);

-- --------------------------------------------------------

--
-- Table structure for table `medicalstaff`
--

DROP TABLE IF EXISTS `medicalstaff`;
CREATE TABLE IF NOT EXISTS `medicalstaff` (
  `NIC` varchar(25) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Contact_No` int NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Blood_Group` varchar(10) NOT NULL,
  `Linked_Branch` varchar(100) NOT NULL,
  `Department` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `medicalstaff`
--

INSERT INTO `medicalstaff` (`NIC`, `Name`, `Contact_No`, `Address`, `Gender`, `Blood_Group`, `Linked_Branch`, `Department`, `Email`, `Password`) VALUES
('222', '222', 222, '222', 'M', 'A-', '222', '222', 'dafafffsssaaaaaa@gmail.com', '222'),
('33', '33', 33, '33', 'M', 'A-', '33', '33', '33', '33'),
('43', '33', 33, '33', 'M', 'A+', '33', '33', '33', '33'),
('56', '33', 33, '33', 'M', 'A-', '33', '33', '33', '33');

-- --------------------------------------------------------

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
CREATE TABLE IF NOT EXISTS `organization` (
  `RegNo` varchar(25) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Organizational_Contact_No` int NOT NULL,
  `Fax_no` int NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Member_Name` varchar(30) NOT NULL,
  `Member_Contact_no` int NOT NULL,
  `Member_Email` varchar(100) NOT NULL,
  `Organization_Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  PRIMARY KEY (`RegNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `organization`
--

INSERT INTO `organization` (`RegNo`, `Name`, `Organizational_Contact_No`, `Fax_no`, `Address`, `Member_Name`, `Member_Contact_no`, `Member_Email`, `Organization_Email`, `Password`) VALUES
('22', '22', 22, 22, '22', '22', 22, '22', '22', '22');

-- --------------------------------------------------------

--
-- Table structure for table `securityquestion`
--

DROP TABLE IF EXISTS `securityquestion`;
CREATE TABLE IF NOT EXISTS `securityquestion` (
  `NIC` varchar(20) NOT NULL,
  `Question01` varchar(100) NOT NULL,
  `Question02` varchar(100) DEFAULT NULL,
  `Question03` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `securityquestion`
--

INSERT INTO `securityquestion` (`NIC`, `Question01`, `Question02`, `Question03`) VALUES
('25', '25', '25', '25'),
('34', '34', '34', '34'),
('5', '5', NULL, NULL),
('kkk', 'kkk', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `storage`
--

DROP TABLE IF EXISTS `storage`;
CREATE TABLE IF NOT EXISTS `storage` (
  `Blood_Group` varchar(10) NOT NULL,
  `No_Of_Bags` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `storage`
--

INSERT INTO `storage` (`Blood_Group`, `No_Of_Bags`) VALUES
('A+', 66),
('A-', 4),
('B+', 13),
('B-', 0),
('AB+', 0),
('AB-', 0),
('O+', 0),
('O-', 0);

-- --------------------------------------------------------

--
-- Table structure for table `transcation`
--

DROP TABLE IF EXISTS `transcation`;
CREATE TABLE IF NOT EXISTS `transcation` (
  `Patient_NIC` varchar(20) NOT NULL,
  `Patient_Name` varchar(50) NOT NULL,
  `Patient_Contact_No` int NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(20) NOT NULL,
  `Blood_Group` varchar(20) NOT NULL,
  `Weight_Of_Blood` float NOT NULL,
  `No_Of_Bags` int NOT NULL,
  `Hospital_Linked` varchar(20) NOT NULL,
  `Incharge_Officer_ID` varchar(20) NOT NULL,
  PRIMARY KEY (`Patient_NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `transcation`
--

INSERT INTO `transcation` (`Patient_NIC`, `Patient_Name`, `Patient_Contact_No`, `Date`, `Time`, `Blood_Group`, `Weight_Of_Blood`, `No_Of_Bags`, `Hospital_Linked`, `Incharge_Officer_ID`) VALUES
('334', 'gg', 33, '2022-09-16', '33', 'A-', 45, 34, '33', '33');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
