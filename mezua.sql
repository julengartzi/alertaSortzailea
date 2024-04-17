-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 17-04-2024 a las 12:13:57
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alertasortzailea`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mezua`
--

CREATE TABLE `mezua` (
  `izena` varchar(50) NOT NULL,
  `deskribapena` varchar(250) NOT NULL,
  `jasotzailea` varchar(50) NOT NULL,
  `data` varchar(20) NOT NULL,
  `ordua` varchar(10) NOT NULL,
  `errepikakorra` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mezua`
--

INSERT INTO `mezua` (`izena`, `deskribapena`, `jasotzailea`, `data`, `ordua`, `errepikakorra`) VALUES
('julen', 'kaixo', 'ni', '17/04/2024', '10:47', 0),
('jonander', '1234', 'julen', '17/04/2024', '11:39', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
