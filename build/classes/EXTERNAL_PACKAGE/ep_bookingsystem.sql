-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2025 at 04:45 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ep_bookingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `l_id` int(10) NOT NULL,
  `u_id` int(10) NOT NULL,
  `action` varchar(200) NOT NULL,
  `date_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`l_id`, `u_id`, `action`, `date_time`) VALUES
(1, 118, 'Added new user with ID 121', '2025-04-02 08:09:54'),
(2, 119, 'Added new photographer with ID 2', '2025-04-14 01:46:31'),
(3, 119, 'Added new photographer with ID 3', '2025-04-14 01:51:38'),
(4, 119, 'Edited new photographer with ID 0', '2025-04-14 02:56:17'),
(6, 119, 'Edited user with ID 0', '2025-04-14 04:01:19'),
(7, 119, 'Deleted user with ID 116', '2025-04-14 04:48:26'),
(8, 119, 'Edited user with ID 0', '2025-04-14 04:49:05'),
(9, 119, 'Deleted photographer with ID 3', '2025-04-14 05:20:05'),
(10, 121, 'Added new photographer with ID 4', '2025-04-14 06:07:56'),
(11, 121, 'Deleted photographer with ID 4', '2025-04-14 06:08:18'),
(12, 121, 'Edited photographer with ID 0', '2025-04-14 06:08:33'),
(13, 119, 'Deleted package with ID 1', '2025-04-16 16:27:52'),
(14, 119, 'Added new package with ID 2', '2025-04-16 16:29:11'),
(15, 119, 'Uaer logged in with ID 119', '2025-04-16 17:20:34'),
(16, 119, 'User logged in with ID 119', '2025-04-16 17:24:03'),
(17, 119, 'User logged out with ID 119', '2025-04-16 17:24:09'),
(18, 119, 'User logged out with ID 119', '2025-04-16 17:25:27'),
(19, 119, 'User logged in with ID 119', '2025-04-16 17:25:42'),
(20, 119, 'User logged out with ID 119', '2025-04-16 17:25:46'),
(21, 119, 'User logged in with ID 119', '2025-04-16 17:26:05'),
(22, 119, 'User logged out with ID 119', '2025-04-16 17:28:11'),
(23, 119, 'User logged in with ID 119', '2025-04-16 18:10:52'),
(24, 119, 'User logged out with ID 119', '2025-04-16 18:12:24'),
(25, 119, 'User logged in with ID 119', '2025-04-18 01:55:56'),
(26, 119, 'Edited photographer with ID 1', '2025-04-18 01:56:25'),
(27, 119, 'Edited photographer with ID 1', '2025-04-18 01:56:55'),
(28, 119, 'User logged in with ID 119', '2025-04-18 02:11:18'),
(29, 119, 'User logged in with ID 119', '2025-04-18 02:13:31'),
(30, 123, 'User logged in with ID 123', '2025-04-18 04:31:25'),
(31, 119, 'User logged in with ID 119', '2025-04-18 04:32:10'),
(32, 123, 'User logged in with ID 123', '2025-04-18 04:34:13'),
(33, 123, 'User logged out with ID 123', '2025-04-18 05:01:25'),
(34, 119, 'User logged in with ID 119', '2025-04-18 05:01:39'),
(35, 119, 'User logged in with ID 119', '2025-04-22 05:32:54'),
(36, 119, 'User logged out with ID 119', '2025-04-22 05:40:35'),
(37, 119, 'User logged in with ID 119', '2025-04-29 09:36:48'),
(38, 119, 'User logged in with ID 119', '2025-04-29 09:46:14');

-- --------------------------------------------------------

--
-- Table structure for table `package`
--

CREATE TABLE `package` (
  `pp_id` int(10) NOT NULL,
  `pp_name` varchar(50) NOT NULL,
  `pp_price` varchar(20) NOT NULL,
  `pp_desc` varchar(250) NOT NULL,
  `pp_service` varchar(250) NOT NULL,
  `pp_duration` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `package`
--

INSERT INTO `package` (`pp_id`, `pp_name`, `pp_price`, `pp_desc`, `pp_service`, `pp_duration`) VALUES
(2, 'Wedding', '5000', 'ambot lang uy', 'Soft and Hard copies', '3 hrs');

-- --------------------------------------------------------

--
-- Table structure for table `photographer`
--

CREATE TABLE `photographer` (
  `p_id` int(10) NOT NULL,
  `p_fname` varchar(30) NOT NULL,
  `p_lname` varchar(30) NOT NULL,
  `p_email` varchar(20) NOT NULL,
  `p_contact` varchar(50) NOT NULL,
  `p_experience` varchar(50) NOT NULL,
  `p_expertise` varchar(50) NOT NULL,
  `p_rate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `photographer`
--

INSERT INTO `photographer` (`p_id`, `p_fname`, `p_lname`, `p_email`, `p_contact`, `p_experience`, `p_expertise`, `p_rate`) VALUES
(1, 'Shiena', 'Balbon', 'shien@gmail.com', '09874586328', '5 years', 'Portrait', '400 per hour'),
(2, 'Lovely', 'Balbon', 'shien@gmail.com', '09874562354', '2 years', 'Wedding', '500 per hour');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_id` int(10) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` varchar(20) DEFAULT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `u_fname`, `u_lname`, `email`, `contact`, `username`, `password`, `role`, `status`) VALUES
(118, 'John', 'Phil', 'johnny@gmail.com', '09784561258', 'johnny', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Staff', 'Inactive'),
(119, 'Clair', 'Lagunday', 'clair@gmail.com', '09874562589', 'lita', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Admin', 'Active'),
(121, 'john', 'phil', 'John12@gmail.com', '09563215648', 'jampil', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Staff', 'Active'),
(122, 'Aida', 'Minguito', 'aida@gmail.com', '09845712568', 'aida', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Admin', 'Active'),
(123, 'Zehirah', 'Balbon', 'zee@gmail.com', '09874512365', 'zee', '8a9bcf1e51e812d0af8465a8dbcc9f741064bf0af3b3d08e6b0246437c19f7fb', 'Admin', 'Approved');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `package`
--
ALTER TABLE `package`
  ADD PRIMARY KEY (`pp_id`);

--
-- Indexes for table `photographer`
--
ALTER TABLE `photographer`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `l_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `package`
--
ALTER TABLE `package`
  MODIFY `pp_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `photographer`
--
ALTER TABLE `photographer`
  MODIFY `p_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
