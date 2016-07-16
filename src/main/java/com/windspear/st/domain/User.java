package com.windspear.st.domain;

import lombok.Data;

import java.sql.Timestamp;

/*
* CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `age` int(11) DEFAULT NULL COMMENT '年纪123',
  `bir` datetime DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
* gen by beetlsql 2016-03-02
*/
@Data
public class User  {
	private Integer id ;
	//年纪123
	private Integer age ;
	private String name ;
	//生日
	private Timestamp bir ;
}