/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-02 14:45:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `comment` varchar(255) DEFAULT NULL,
  `good` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('', null);

-- ----------------------------
-- Table structure for dairy
-- ----------------------------
DROP TABLE IF EXISTS `dairy`;
CREATE TABLE `dairy` (
  `dairy` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dairy
-- ----------------------------
INSERT INTO `dairy` VALUES ('今天是个好日子', '1999-10-11 00:00:00', '1.jpg');
INSERT INTO `dairy` VALUES ('好的', '2003-03-05 00:00:00', '272362420391B9FABA4E78D62DC670B5BA9FA53A4C.jpg');

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `goodsname` varchar(255) DEFAULT NULL,
  `goodsprice` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES ('纪念品1', '1');
INSERT INTO `good` VALUES ('纪念品2', '2');

-- ----------------------------
-- View structure for view_ugd
-- ----------------------------
DROP VIEW IF EXISTS `view_ugd`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_ugd` AS select `a`.`uName` AS `用户名`,`c`.`gdName` AS `商品名称`,`b`.`scNum` AS `购买数量`,`c`.`gdPrice` AS `商品价格` from ((`users` `a` join `scarinfo` `b` on((`a`.`uID` = `b`.`sid`))) join `goods` `c` on((`c`.`gdID` = `b`.`sid`))) ;

-- ----------------------------
-- View structure for view_user
-- ----------------------------
DROP VIEW IF EXISTS `view_user`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_user` AS select `a`.`uName` AS `用户名`,`c`.`gdName` AS `商品名称`,`b`.`scNum` AS `购买数量`,`c`.`gdPrice` AS `商品价格` from ((`users` `a` join `scarinfo` `b` on((`a`.`uID` = `b`.`sid`))) join `goods` `c` on((`c`.`gdID` = `b`.`sid`))) ;

-- ----------------------------
-- View structure for view_users
-- ----------------------------
DROP VIEW IF EXISTS `view_users`;
CREATE ALGORITHM=MERGE DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_users` AS select `test`.`users`.`uName` AS `uName`,`test`.`users`.`uPwd` AS `uPwd`,`test`.`users`.`uototal` AS `uototal`,`test`.`users`.`uphone` AS `uphone` from `users` ;
