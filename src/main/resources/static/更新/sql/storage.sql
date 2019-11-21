/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : storage

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-11-21 18:00:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for h_menu
-- ----------------------------
DROP TABLE IF EXISTS `h_menu`;
CREATE TABLE `h_menu` (
  `h_id` int(11) NOT NULL AUTO_INCREMENT,
  `h_pid` int(11) DEFAULT NULL,
  `h_name` varchar(255) DEFAULT NULL,
  `h_status` int(11) DEFAULT NULL,
  `h_deleted` int(11) DEFAULT NULL,
  `h_url` varchar(255) DEFAULT NULL,
  `h_target` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_menu
-- ----------------------------
INSERT INTO `h_menu` VALUES ('1', '0', '菜单管理', '0', '0', 'menu/menuSetting', 'homeIframe');
INSERT INTO `h_menu` VALUES ('2', '0', '文件管理', '0', '0', 'file/fileInput', 'asd');
INSERT INTO `h_menu` VALUES ('3', '1', '菜单3', '0', '0', 'as', 'asda');
INSERT INTO `h_menu` VALUES ('4', '2', '菜单4', '0', '0', 'd', 'asd');

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `userPsw` varchar(255) DEFAULT NULL,
  `userPhone` int(11) DEFAULT NULL,
  `Popedom` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `upTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `upUser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of u_user
-- ----------------------------
INSERT INTO `u_user` VALUES ('1', '123', '123', '1223', '1223', '2019-11-15 16:51:37', '2019-11-15 16:51:42', '123');
