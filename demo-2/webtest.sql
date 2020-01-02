/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : webtest

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 14:36:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administrator
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `a-id` int(11) NOT NULL,
  `a-username` int(11) DEFAULT NULL,
  `a-password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`a-id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `cid` varchar(11) DEFAULT NULL,
  `goodsname` varchar(255) DEFAULT NULL,
  `goodsprice` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('2', '树叶', '1');
INSERT INTO `collect` VALUES ('3', '天空', '10');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `cid` varchar(11) NOT NULL,
  `goodsname` varchar(255) DEFAULT NULL,
  `goodsprice` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '模型', '5');
INSERT INTO `goods` VALUES ('2', '树叶', '1');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `o-id` int(11) NOT NULL,
  `o-name` varchar(255) DEFAULT NULL,
  `o-num` varchar(255) DEFAULT NULL,
  `o-price` decimal(10,0) DEFAULT NULL,
  `o-total` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`o-id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for spot
-- ----------------------------
DROP TABLE IF EXISTS `spot`;
CREATE TABLE `spot` (
  `vid` int(11) NOT NULL,
  `viewname` varchar(255) DEFAULT NULL,
  `route` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of spot
-- ----------------------------
INSERT INTO `spot` VALUES ('1', '黄山', '北京--河南', null);

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `s-id` int(11) NOT NULL,
  `s-num` varchar(255) DEFAULT NULL,
  `s-price` decimal(10,0) DEFAULT NULL,
  `s-site` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`s-id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `uid` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `headimg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES ('1', 'pifu', '123', '李四', '11', '男', '2');
INSERT INTO `sysuser` VALUES ('2', '在', '234', '王五', '13', '男', '3');
INSERT INTO `sysuser` VALUES ('4', '储存', '123456', '张打', '21', '男', null);
