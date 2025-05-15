-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2025 at 07:12 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

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
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `b_id` int(10) NOT NULL,
  `client_id` int(10) NOT NULL,
  `photographer_id` int(10) NOT NULL,
  `package_id` int(10) NOT NULL,
  `event_time` time NOT NULL,
  `reception` varchar(50) NOT NULL,
  `event_date` date NOT NULL,
  `payment_method` varchar(50) NOT NULL,
  `total_amount` decimal(10,2) NOT NULL,
  `downpayment` decimal(10,2) NOT NULL,
  `sukli` decimal(10,2) NOT NULL,
  `balance` decimal(10,2) NOT NULL,
  `status` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`b_id`, `client_id`, `photographer_id`, `package_id`, `event_time`, `reception`, `event_date`, `payment_method`, `total_amount`, `downpayment`, `sukli`, `balance`, `status`, `created_at`, `updated_at`) VALUES
(5, 1, 5, 2, '10:00:00', 'Bayawan city', '2025-12-30', 'Cash', 6800.00, 6500.00, 0.00, 300.00, 'Cancelled', '2025-05-14 20:32:09', '2025-05-15 04:55:59'),
(6, 2, 1, 3, '10:30:00', 'Candiis, Badian', '2025-12-27', 'Cash', 6500.00, 6500.00, 0.00, 0.00, 'Approved', '2025-05-15 09:01:44', '2025-05-15 15:18:46'),
(7, 3, 5, 3, '11:00:00', 'Inoburan, City of Naga', '2025-12-27', 'Cash', 7500.00, 7000.00, 0.00, 500.00, 'Approved', '2025-05-15 09:05:18', '2025-05-15 15:19:35'),
(8, 1, 5, 3, '01:00:00', 'Cebu', '2025-12-31', 'Cash', 7500.00, 7500.00, 0.00, 0.00, 'Pending', '2025-05-15 15:16:05', '2025-05-15 15:16:05');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `c_id` int(10) NOT NULL,
  `c_fname` varchar(50) NOT NULL,
  `c_lname` varchar(50) NOT NULL,
  `c_address` varchar(50) NOT NULL,
  `c_email` varchar(50) NOT NULL,
  `c_contact` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`c_id`, `c_fname`, `c_lname`, `c_address`, `c_email`, `c_contact`) VALUES
(1, 'Ashuri', 'Balbon', 'Lapay, Bayawan City', 'ashuri@gmail.com', '09051361453'),
(2, 'John', 'Gomez', 'Badian', 'john@gmail.com', '09874518523'),
(3, 'Queny', 'Waskin', 'Asturias', 'quen@gmail.com', '09874581234');

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
(38, 119, 'User logged in with ID 119', '2025-04-29 09:46:14'),
(39, 119, 'User logged in with ID 119', '2025-04-29 14:58:11'),
(40, 119, 'User logged in with ID 119', '2025-04-29 15:31:32'),
(41, 119, 'User logged out with ID 119', '2025-04-29 15:33:12'),
(42, 124, 'User logged in with ID 124', '2025-04-29 15:34:12'),
(43, 124, 'User logged in with ID 124', '2025-04-29 15:35:16'),
(44, 124, 'User logged in with ID 124', '2025-04-29 15:38:37'),
(45, 124, 'User logged out with ID 124', '2025-04-29 15:39:53'),
(46, 124, 'User logged in with ID 124', '2025-04-29 16:12:00'),
(47, 124, 'User logged in with ID 124', '2025-04-29 16:21:43'),
(48, 119, 'User logged in with ID 119', '2025-05-01 11:12:16'),
(49, 122, 'User logged in with ID 122', '2025-05-13 14:23:20'),
(50, 122, 'User logged in with ID 122', '2025-05-13 14:24:04'),
(51, 122, 'User logged in with ID 122', '2025-05-14 10:30:05'),
(52, 125, 'User logged in with ID 125', '2025-05-14 13:52:39'),
(53, 125, 'User logged in with ID 125', '2025-05-14 13:57:41'),
(54, 125, 'User logged in with ID 125', '2025-05-14 13:58:38'),
(55, 125, 'User logged out with ID 125', '2025-05-14 14:01:30'),
(56, 125, 'User logged in with ID 125', '2025-05-14 14:01:39'),
(57, 125, 'User logged in with ID 125', '2025-05-14 14:05:37'),
(58, 125, 'User logged in with ID 125', '2025-05-14 14:11:02'),
(59, 125, 'User logged in with ID 125', '2025-05-14 14:18:10'),
(60, 125, 'User logged in with ID 125', '2025-05-14 14:21:55'),
(61, 122, 'User logged in with ID 122', '2025-05-14 14:25:13'),
(62, 122, 'User logged out with ID 122', '2025-05-14 14:25:25'),
(63, 125, 'User logged in with ID 125', '2025-05-14 14:26:21'),
(64, 125, 'User logged in with ID 125', '2025-05-14 14:41:12'),
(65, 125, 'User logged out with ID 125', '2025-05-14 14:41:19'),
(66, 125, 'User logged in with ID 125', '2025-05-14 14:41:37'),
(67, 125, 'User logged in with ID 125', '2025-05-14 15:02:22'),
(68, 125, 'User logged in with ID 125', '2025-05-14 15:17:44'),
(69, 125, 'User logged in with ID 125', '2025-05-14 15:19:52'),
(70, 122, 'User logged in with ID 122', '2025-05-14 15:37:02'),
(71, 122, 'User logged in with ID 122', '2025-05-14 15:37:56'),
(72, 122, 'User logged out with ID 122', '2025-05-14 15:38:04'),
(73, 125, 'User logged in with ID 125', '2025-05-14 16:00:29'),
(74, 125, 'User logged in with ID 125', '2025-05-14 16:03:22'),
(75, 125, 'User logged out with ID 125', '2025-05-14 16:03:33'),
(76, 125, 'User logged in with ID 125', '2025-05-14 16:52:50'),
(77, 125, 'User logged in with ID 125', '2025-05-14 16:55:57'),
(78, 125, 'User logged out with ID 125', '2025-05-14 16:56:05'),
(79, 122, 'User logged in with ID 122', '2025-05-14 16:57:34'),
(80, 125, 'User logged in with ID 125', '2025-05-14 17:05:33'),
(81, 122, 'User logged in with ID 122', '2025-05-14 17:09:08'),
(82, 122, 'User logged in with ID 122', '2025-05-14 17:13:21'),
(83, 122, 'User logged in with ID 122', '2025-05-14 17:15:19'),
(84, 122, 'User logged in with ID 122', '2025-05-14 17:17:35'),
(85, 122, 'User logged in with ID 122', '2025-05-14 17:24:12'),
(86, 122, 'User logged in with ID 122', '2025-05-14 17:27:45'),
(87, 122, 'User logged in with ID 122', '2025-05-14 17:28:40'),
(88, 122, 'User set up security questions', '2025-05-14 17:28:52'),
(89, 122, 'User logged in with ID 122', '2025-05-14 18:16:30'),
(90, 122, 'User logged in with ID 122', '2025-05-14 18:38:05'),
(91, 122, 'User logged in with ID 122', '2025-05-14 18:44:41'),
(92, 122, 'User logged in with ID 122', '2025-05-14 18:47:35'),
(93, 122, 'User logged in with ID 122', '2025-05-14 18:50:05'),
(94, 122, 'User logged in with ID 122', '2025-05-14 18:56:00'),
(95, 122, 'User logged in with ID 122', '2025-05-14 19:10:30'),
(96, 122, 'Added new client with ID 2', '2025-05-14 19:11:14'),
(97, 122, 'Added new photographer with ID 5', '2025-05-14 19:12:43'),
(98, 122, 'Added new package with ID 3', '2025-05-14 19:13:45'),
(99, 122, 'Created a booking withnull', '2025-05-14 19:14:44'),
(100, 122, 'User logged in with ID 122', '2025-05-14 19:20:33'),
(101, 122, 'Created a booking with ID: 4', '2025-05-14 19:21:29'),
(102, 122, 'User logged in with ID 122', '2025-05-14 20:27:38'),
(103, 122, 'User logged in with ID 122', '2025-05-14 20:31:35'),
(104, 122, 'Created a booking with ID: 5', '2025-05-14 20:32:10'),
(105, 122, 'User logged in with ID 122', '2025-05-14 21:12:13'),
(106, 122, 'User logged in with ID 122', '2025-05-14 21:14:32'),
(107, 122, 'User logged in with ID 122', '2025-05-14 21:17:47'),
(108, 122, 'User logged in with ID 122', '2025-05-15 01:05:23'),
(109, 122, 'User logged in with ID 122', '2025-05-15 01:13:23'),
(110, 122, 'User logged in with ID 122', '2025-05-15 01:16:22'),
(111, 122, 'User logged in with ID 122', '2025-05-15 01:17:50'),
(112, 122, 'User logged in with ID 122', '2025-05-15 03:10:41'),
(113, 122, 'Edited a package with ID 3', '2025-05-15 03:10:48'),
(114, 122, 'Edited a package with ID 3', '2025-05-15 03:10:54'),
(115, 122, 'User logged in with ID 122', '2025-05-15 04:55:35'),
(116, 122, 'Approved a booking ID 5', '2025-05-15 04:55:49'),
(117, 122, 'Cancelled a booking with ID 5', '2025-05-15 04:55:53'),
(118, 122, 'Approved a booking ID 5', '2025-05-15 04:55:56'),
(119, 122, 'Cancelled a booking with ID 5', '2025-05-15 04:55:59'),
(120, 122, 'User logged in with ID 122', '2025-05-15 05:18:20'),
(121, 122, 'User logged in with ID 122', '2025-05-15 06:51:42'),
(122, 122, 'User logged in with ID 122', '2025-05-15 07:03:07'),
(123, 122, 'User logged in with ID 122', '2025-05-15 07:19:50'),
(124, 122, 'User logged in with ID 122', '2025-05-15 07:23:41'),
(125, 122, 'User logged in with ID 122', '2025-05-15 07:37:49'),
(126, 122, 'User logged in with ID 122', '2025-05-15 07:42:52'),
(127, 122, 'User logged in with ID 122', '2025-05-15 08:59:01'),
(128, 122, 'User logged in with ID 122', '2025-05-15 09:00:51'),
(129, 122, 'Created a booking with ID: 6', '2025-05-15 09:01:45'),
(130, 122, 'Added new client with ID 3', '2025-05-15 09:03:44'),
(131, 122, 'Created a booking with ID: 7', '2025-05-15 09:05:20'),
(132, 122, 'Approved a booking ID 7', '2025-05-15 09:06:16'),
(133, 122, 'Cancelled a booking with ID 7', '2025-05-15 09:06:28'),
(134, 122, 'Approved a booking ID 7', '2025-05-15 09:06:32'),
(135, 122, 'User logged in with ID 122', '2025-05-15 09:10:04'),
(136, 122, 'User logged in with ID 122', '2025-05-15 09:16:17'),
(137, 122, 'User logged in with ID 122', '2025-05-15 09:18:54'),
(138, 122, 'User logged in with ID 122', '2025-05-15 09:19:48'),
(139, 122, 'User logged in with ID 122', '2025-05-15 09:21:45'),
(140, 122, 'User logged in with ID 122', '2025-05-15 09:25:44'),
(141, 122, 'User logged in with ID 122', '2025-05-15 09:27:24'),
(142, 122, 'User logged in with ID 122', '2025-05-15 09:28:50'),
(143, 122, 'User logged in with ID 122', '2025-05-15 09:39:25'),
(144, 122, 'User logged in with ID 122', '2025-05-15 09:41:48'),
(145, 122, 'User logged in with ID 122', '2025-05-15 09:42:35'),
(146, 122, 'User logged in with ID 122', '2025-05-15 13:34:36'),
(147, 122, 'User logged in with ID 122', '2025-05-15 14:26:09'),
(148, 122, 'User logged in with ID 122', '2025-05-15 14:28:08'),
(149, 122, 'User logged in with ID 122', '2025-05-15 14:34:41'),
(150, 122, 'User logged in with ID 122', '2025-05-15 14:37:16'),
(151, 122, 'User logged in with ID 122', '2025-05-15 14:39:08'),
(152, 122, 'User logged in with ID 122', '2025-05-15 14:41:34'),
(153, 122, 'User logged in with ID 122', '2025-05-15 15:03:57'),
(154, 122, 'User logged in with ID 122', '2025-05-15 15:06:24'),
(155, 122, 'User logged in with ID 122', '2025-05-15 15:08:39'),
(156, 122, 'User logged in with ID 122', '2025-05-15 15:14:16'),
(157, 122, 'Created a booking with ID: 8', '2025-05-15 15:16:07'),
(158, 122, 'User logged in with ID 122', '2025-05-15 15:17:33'),
(159, 122, 'Approved a booking ID 6', '2025-05-15 15:18:46'),
(160, 122, 'Cancelled a booking with ID 7', '2025-05-15 15:19:26'),
(161, 122, 'Approved a booking ID 7', '2025-05-15 15:19:35'),
(162, 122, 'User logged in with ID 122', '2025-05-15 15:25:08'),
(163, 122, 'User logged in with ID 122', '2025-05-15 15:51:12'),
(164, 122, 'User logged in with ID 122', '2025-05-15 16:12:33'),
(165, 122, 'User logged in with ID 122', '2025-05-15 16:47:15'),
(166, 122, 'User logged in with ID 122', '2025-05-15 16:53:18'),
(167, 122, 'User logged in with ID 122', '2025-05-15 16:59:20');

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
(2, 'Wedding', '5000', 'ambot lang uy', 'Soft and Hard Copies', '3'),
(3, 'Birthday', '4500', 'Very affordable', 'Picture frame', '5');

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
(1, 'Shiena', 'Balbon', 'shien@gmail.com', '09874586328', '5 years', 'Portrait', '400'),
(2, 'Lovely', 'Balbon', 'shien@gmail.com', '09874562354', '2 years', 'Wedding', '500'),
(5, 'Twengcle', 'Deguma', 'tweng@gmail.com', '09845715236', '5 years', 'Portrait', '600');

-- --------------------------------------------------------

--
-- Table structure for table `securityquestion`
--

CREATE TABLE `securityquestion` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `question` varchar(250) NOT NULL,
  `answer` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `securityquestion`
--

INSERT INTO `securityquestion` (`id`, `user_id`, `question`, `answer`) VALUES
(48, 125, 'Who\'s your bff?', '976d9dbc51bceef5054bad47e15df25b88d5b7ba564db3830b64b09e658d0627'),
(49, 125, 'What\'s your middle name?', '933a37f4669734dd766168de429a12ef80ab6fd1731c59601a4c7b46f3a12d87'),
(58, 122, 'What\'s your favorite fruit?', '6815f3c300383519de8e437497e2c3e97852fe8d717a5419d5aafb00cb43c494'),
(59, 122, 'What\'s your favorite food?', '6815f3c300383519de8e437497e2c3e97852fe8d717a5419d5aafb00cb43c494');

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
(119, 'Clair', 'Lagunday', 'clair@gmail.com', '09874562589', 'lita', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Admin', 'Active'),
(121, 'john', 'phil', 'John12@gmail.com', '09563215648', 'jampil', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Staff', 'Active'),
(122, 'Aida', 'Minguito', 'aida@gmail.com', '09845712568', 'aida', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Admin', 'Active'),
(123, 'Zehirah', 'Balbon', 'zee@gmail.com', '09874512365', 'zee', '8a9bcf1e51e812d0af8465a8dbcc9f741064bf0af3b3d08e6b0246437c19f7fb', 'Admin', 'Approved'),
(124, 'test', 'test', 'test@gmail.com', '09896735467', 'test', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'Admin', 'Approved'),
(125, 'Mike', 'Balbon', 'mike@gmail.com', '09161430869', 'mike', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`b_id`),
  ADD KEY `client_id` (`client_id`),
  ADD KEY `photographer_id` (`photographer_id`),
  ADD KEY `package_id` (`package_id`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`c_id`);

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
-- Indexes for table `securityquestion`
--
ALTER TABLE `securityquestion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `b_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `c_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `l_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=168;

--
-- AUTO_INCREMENT for table `package`
--
ALTER TABLE `package`
  MODIFY `pp_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `photographer`
--
ALTER TABLE `photographer`
  MODIFY `p_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `securityquestion`
--
ALTER TABLE `securityquestion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=126;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`client_id`) REFERENCES `client` (`c_id`),
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`photographer_id`) REFERENCES `photographer` (`p_id`),
  ADD CONSTRAINT `booking_ibfk_3` FOREIGN KEY (`package_id`) REFERENCES `package` (`pp_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
