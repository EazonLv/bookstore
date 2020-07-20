# Host: localhost  (Version 5.6.48)
# Date: 2020-07-20 09:00:59
# Generator: MySQL-Front 6.0  (Build 4.0)


#
# Structure for table "book"
#

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `bookname` varchar(32) DEFAULT NULL COMMENT '书名',
  `bookid` varchar(64) DEFAULT NULL COMMENT '书号',
  `price` float(6,5) DEFAULT NULL COMMENT '价格',
  `sale_amount` int(11) DEFAULT NULL COMMENT '已售数量',
  `left_amount` int(11) DEFAULT NULL COMMENT '剩余数量',
  `sortid` int(11) DEFAULT NULL COMMENT '分类id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` varchar(1) DEFAULT NULL COMMENT '是否有效 Y-有效，N-失效',
  `image` varchar(255) DEFAULT NULL COMMENT '书封面地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='书籍信息表';

#
# Data for table "book"
#

INSERT INTO `book` VALUES (1,'书本1','1',9.99999,1,99,1,'1899-12-29 00:00:00','1899-12-29 00:00:00','Y','book1.jpg'),(2,'书本2','2',9.99999,1,99,1,'1899-12-29 00:00:00','1899-12-29 00:00:00','Y','book2.jpg'),(3,'书本3','3',9.99999,1,99,1,'1899-12-29 00:00:00','1899-12-29 00:00:00','Y','book3.jpg'),(5,'书本4','4',9.99999,1,99,1,'1899-12-29 00:00:00','1899-12-29 00:00:00','Y','book4.jpg'),(6,'书本5','5',9.99999,1,99,1,'1899-12-29 00:00:00','1899-12-29 00:00:00','Y','book5.jpg');

#
# Structure for table "order"
#

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_sourceid` int(11) DEFAULT NULL COMMENT '关联用户主键',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `shoppingid` varchar(64) DEFAULT NULL COMMENT '流水编号',
  `is_pay` varchar(1) DEFAULT NULL COMMENT '是否付款 Y-是，N-否',
  `payment` double(10,5) DEFAULT NULL COMMENT '付款总金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

#
# Data for table "order"
#


#
# Structure for table "orderitem"
#

DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `book_sourceid` int(11) DEFAULT NULL COMMENT '书籍关联主键',
  `order_sourceid` int(11) DEFAULT NULL COMMENT '订单关联主键',
  `amount` int(11) DEFAULT NULL COMMENT '书籍数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单项目';

#
# Data for table "orderitem"
#


#
# Structure for table "sort"
#

DROP TABLE IF EXISTS `sort`;
CREATE TABLE `sort` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sortname` varchar(32) DEFAULT NULL COMMENT '分类标题',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `is_active` varchar(1) DEFAULT NULL COMMENT '是否有效 Y-有效，N-无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='书籍分类表';

#
# Data for table "sort"
#

INSERT INTO `sort` VALUES (1,'种类1','2020-07-16 00:00:00','Y'),(2,'种类2','2020-07-16 00:00:00','Y');

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` varchar(64) DEFAULT NULL COMMENT '用户id',
  `username` varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `age` int(4) DEFAULT '0' COMMENT '年龄',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别 M-男，W-女',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` varchar(1) DEFAULT NULL COMMENT '是否有效 Y-有效，N-失效',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'lv','lv','4QrcOUm6Wau+VuBX8g+IPg==',15,'M','2020-07-02 00:00:00','2020-07-02 00:00:00','Y','1998-02-26 00:00:00');
