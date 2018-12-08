-- 用于建表的 SQL 语句
 CREATE TABLE `Population` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `rank` int(11) NOT NULL COMMENT '排名',
  `country` varchar(45) NOT NULL COMMENT '国名',
  `population` int(11) NOT NULL COMMENT '人口',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='记录一些国家人口信息的表';
