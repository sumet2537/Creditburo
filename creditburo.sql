-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 28, 2016 at 11:18 AM
-- Server version: 5.6.28
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `creditburo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_backlist`
--

CREATE TABLE `tbl_backlist` (
  `id` int(11) NOT NULL,
  `br_Code` varchar(13) DEFAULT NULL,
  `br_Account` varchar(10) DEFAULT NULL,
  `br_Bank` varchar(255) DEFAULT NULL,
  `br_Name` varchar(50) DEFAULT NULL,
  `br_Lastname` varchar(50) DEFAULT NULL,
  `br_Total` decimal(10,2) DEFAULT NULL,
  `br_Status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_backlist`
--

INSERT INTO `tbl_backlist` (`id`, `br_Code`, `br_Account`, `br_Bank`, `br_Name`, `br_Lastname`, `br_Total`, `br_Status`) VALUES
(1, '1', '1', 'กรุงไทย', 'test', 'เทพ', '1000000.00', '1'),
(2, '2', '2', 'กรุงไทย', 'test', 'เทพ', '10000.00', '1'),
(3, '123', '', 'กรุงเทพ', 'test', 'เทพ', '0.00', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_backlist`
--
ALTER TABLE `tbl_backlist`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_backlist`
--
ALTER TABLE `tbl_backlist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
