/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : cai

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 14:50:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsname` varchar(255) DEFAULT NULL,
  `goodsnumber` int(11) DEFAULT NULL,
  `goodsprice` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('cai', '199070', '96');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `goodsname` varchar(255) DEFAULT NULL,
  `goodsnumber` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `goodsprice` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('cai', '30', 'caidsahuai', '20');
INSERT INTO `orders` VALUES ('cai', '30', 'caidsahuai', '20');
INSERT INTO `orders` VALUES (null, null, null, null);
INSERT INTO `orders` VALUES ('cai', '0', null, '0');
INSERT INTO `orders` VALUES ('ca', '0', null, '0');
INSERT INTO `orders` VALUES ('cai', '0', null, '0');

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `uid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES ('1', 'cai', 'cai', '123456', '18', '男');
