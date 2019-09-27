/*
Navicat MySQL Data Transfer

Source Server         : 15.128-C7-mysql01
Source Server Version : 50727
Source Host           : 192.168.15.128:3306
Source Database       : price_comparison

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-09-27 17:11:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for brick_or_goods
-- ----------------------------
DROP TABLE IF EXISTS `brick_or_goods`;
CREATE TABLE `brick_or_goods` (
  `id` varchar(32) NOT NULL COMMENT 'ID',
  `serial_number` varchar(32) DEFAULT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `specification` varchar(100) DEFAULT NULL COMMENT '规格',
  `unit_name` varchar(32) DEFAULT NULL COMMENT '一级单位',
  `unit_name_second` varchar(32) DEFAULT NULL COMMENT '二级单位',
  `unit_price` varchar(100) DEFAULT NULL COMMENT '售价',
  `purchase_price` varchar(100) DEFAULT NULL COMMENT '进价',
  `size` varchar(100) DEFAULT NULL COMMENT '尺寸',
  `color` varchar(100) DEFAULT NULL COMMENT '颜色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for trading_sheet
-- ----------------------------
DROP TABLE IF EXISTS `trading_sheet`;
CREATE TABLE `trading_sheet` (
  `id` varchar(32) NOT NULL COMMENT 'ID',
  `buyer` varchar(32) DEFAULT NULL COMMENT '买主',
  `creation_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `type` int(2) DEFAULT NULL COMMENT '交易类型(0、出货 1、退货)',
  `shipping_mode` int(2) DEFAULT NULL COMMENT '出货方式(0、送货 1、自提)',
  `status` int(2) DEFAULT NULL COMMENT '状态(0、进行中 1、未结清 2、已结清)',
  `total_price` varchar(100) DEFAULT NULL COMMENT '议定总价',
  `bak` varchar(512) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `buyer` (`buyer`),
  CONSTRAINT `trading_sheet_ibfk_1` FOREIGN KEY (`buyer`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for trading_sheet_detail
-- ----------------------------
DROP TABLE IF EXISTS `trading_sheet_detail`;
CREATE TABLE `trading_sheet_detail` (
  `id` varchar(32) NOT NULL COMMENT 'ID',
  `trading_sheet_id` varchar(32) DEFAULT NULL COMMENT '交易单ID',
  `brick_or_goods_id` varchar(32) DEFAULT NULL COMMENT '商品ID',
  `shipment` varchar(20) DEFAULT NULL COMMENT '出货量',
  `unit_price` varchar(100) DEFAULT NULL COMMENT '议定售价',
  `total_price` varchar(100) DEFAULT NULL COMMENT '议定总价',
  PRIMARY KEY (`id`),
  KEY `trading_sheet_id` (`trading_sheet_id`),
  KEY `brick_or_goods_id` (`brick_or_goods_id`),
  CONSTRAINT `trading_sheet_detail_ibfk_1` FOREIGN KEY (`trading_sheet_id`) REFERENCES `trading_sheet` (`id`),
  CONSTRAINT `trading_sheet_detail_ibfk_2` FOREIGN KEY (`brick_or_goods_id`) REFERENCES `brick_or_goods` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ums_admin
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `nick_name` varchar(200) DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='后台用户表';

-- ----------------------------
-- Table structure for ums_admin_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_permission_relation`;
CREATE TABLE `ums_admin_permission_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户和权限关系表(除角色中定义的权限以外的加减权限)';

-- ----------------------------
-- Table structure for ums_admin_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_role_relation`;
CREATE TABLE `ums_admin_role_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表';

-- ----------------------------
-- Table structure for ums_permission
-- ----------------------------
DROP TABLE IF EXISTS `ums_permission`;
CREATE TABLE `ums_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `value` varchar(200) DEFAULT NULL COMMENT '权限值',
  `icon` varchar(500) DEFAULT NULL COMMENT '图标',
  `type` int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户权限表';

-- ----------------------------
-- Table structure for ums_role
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `admin_count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户角色表';

-- ----------------------------
-- Table structure for ums_role_permission_relation
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_permission_relation`;
CREATE TABLE `ums_role_permission_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户角色和权限关系表';

-- ----------------------------
-- Table structure for unit
-- ----------------------------
DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `id` varchar(32) NOT NULL COMMENT 'ID',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `level` int(2) DEFAULT NULL COMMENT '等级(0、一级单位 2、二级单位)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `user_phone` varchar(100) DEFAULT NULL COMMENT '手机号',
  `user_level` int(2) DEFAULT NULL COMMENT '用户等级(0、管理员 1、销售人员 2、客户)',
  `pass_word` varchar(100) DEFAULT NULL COMMENT '密码',
  `address` varchar(512) DEFAULT NULL COMMENT '地址',
  `bak` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
