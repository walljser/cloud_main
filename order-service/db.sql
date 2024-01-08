use db_cloud_order;

CREATE TABLE t_order (
    id bigint PRIMARY KEY NOT NULL AUTO_INCREMENT,
    price bigint,
    name varchar(33),
    num int,
    userId bigint
) ENGINE=InnoDB AUTO_INCREMENT=100001 DEFAULT CHARSET=utf8;

INSERT INTO t_order (price, name, num, userId) values (100, "可乐", 50);

CREATE DATABASE db_cloud_user
    DEFAULT CHARACTER SET = 'utf8mb4';

USE db_cloud_user;

DROP TABLE IF EXISTS t_user;

CREATE TABLE t_user (
    id bigint PRIMARY KEY  NOT NULL AUTO_INCREMENT,
    username varchar(64),
    address varchar(128)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

INSERT INTO t_user(username, address) VALUES ('yg', '马达加斯加');