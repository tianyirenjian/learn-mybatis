-- Adminer 4.7.1 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `idcard`;
CREATE TABLE `idcard` (
                          `id` int NOT NULL AUTO_INCREMENT,
                          `code` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `idcard` (`id`, `code`) VALUES
(1,	'123515981545254122');

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `sn` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                         `user_id` int NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `order` (`id`, `sn`, `user_id`) VALUES
(1,	'4613548352435',	1),
(2,	'7897984654561',	1);

DROP TABLE IF EXISTS `order_product`;
CREATE TABLE `order_product` (
                                 `id` int NOT NULL AUTO_INCREMENT,
                                 `order_id` int NOT NULL,
                                 `product_id` int NOT NULL,
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `order_product` (`id`, `order_id`, `product_id`) VALUES
(1,	1,	1),
(2,	1,	2),
(3,	1,	3);

DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
                          `id` int NOT NULL AUTO_INCREMENT,
                          `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                          `idcard_id` int NOT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `person` (`id`, `name`, `idcard_id`) VALUES
(1,	'tianyi',	1);

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                           `price` int NOT NULL DEFAULT '0',
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `product` (`id`, `name`, `price`) VALUES
(1,	'核桃',	22),
(2,	'西瓜',	20),
(3,	'香蕉',	8);

DROP TABLE IF EXISTS `tree`;
CREATE TABLE `tree` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `pid` int NOT NULL DEFAULT '0',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `tree` (`id`, `name`, `pid`) VALUES
(1,	'1',	0),
(2,	'2',	0),
(3,	'3',	0),
(4,	'4',	0),
(5,	'1-1',	1),
(6,	'1-2',	1),
(7,	'1-3',	1),
(8,	'2-1',	2),
(9,	'2-2',	2),
(10,	'2-3',	2),
(11,	'1-1-1',	5),
(12,	'1-1-2',	5),
(13,	'1-1-3',	5);

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                        `sex` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `user` (`id`, `name`, `sex`) VALUES
(1,	'hui',	'女'),
(30,	'xiaohui',	'女'),
(31,	'test',	'男'),
(32,	'test',	'男'),
(33,	'test',	'男'),
(34,	'test',	'男'),
(35,	'test',	'男'),
(36,	'test',	'男'),
(37,	'autoId',	'男'),
(38,	'autoId',	'男'),
(39,	'autoId',	'男'),
(40,	'autoId',	'男'),
(41,	'autoId',	'男'),
(42,	'autoId',	'男'),
(43,	'autoId',	'男'),
(46,	'autoId',	'男'),
(47,	'autoId',	'男'),
(48,	'autoId',	'男'),
(49,	'autoId',	'男'),
(50,	'autoId',	'男'),
(51,	'autoId',	'男'),
(52,	'autoId',	'男'),
(53,	'autoId',	'男'),
(54,	'autoId',	'男'),
(55,	'autoId',	'男'),
(56,	'autoId',	'男'),
(57,	'autoId',	'男'),
(58,	'autoId',	'男'),
(60,	'autoId',	'男'),
(62,	'autoId',	'男'),
(63,	'autoId',	'男'),
(64,	'autoId',	'男'),
(65,	'autoId',	'男'),
(67,	'autoId',	'男'),
(69,	'autoId',	'男'),
(70,	'autoId',	'男'),
(71,	'autoId',	'男'),
(72,	'autoId',	'男'),
(73,	'autoId',	'男'),
(74,	'autoId',	'男');

-- 2020-09-30 06:57:16