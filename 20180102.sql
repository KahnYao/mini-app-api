/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : 20180102

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-01-06 16:41:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `deposit`
-- ----------------------------
DROP TABLE IF EXISTS `deposit`;
CREATE TABLE `deposit` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `operateId` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deposit
-- ----------------------------

-- ----------------------------
-- Table structure for `operation`
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `operator` varchar(255) DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL,
  `targetId` int(11) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `payEndTime` int(11) DEFAULT NULL,
  `prepayEndTime` int(11) DEFAULT NULL,
  `prepayId` varchar(255) DEFAULT NULL,
  `productId` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `platform`
-- ----------------------------
DROP TABLE IF EXISTS `platform`;
CREATE TABLE `platform` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of platform
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `shopName` varchar(255) DEFAULT NULL,
  `contacts` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `license` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `images` varchar(255) DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop
-- ----------------------------

-- ----------------------------
-- Table structure for `technician`
-- ----------------------------
DROP TABLE IF EXISTS `technician`;
CREATE TABLE `technician` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `adept` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `verify` smallint(4) DEFAULT NULL,
  `shopName` varchar(255) DEFAULT NULL,
  `referee` varchar(255) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technician
-- ----------------------------
INSERT INTO `technician` VALUES ('1', 'string', 'string', 'string', 'string', 'string', 'string', 'string', '0', 'string', 'string', '0', '0', '0');

-- ----------------------------
-- Table structure for `transaction`
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tradeState` tinyint(4) DEFAULT NULL,
  `bankType` varchar(255) DEFAULT NULL,
  `totalFee` int(11) DEFAULT NULL,
  `feeType` varchar(255) DEFAULT NULL,
  `transactionId` varchar(255) DEFAULT NULL,
  `timeEnd` varchar(255) DEFAULT NULL,
  `orderId` varchar(255) DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `openId` varchar(255) DEFAULT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `gender` smallint(4) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `avatarUrl` varchar(255) DEFAULT NULL,
  `unionId` varchar(255) DEFAULT NULL,
  `sessionKey` varchar(255) DEFAULT NULL,
  `createdTime` int(11) DEFAULT NULL,
  `updatedTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'string', 'string', '1', 'string', 'string', 'string', 'string', 'string', 'string', 'string', '0', '0');
