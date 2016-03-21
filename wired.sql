-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 02 Janvier 2015 à 19:19
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `wired`
--
CREATE DATABASE IF NOT EXISTS `wired` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `wired`;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fullName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` text NOT NULL,
  `address` text NOT NULL,
  `service` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id`, `fullName`, `password`, `phone`, `address`, `service`) VALUES
(1, 'Walid hammioui', 'walid', '+212677228512', 'Machkilee :D', 'Phone Line and Adsl'),
(2, 'mohamed reda benchraa', 'xcoder', '+212624859918', 'hhj', 'phone line');

-- --------------------------------------------------------

--
-- Structure de la table `notefs`
--

CREATE TABLE IF NOT EXISTS `notefs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `type` varchar(255) NOT NULL,
  `idclient` int(11) NOT NULL,
  `idrequest` int(11) NOT NULL,
  `seen` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=148 ;

--
-- Contenu de la table `notefs`
--

INSERT INTO `notefs` (`id`, `subject`, `date`, `type`, `idclient`, `idrequest`, `seen`) VALUES
(1, 'Accepted', '2014-12-30', 'info', 1, 1, 0),
(2, 'In progress ...', '2014-12-30', 'success', 1, 1, 0),
(3, 'Finished With success', '2014-12-30', 'success', 1, 1, 0),
(4, 'Accepted', '2014-12-30', 'info', 1, 2, 0),
(5, 'In progress ...', '2014-12-30', 'success', 1, 2, 0),
(6, 'Error', '2014-12-30', 'danger', 1, 2, 0),
(7, 'Accepted', '2014-12-30', 'info', 1, 3, 0),
(8, 'In progress ...', '2014-12-30', 'success', 1, 3, 0),
(9, 'Finished With success', '2014-12-30', 'success', 1, 3, 0),
(10, 'Rejected', '2014-12-30', 'danger', 1, 4, 0),
(11, 'Accepted', '2014-12-30', 'info', 1, 8, 0),
(12, 'Accepted', '2014-12-30', 'info', 1, 10, 0),
(13, 'Accepted', '2014-12-30', 'info', 1, 9, 0),
(14, 'Accepted', '2014-12-30', 'info', 1, 11, 0),
(15, 'Accepted', '2014-12-30', 'info', 1, 12, 0),
(16, 'In progress ...', '2014-12-30', 'success', 1, 11, 0),
(17, 'In progress ...', '2014-12-30', 'success', 1, 8, 0),
(18, 'Finished With success', '2014-12-30', 'success', 1, 11, 0),
(19, 'Error', '2014-12-30', 'danger', 1, 8, 0),
(20, 'In progress ...', '2014-12-30', 'success', 1, 12, 0),
(21, 'Finished With success', '2014-12-30', 'success', 1, 12, 0),
(22, 'In progress ...', '2014-12-30', 'success', 1, 9, 0),
(23, 'Error', '2014-12-30', 'danger', 1, 9, 0),
(24, 'In progress ...', '2014-12-30', 'success', 1, 10, 0),
(25, 'Error', '2014-12-30', 'danger', 1, 10, 0),
(26, 'Accepted', '2014-12-30', 'info', 1, 7, 0),
(27, 'In progress ...', '2014-12-30', 'success', 1, 7, 0),
(28, 'Finished With success', '2014-12-30', 'success', 1, 7, 0),
(29, 'Accepted', '2014-12-30', 'info', 1, 6, 0),
(30, 'In progress ...', '2014-12-30', 'success', 1, 6, 0),
(31, 'Finished With success', '2014-12-30', 'success', 1, 6, 0),
(32, 'Accepted', '2014-12-30', 'info', 1, 5, 0),
(33, 'In progress ...', '2014-12-30', 'success', 1, 5, 0),
(34, 'Finished With success', '2014-12-30', 'success', 1, 5, 0),
(35, 'Accepted', '2014-12-31', 'info', 1, 14, 0),
(36, 'Accepted', '2014-12-31', 'info', 2, 13, 0),
(37, 'In progress ...', '2014-12-31', 'success', 1, 14, 0),
(38, 'Finished With success', '2014-12-31', 'success', 1, 14, 0),
(39, 'Accepted', '2014-12-31', 'info', 1, 15, 0),
(40, 'In progress ...', '2014-12-31', 'success', 1, 15, 0),
(41, 'Finished With success', '2014-12-31', 'success', 1, 15, 0),
(42, 'Accepted', '2014-12-31', 'info', 1, 16, 0),
(43, 'In progress ...', '2014-12-31', 'success', 1, 16, 0),
(44, 'Error', '2014-12-31', 'danger', 1, 16, 0),
(45, 'In progress ...', '2014-12-31', 'success', 2, 13, 0),
(46, 'Error', '2014-12-31', 'danger', 2, 13, 0),
(47, 'Accepted', '2014-12-31', 'info', 2, 17, 0),
(48, 'In progress ...', '2014-12-31', 'success', 2, 17, 0),
(49, 'Finished With success', '2014-12-31', 'success', 2, 17, 0),
(50, 'Accepted', '2014-12-31', 'info', 2, 18, 0),
(51, 'In progress ...', '2014-12-31', 'success', 2, 18, 0),
(52, 'Error', '2014-12-31', 'danger', 2, 18, 0),
(53, 'Accepted', '2014-12-31', 'info', 2, 19, 0),
(54, 'In progress ...', '2014-12-31', 'success', 2, 19, 0),
(55, 'Error', '2014-12-31', 'danger', 2, 19, 0),
(56, 'Accepted', '2014-12-31', 'info', 2, 20, 0),
(57, 'In progress ...', '2014-12-31', 'success', 2, 20, 0),
(58, 'Finished With success', '2014-12-31', 'success', 2, 20, 0),
(59, 'Accepted', '2014-12-31', 'info', 2, 21, 0),
(60, 'In progress ...', '2014-12-31', 'success', 2, 21, 0),
(61, 'Finished With success', '2014-12-31', 'success', 2, 21, 0),
(62, 'Accepted', '2014-12-31', 'info', 2, 23, 0),
(63, 'Accepted', '2014-12-31', 'info', 1, 22, 0),
(64, 'In progress ...', '2014-12-31', 'success', 1, 22, 0),
(65, 'Finished With success', '2014-12-31', 'success', 1, 22, 0),
(66, 'Accepted', '2014-12-31', 'info', 1, 24, 0),
(67, 'In progress ...', '2014-12-31', 'success', 1, 24, 0),
(68, 'Error', '2014-12-31', 'danger', 1, 24, 0),
(69, 'Rejected', '2014-12-31', 'danger', 1, 25, 0),
(70, 'Accepted', '2014-12-31', 'info', 1, 26, 0),
(71, 'In progress ...', '2014-12-31', 'success', 1, 26, 0),
(72, 'Finished With success', '2014-12-31', 'success', 1, 26, 0),
(73, 'Accepted', '2014-12-31', 'info', 1, 27, 0),
(74, 'In progress ...', '2014-12-31', 'success', 1, 27, 0),
(75, 'Finished With success', '2014-12-31', 'success', 1, 27, 0),
(76, 'Accepted', '2014-12-31', 'info', 1, 28, 0),
(77, 'In progress ...', '2014-12-31', 'success', 1, 28, 0),
(78, 'Finished With success', '2014-12-31', 'success', 1, 28, 0),
(79, 'Accepted', '2014-12-31', 'info', 1, 29, 0),
(80, 'In progress ...', '2014-12-31', 'success', 1, 29, 0),
(81, 'Finished With success', '2014-12-31', 'success', 1, 29, 0),
(82, 'Accepted', '2014-12-31', 'info', 1, 30, 0),
(83, 'In progress ...', '2014-12-31', 'success', 1, 30, 0),
(84, 'Error', '2014-12-31', 'danger', 1, 30, 0),
(85, 'Accepted', '2014-12-31', 'info', 1, 31, 0),
(86, 'In progress ...', '2014-12-31', 'success', 1, 31, 0),
(87, 'Error', '2014-12-31', 'danger', 1, 31, 0),
(88, 'Accepted', '2014-12-31', 'info', 1, 32, 0),
(89, 'In progress ...', '2014-12-31', 'success', 1, 32, 0),
(90, 'Finished With success', '2014-12-31', 'success', 1, 32, 0),
(91, 'In progress ...', '2014-12-31', 'success', 2, 23, 0),
(92, 'Finished With success', '2014-12-31', 'success', 2, 23, 0),
(93, 'Accepted', '2014-12-31', 'info', 2, 33, 0),
(94, 'In progress ...', '2014-12-31', 'success', 2, 33, 0),
(95, 'Finished With success', '2014-12-31', 'success', 2, 33, 0),
(96, 'Accepted', '2014-12-31', 'info', 2, 34, 0),
(97, 'In progress ...', '2014-12-31', 'success', 2, 34, 0),
(98, 'Finished With success', '2014-12-31', 'success', 2, 34, 0),
(99, 'Accepted', '2014-12-31', 'info', 1, 35, 0),
(100, 'Accepted', '2014-12-31', 'info', 2, 36, 0),
(101, 'In progress ...', '2014-12-31', 'success', 2, 36, 0),
(102, 'Finished With success', '2014-12-31', 'success', 2, 36, 0),
(103, 'In progress ...', '2014-12-31', 'success', 1, 35, 0),
(104, 'Finished With success', '2014-12-31', 'success', 1, 35, 0),
(105, 'Accepted', '2014-12-31', 'info', 1, 37, 0),
(106, 'In progress ...', '2014-12-31', 'success', 1, 37, 0),
(107, 'Finished With success', '2014-12-31', 'success', 1, 37, 0),
(108, 'Accepted', '2015-01-01', 'info', 1, 38, 0),
(109, 'In progress ...', '2015-01-01', 'success', 1, 38, 0),
(110, 'Error', '2015-01-01', 'danger', 1, 38, 0),
(111, 'Accepted', '2015-01-01', 'info', 2, 39, 0),
(112, 'In progress ...', '2015-01-01', 'success', 2, 39, 0),
(113, 'Error', '2015-01-01', 'danger', 2, 39, 0),
(114, 'Accepted', '2015-01-01', 'info', 2, 40, 0),
(115, 'In progress ...', '2015-01-01', 'success', 2, 40, 0),
(116, 'Accepted', '2015-01-02', 'info', 1, 41, 0),
(117, 'Finished With success', '2015-01-02', 'success', 2, 40, 0),
(118, 'In progress ...', '2015-01-02', 'success', 1, 41, 0),
(119, 'Finished With success', '2015-01-02', 'success', 1, 41, 0),
(120, 'Accepted', '2015-01-02', 'info', 2, 42, 0),
(121, 'In progress ...', '2015-01-02', 'success', 2, 42, 0),
(122, 'Finished With success', '2015-01-02', 'success', 2, 42, 0),
(123, 'Accepted', '2015-01-02', 'info', 2, 43, 0),
(124, 'Accepted', '2015-01-02', 'info', 1, 44, 0),
(125, 'In progress ...', '2015-01-02', 'success', 1, 44, 0),
(126, 'Finished With success', '2015-01-02', 'success', 1, 44, 0),
(127, 'In progress ...', '2015-01-02', 'success', 2, 43, 0),
(128, 'Finished With success', '2015-01-02', 'success', 2, 43, 0),
(129, 'Accepted', '2015-01-02', 'info', 1, 45, 0),
(130, 'In progress ...', '2015-01-02', 'success', 1, 45, 0),
(131, 'Finished With success', '2015-01-02', 'success', 1, 45, 0),
(132, 'Accepted', '2015-01-02', 'info', 1, 46, 0),
(133, 'In progress ...', '2015-01-02', 'success', 1, 46, 0),
(134, 'Finished With success', '2015-01-02', 'success', 1, 46, 0),
(135, 'Accepted', '2015-01-02', 'info', 1, 47, 0),
(136, 'In progress ...', '2015-01-02', 'success', 1, 47, 0),
(137, 'Finished With success', '2015-01-02', 'success', 1, 47, 0),
(138, 'Rejected', '2015-01-02', 'danger', 1, 48, 0),
(139, 'Rejected', '2015-01-02', 'danger', 1, 50, 0),
(140, 'Rejected', '2015-01-02', 'danger', 1, 51, 0),
(141, 'Rejected', '2015-01-02', 'danger', 1, 52, 0),
(142, 'Accepted', '2015-01-02', 'info', 1, 53, 0),
(143, 'In progress ...', '2015-01-02', 'success', 1, 53, 0),
(144, 'Finished With success', '2015-01-02', 'success', 1, 53, 0),
(145, 'Accepted', '2015-01-02', 'info', 2, 49, 0),
(146, 'In progress ...', '2015-01-02', 'success', 2, 49, 0),
(147, 'Finished With success', '2015-01-02', 'success', 2, 49, 0);

-- --------------------------------------------------------

--
-- Structure de la table `report`
--

CREATE TABLE IF NOT EXISTS `report` (
  `IDREPORT` decimal(8,0) NOT NULL,
  `IDREQUEST` decimal(8,0) NOT NULL,
  `REPORT` text,
  `REPORTDATE` datetime DEFAULT '1900-01-01 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `Seen` tinyint(1) NOT NULL,
  `sclient` tinyint(4) NOT NULL DEFAULT '0',
  `idSender` int(11) NOT NULL,
  PRIMARY KEY (`IDREPORT`),
  KEY `FK_HAVE` (`IDREQUEST`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `report`
--

INSERT INTO `report` (`IDREPORT`, `IDREQUEST`, `REPORT`, `REPORTDATE`, `Seen`, `sclient`, `idSender`) VALUES
('1', '1', 'Your Request is Finished With Success', '2014-12-30 16:46:11', 0, 1, 3),
('2', '2', 'We need more informtion please', '2014-12-30 16:48:40', 0, 1, 3),
('3', '3', 'Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished Finished ', '2014-12-30 16:50:11', 0, 1, 4),
('4', '11', 'Description', '2014-12-30 16:57:26', 0, 1, 3),
('5', '8', 'Description', '2014-12-30 16:57:34', 0, 1, 3),
('6', '5', 'Description', '2014-12-30 16:57:38', 0, 1, 3),
('7', '12', 'Description', '2014-12-30 16:57:24', 0, 1, 4),
('8', '9', 'Description', '2014-12-30 16:57:33', 0, 1, 4),
('9', '6', 'Description', '2014-12-30 16:57:36', 0, 1, 4),
('10', '10', 'Description', '2014-12-30 16:57:30', 0, 1, 5),
('11', '7', 'Description', '2014-12-30 16:57:35', 0, 1, 5),
('12', '14', '(y) good', '2014-12-31 12:55:17', 0, 1, 3),
('13', '15', 'Description', '2014-12-31 15:44:54', 0, 1, 3),
('14', '16', 'Description', '2014-12-31 15:44:48', 0, 1, 3),
('15', '13', 'Description', '2014-12-31 13:03:41', 0, 1, 3),
('16', '17', 'ezfdqsfsf', '2014-12-31 15:44:17', 0, 1, 3),
('17', '18', 'Description', '2014-12-31 15:44:08', 0, 1, 3),
('18', '19', 'Description', '2014-12-31 15:44:07', 0, 1, 3),
('19', '20', 'Description', '2014-12-31 15:44:06', 0, 1, 3),
('20', '21', 'Description', '2014-12-31 15:44:05', 0, 1, 3),
('21', '23', 'Description', '2014-12-31 19:29:18', 0, 1, 3),
('22', '22', 'Description', '2014-12-31 16:13:51', 0, 1, 3),
('23', '24', 'Description', '2014-12-31 16:13:05', 0, 1, 3),
('24', '26', 'Description', '2014-12-31 16:15:37', 0, 1, 4),
('25', '27', 'Waliiiiiiiiiiiiiiid', '2014-12-31 16:32:32', 0, 1, 3),
('26', '28', 'Bess7to', '2014-12-31 17:14:02', 0, 1, 3),
('27', '29', 'Description', '2014-12-31 17:13:58', 0, 1, 3),
('28', '30', 'Description', '2014-12-31 17:47:55', 0, 1, 3),
('29', '31', 'Description', '2014-12-31 17:37:16', 0, 1, 3),
('30', '32', 'L3yaaaaaaaaaaaa9a', '2014-12-31 17:30:12', 0, 1, 3),
('31', '33', 'Description', '2014-12-31 19:29:16', 0, 1, 3),
('32', '34', 'Description', '2014-12-31 18:29:46', 0, 0, 3),
('33', '36', 'r', '2015-01-02 12:04:59', 1, 1, 3),
('34', '35', 'dsz', '2015-01-02 16:40:52', 1, 1, 3),
('35', '37', 'Description', '2015-01-02 16:40:51', 0, 1, 3),
('36', '38', 'Description', '2015-01-02 11:11:20', 0, 1, 3),
('37', '39', 'Description', '2015-01-01 15:06:40', 0, 0, 3),
('38', '40', 'Description', '2015-01-02 11:10:10', 0, 0, 3),
('39', '41', '', '2015-01-02 12:05:13', 1, 1, 3),
('40', '42', 'Description', '2015-01-02 12:05:26', 1, 0, 3),
('41', '43', 'Description', '2015-01-02 14:15:26', 0, 0, 3),
('42', '44', 'Description', '2015-01-02 16:40:55', 0, 1, 3),
('43', '45', 'Description', '2015-01-02 16:40:56', 0, 1, 3),
('44', '46', 'Description', '2015-01-02 16:40:57', 0, 1, 3),
('45', '47', 'Description', '2015-01-02 16:40:58', 0, 1, 3),
('46', '53', 'Asidi kolshi 3la Sefa :D\n', '2015-01-02 16:40:59', 1, 1, 3),
('47', '49', 'reda', '2015-01-02 17:53:11', 0, 0, 3);

-- --------------------------------------------------------

--
-- Structure de la table `request`
--

CREATE TABLE IF NOT EXISTS `request` (
  `IDREQUEST` decimal(8,0) NOT NULL,
  `ID_TYPE` decimal(8,0) NOT NULL,
  `Net` varchar(30) DEFAULT NULL,
  `ID_USER` decimal(8,0) NOT NULL,
  `IDREPORT` decimal(8,0) DEFAULT NULL,
  `IDTEAM` decimal(8,0) DEFAULT NULL,
  `TELCLIENT` text,
  `ADDRESS1` text,
  `ADDRESS2` text,
  `CLIENTNAME` text,
  `SEEN` int(11) DEFAULT '1',
  `ERROR` int(11) DEFAULT '1',
  `FINISHED` int(11) DEFAULT '1',
  `SEENDATE` date NOT NULL DEFAULT '1901-01-01',
  `ERRORDATE` date NOT NULL DEFAULT '1901-01-01',
  `FINISHEDDATE` date NOT NULL DEFAULT '1901-01-01',
  `SENDDATE` date NOT NULL,
  `vboss` tinyint(4) DEFAULT '0',
  `problem` longtext,
  `idclient` int(11) NOT NULL,
  PRIMARY KEY (`IDREQUEST`),
  KEY `FK_HAVE2` (`IDREPORT`),
  KEY `FK_IS` (`ID_TYPE`),
  KEY `FK_RECEIVE` (`IDTEAM`),
  KEY `FK_SEND` (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `request`
--

INSERT INTO `request` (`IDREQUEST`, `ID_TYPE`, `Net`, `ID_USER`, `IDREPORT`, `IDTEAM`, `TELCLIENT`, `ADDRESS1`, `ADDRESS2`, `CLIENTNAME`, `SEEN`, `ERROR`, `FINISHED`, `SEENDATE`, `ERRORDATE`, `FINISHEDDATE`, `SENDDATE`, `vboss`, `problem`, `idclient`) VALUES
('1', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', 'marrakech', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('2', '3', 'adsl', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, 'i have a problem with adsl', 1),
('3', '2', 'adsl and phone line', '2', NULL, '2', '+212677228512', 'Tabounte Tarmigt Ouarzazate', 'Azilal', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('4', '3', 'phone line', '2', NULL, NULL, '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 2, 'Problem', 1),
('5', '2', 'adsl', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', 'jkfdsf', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('6', '2', 'adsl', '2', NULL, '2', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('7', '2', 'adsl', '2', NULL, NULL, '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('8', '2', 'adsl', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('9', '2', 'adsl', '2', NULL, '2', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('10', '2', 'adsl', '2', NULL, NULL, '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('11', '3', 'adsl', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('12', '3', 'adsl', '2', NULL, '2', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 1),
('13', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'Elhey mohamadi ouarzazate', 'Tabounte', 'mohamed reda benchraa', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-30', 1, '', 2),
('14', '2', 'adsl', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigt Ouarzazate', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('15', '3', 'adsl', '2', NULL, '1', '+212677228512', '', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('16', '2', 'adsl', '2', NULL, '1', '+212677228512', '', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('17', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'Elhey mohamadi ouarzazate', 'ddd', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('18', '3', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'ddd', '', 'mohamed reda benchraa', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('19', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'ddd', 'azizlal', 'mohamed reda benchraa', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('20', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'ddd', 'sdf', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('21', '3', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'sdf', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, 'problem', 2),
('22', '2', 'adsl', '2', NULL, '1', '+212677228512', '', 'walid', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('23', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', 'sdf', 'wlaid', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('24', '3', '', '2', NULL, '1', '+212677228512', 'walid', '', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '!knlz,e;f', 1),
('25', '2', 'adsl and phone line', '2', NULL, NULL, '+212677228512', 'walid', 'fe', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 2, '', 1),
('26', '2', 'Phone Line and ADSL', '2', NULL, '2', '+212677228512', 'walid', 'kld', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('27', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', 'kld', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('28', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', '', 'hello', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('29', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', 'hello', 'Azilal', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, 'Azilal', 1),
('30', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', 'Azilal', 'ezk', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('31', '2', 'adsl', '2', NULL, '1', '+212677228512', 'Azilal', 'Tabount Tarmigte Ouarzazate BP 2001', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('32', '2', 'adsl', '2', NULL, '1', '+212677228512', 'Azilal', 'jjj', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('33', '2', '', '2', NULL, '1', '+212624859918', 'wlaid', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('34', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', '', 'reda', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('35', '2', 'adsl', '1', NULL, '1', '+212677228512', 'jjj', 'jhbjhb', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 1),
('36', '2', '', '1', NULL, '1', '+212624859918', 'reda', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, '', 2),
('37', '3', 'adsl', '2', NULL, '1', '+212677228512', 'jhbjhb', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2014-12-31', 1, 'FKNSFMNSKLF?.S', 1),
('38', '2', 'adsl and phone line', '2', NULL, '1', '+212677228512', 'jhbjhb', 'mhm mn tele ', 'Walid hammioui', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-01', 1, '', 1),
('39', '2', 'adsl and phone line', '2', NULL, '1', '+212624859918', '', 'Tabounte tarmiqget', 'mohamed reda benchraa', 2, 2, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-01', 1, '', 2),
('40', '3', 'adsl and phone line', '2', NULL, '1', '+212624859918', '', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-01', 1, '', 2),
('41', '2', '', '1', NULL, '1', '+212677228512', 'jhbjhb', 'Tabounte Tarmigte ouarzazate ', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 1),
('42', '3', 'adsl and phone line', '1', NULL, '1', '+212624859918', '', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 2),
('43', '2', 'adsl', '1', NULL, '1', '+212624859918', '', '', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 2),
('44', '2', '', '2', NULL, '1', '+212677228512', 'Tabounte Tarmigte ouarzazate ', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 1),
('45', '2', '', '2', NULL, '1', '+212677228512', '', 'Tabounte', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 1),
('46', '2', '', '2', NULL, '1', '+212677228512', 'Tabounte', 'Tabounte Tarmigte ouarzazate', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 1),
('47', '2', '', '1', NULL, '1', '+212677228512', 'Tabounte Tarmigte ouarzazate', 'Machkilee :D', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 1),
('48', '2', 'adsl', '2', NULL, NULL, '+212677228512', 'Machkilee :D', 'waal', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 2, '', 1),
('49', '2', 'phone line', '1', NULL, '1', '+212624859918', '', 'hhj', 'mohamed reda benchraa', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, '', 2),
('50', '2', 'Adsl and Phone', '2', NULL, NULL, '+212677228512', 'Machkilee :D', 'Tabpounte', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 2, '', 1),
('51', '3', 'adsl and phone line', '2', NULL, NULL, '+212677228512', 'Machkilee :D', '', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 2, 'waaa3', 1),
('52', '3', 'adsl', '2', NULL, NULL, '+212677228512', 'Machkilee :D', '', 'Walid hammioui', 1, 1, 1, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 2, 'waaaa3', 1),
('53', '3', 'adsl', '1', NULL, '1', '+212677228512', 'Machkilee :D', '', 'Walid hammioui', 2, 1, 2, '1901-01-01', '1901-01-01', '1901-01-01', '2015-01-02', 1, 'Wa internet m9to3a ghire site dylkom li khdame dakshi 3lash sifte likom ou rah ta ana mafahmech 3lach mhm mat7waloche tfhmo mhm howa ta9do mochkile hani kantsnakom safi \r\nila chi7aja mn 3ndkom 9doha tema ila chi7aja mn hena ajiwe 3andi rah kayna Sefa mhm mat3tloche lahe ire7m lkom lwalidine', 1);

-- --------------------------------------------------------

--
-- Structure de la table `request_type`
--

CREATE TABLE IF NOT EXISTS `request_type` (
  `ID_TYPE` decimal(8,0) NOT NULL,
  `TYPENAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `request_type`
--

INSERT INTO `request_type` (`ID_TYPE`, `TYPENAME`) VALUES
('1', 'Instalation'),
('2', 'Transfer'),
('3', 'Maintenance');

-- --------------------------------------------------------

--
-- Structure de la table `team`
--

CREATE TABLE IF NOT EXISTS `team` (
  `IDTEAM` decimal(8,0) NOT NULL,
  `NUMBER` decimal(8,0) DEFAULT NULL,
  PRIMARY KEY (`IDTEAM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `team`
--

INSERT INTO `team` (`IDTEAM`, `NUMBER`) VALUES
('1', '1'),
('2', '1'),
('3', '1');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID_USER` decimal(8,0) NOT NULL,
  `IDTEAM` decimal(8,0) DEFAULT NULL,
  `NID` text,
  `NAME` text,
  `LASTNAME` text,
  `POSITION` text,
  `PASSWORD` text,
  PRIMARY KEY (`ID_USER`),
  KEY `FK_GROUP` (`IDTEAM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`ID_USER`, `IDTEAM`, `NID`, `NAME`, `LASTNAME`, `POSITION`, `PASSWORD`) VALUES
('0', NULL, '000', 'Admin', NULL, 'sup', 'xcoder'),
('1', NULL, 'IC81', 'reda', 'ben', 'boss', 'xcoder'),
('2', NULL, 'IC17', 'walid', 'Liidow', 'boss', 'xcoder'),
('3', '1', 'IC12', 'simo', 'sabiri', 'subordinate', 'xcoder'),
('4', '2', 'IC111', 'yassin', 'tah', 'subordinate', 'xcoder'),
('5', '3', 'ic10', 'amine', 'bou9al', 'subordinate', 'xcoder');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `request`
--
ALTER TABLE `request`
  ADD CONSTRAINT `FK_IS` FOREIGN KEY (`ID_TYPE`) REFERENCES `request_type` (`ID_TYPE`),
  ADD CONSTRAINT `FK_RECEIVE` FOREIGN KEY (`IDTEAM`) REFERENCES `team` (`IDTEAM`) ON DELETE SET NULL ON UPDATE SET NULL,
  ADD CONSTRAINT `FK_SEND` FOREIGN KEY (`ID_USER`) REFERENCES `user` (`ID_USER`);

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_GROUP` FOREIGN KEY (`IDTEAM`) REFERENCES `team` (`IDTEAM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
