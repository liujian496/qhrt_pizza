CREATE TABLE `qhfax_user` (
	`userid` varchar(32) DEFAULT NULL,
	`username` varchar(32) DEFAULT NULL,
	KEY `index_userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前海融通用户表'