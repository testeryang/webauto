/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : auto

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-03-08 15:17:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `case`
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `pagename` varchar(255) DEFAULT '',
  `elename` varchar(255) DEFAULT NULL,
  `doname` varchar(255) DEFAULT NULL,
  `sendinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of case
-- ----------------------------

-- ----------------------------
-- Table structure for `do`
-- ----------------------------
DROP TABLE IF EXISTS `do`;
CREATE TABLE `do` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `docase` varchar(255) DEFAULT NULL,
  `msg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of do
-- ----------------------------
INSERT INTO `do` VALUES ('1', 'click', '点击');
INSERT INTO `do` VALUES ('2', 'sendkeys', '输入');

-- ----------------------------
-- Table structure for `loginfo`
-- ----------------------------
DROP TABLE IF EXISTS `loginfo`;
CREATE TABLE `loginfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `casename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginfo
-- ----------------------------

-- ----------------------------
-- Table structure for `pagemanage`
-- ----------------------------
DROP TABLE IF EXISTS `pagemanage`;
CREATE TABLE `pagemanage` (
  `eleid` int(11) NOT NULL AUTO_INCREMENT,
  `pagename` varchar(255) NOT NULL,
  `elename` varchar(255) NOT NULL,
  `eleby` varchar(255) NOT NULL,
  `eletype` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`eleid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pagemanage
-- ----------------------------
INSERT INTO `pagemanage` VALUES ('1', '登录', 'login', 'id', '输入框');
INSERT INTO `pagemanage` VALUES ('4', '注册', '账号', 'id', '文本框');
INSERT INTO `pagemanage` VALUES ('5', '登录', 'password', 'id', '密码输入框');
INSERT INTO `pagemanage` VALUES ('6', '首页', 'kw', 'id', '输入框');
INSERT INTO `pagemanage` VALUES ('7', '首页', 'su', 'id', 'button');

-- ----------------------------
-- Table structure for `result`
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `resultinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=213 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------
INSERT INTO `result` VALUES ('1', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('2', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('3', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('4', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('5', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('6', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('7', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('8', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('9', '2018-05-18', 'login', 'failed');
INSERT INTO `result` VALUES ('10', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('11', '2018-05-18', 'change', 'failed');
INSERT INTO `result` VALUES ('12', '2018-05-18', 'search', 'failed');
INSERT INTO `result` VALUES ('13', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('14', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('15', '2018-05-18', 'top', 'failed');
INSERT INTO `result` VALUES ('16', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('17', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('18', '2018-05-18', 'buy', 'failed');
INSERT INTO `result` VALUES ('19', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('20', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('21', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('22', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('23', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('24', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('25', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('26', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('27', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('28', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('29', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('30', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('31', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('32', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('33', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('34', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('35', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('36', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('37', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('38', '2018-05-18', 'login', 'failed');
INSERT INTO `result` VALUES ('39', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('40', '2018-05-18', 'login', 'failed');
INSERT INTO `result` VALUES ('41', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('42', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('43', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('44', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('45', '2018-05-18', 'buy', 'failed');
INSERT INTO `result` VALUES ('46', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('47', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('48', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('49', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('50', '2018-05-18', 'buy', 'failed');
INSERT INTO `result` VALUES ('51', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('52', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('53', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('54', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('55', '2018-05-18', 'buy', 'failed');
INSERT INTO `result` VALUES ('56', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('57', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('58', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('59', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('60', '2018-05-18', 'buy', 'failed');
INSERT INTO `result` VALUES ('61', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('62', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('63', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('64', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('65', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('66', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('67', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('68', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('69', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('70', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('71', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('72', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('73', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('74', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('75', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('76', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('77', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('78', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('79', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('80', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('81', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('82', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('83', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('84', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('85', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('86', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('87', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('88', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('89', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('90', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('91', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('92', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('93', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('94', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('95', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('96', '2018-05-18', 'login', 'failed');
INSERT INTO `result` VALUES ('97', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('98', '2018-05-18', 'change', 'failed');
INSERT INTO `result` VALUES ('99', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('100', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('101', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('102', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('103', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('104', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('105', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('106', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('107', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('108', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('109', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('110', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('111', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('112', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('113', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('114', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('115', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('116', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('117', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('118', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('119', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('120', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('121', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('122', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('123', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('124', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('125', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('126', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('127', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('128', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('129', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('130', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('131', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('132', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('133', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('134', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('135', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('136', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('137', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('138', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('139', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('140', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('141', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('142', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('143', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('144', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('145', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('146', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('147', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('148', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('149', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('150', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('151', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('152', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('153', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('154', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('155', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('156', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('157', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('158', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('159', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('160', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('161', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('162', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('163', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('164', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('165', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('166', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('167', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('168', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('169', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('170', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('171', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('172', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('173', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('174', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('175', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('176', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('177', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('178', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('179', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('180', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('181', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('182', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('183', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('184', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('185', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('186', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('187', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('188', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('189', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('190', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('191', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('192', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('193', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('194', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('195', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('196', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('197', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('198', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('199', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('200', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('201', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('202', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('203', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('204', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('205', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('206', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('207', '2018-05-18', 'buy', 'success');
INSERT INTO `result` VALUES ('208', '2018-05-18', 'login', 'success');
INSERT INTO `result` VALUES ('209', '2018-05-18', 'top', 'success');
INSERT INTO `result` VALUES ('210', '2018-05-18', 'change', 'success');
INSERT INTO `result` VALUES ('211', '2018-05-18', 'search', 'success');
INSERT INTO `result` VALUES ('212', '2018-05-18', 'buy', 'success');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(250) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `user_sex` varchar(32) DEFAULT NULL,
  `nickname` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('49', 'aa', '111111', 'MAN', 'jackyang');
INSERT INTO `users` VALUES ('50', 'bb', 'b123456', 'WOMAN', 'fff');
INSERT INTO `users` VALUES ('51', 'cc', 'b123456', 'WOMAN', 'bad');
