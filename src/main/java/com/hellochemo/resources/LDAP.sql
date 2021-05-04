DROP DATABASE IF EXISTS chemosenpai;
CREATE DATABASE chemosenpai;
USE chemosenpai;

DROP TABLE IF EXISTS employee;


CREATE TABLE IF NOT EXISTS employee (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    name varchar(20) DEFAULT NULL,
    upass varchar(20) DEFAULT NULL,
    PRIMARY KEY (id)
    ) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;

INSERT INTO employee (id, name, upass) VALUES
(1001, 'MSD', 'Sr.Analyst'),
(1002, 'James', 'Sr.Analyst'),
(1003, 'Rocky', 'Sr.Analyst');
commit;