SET SQL_SAFE_UPDATES = 0;

use booksdb;

select * from Books;

use SalesOrder;

SET SQL_SAFE_UPDATES = 0;

select * from SalesOrder;
select count(salesorderid) from salesorder;
delete from SalesOrder;

create database lab8;
use lab9;

SHOW TABLES;
delimiter $$

CREATE TABLE `adverttable` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `message` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `user` bigint(20) unsigned NOT NULL,
  `category` bigint(20) unsigned NULL,
  PRIMARY KEY (`id`),
  KEY `fk_advert_user` (`user`),
  KEY `fk_advert_category` (`category`),
  CONSTRAINT `fk_advert_user` FOREIGN KEY (`user`) REFERENCES `usertable` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_advert_category` FOREIGN KEY (`category`) REFERENCES `categorytable` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1$$



delimiter $$

CREATE TABLE `categorytable` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1$$

drop database cms;
create database CMS1;

use CMS;
show tables;
CREATE TABLE `user` (
  `userID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255),
  PRIMARY KEY (`userID`));
insert into user values(1,'admin','password');

create table `application` (
  `applicationID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `applicationName` varchar(255) NOT NULL,
  `flow` varchar(255),
  `productCatalog` bigint(20) unsigned NOT NULL,
CONSTRAINT `fk_productCatalog_application` FOREIGN KEY (`productCatalog`) REFERENCES `productCatalog` (`productCatalogID`) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (`applicationID`));

CREATE TABLE `productCatalog` (
  `productCatalogID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`productCatalogID`)
);

CREATE TABLE `product` (
  `productID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `productName` varchar(255),
  `productPrice` DECIMAL(10,2),
  `productCatalogID` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`productID`),
  CONSTRAINT `fk_productCatalog_product` FOREIGN KEY (`productCatalogID`) REFERENCES `productCatalog` (`productCatalogID`) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into product values (1,"Product1", 10, 1), (2,"Product2", 20, 1), (3,"Product3", 30, 1),
							(4,"Product4", 40, 2), (5,"Product5", 10, 2);

CREATE TABLE `category` (
  `categoryID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `categoryName` varchar(255),
  `categoryValue` varchar(255),
  `productID` bigint(20) unsigned NOT NULL,
  `categoryLogo` varchar(255);
  `valueLogo` varchar(255);
  PRIMARY KEY (`categoryID`),
  CONSTRAINT `fk_product_category` FOREIGN KEY (`productID`) REFERENCES `product` (`productID`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `page` (
  `pageID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `pageName` varchar(255),
  `header` bigint(20) unsigned NOT NULL,
  `navigator` bigint(20) unsigned NOT NULL,
  `section` bigint(20) unsigned NOT NULL,
  `article` bigint(20) unsigned NOT NULL,
  `aside` bigint(20) unsigned NOT NULL,
  `footer` bigint(20) unsigned NOT NULL,
  `applicationID` bigint(20) unsigned NOT NULL,
  `createdOn` datetime,
  PRIMARY KEY (`pageID`),
  CONSTRAINT `fk_application_page` FOREIGN KEY (`applicationID`) REFERENCES `application` (`applicationID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_headers_page` FOREIGN KEY (`header`) REFERENCES `headers` (`headerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_navigator_page` FOREIGN KEY (`navigator`) REFERENCES `navigator` (`navigatorID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_section_page` FOREIGN KEY (`section`) REFERENCES `section` (`sectionID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_article_page` FOREIGN KEY (`article`) REFERENCES `article` (`articleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_aside_page` FOREIGN KEY (`aside`) REFERENCES `aside` (`asideID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_footer_page` FOREIGN KEY (`footer`) REFERENCES `footer` (`footerID`) ON DELETE CASCADE ON UPDATE CASCADE
);



CREATE TABLE `article` (
  `articleID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `article` varchar(255) NOT NULL,
  PRIMARY KEY (`articleID`)
);

CREATE TABLE `aside` (
  `asideID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `aside` varchar(255) NOT NULL,
  PRIMARY KEY (`asideID`)
);

CREATE TABLE `headers` (
  `headerID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `header` varchar(255) NOT NULL,
  PRIMARY KEY (`headerID`)
);


CREATE TABLE `navigator` (
  `navigatorID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `navigator` varchar(255) NOT NULL,
  PRIMARY KEY (`navigatorID`)
);

CREATE TABLE `section` (
  `sectionID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `section` varchar(255) NOT NULL,
  PRIMARY KEY (`sectionID`)
);

CREATE TABLE `footer` (
  `footerID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `footer` varchar(255) NOT NULL,
  PRIMARY KEY (`footerID`)
);

use cms1;
show tables;
select * from user;
select * from application;
select * from page;
select * from headers;
select * from category;
select * from product;
select * from productcatalog;
select * from footer;
select * from navigator;
select * from section;
select * from article;
select * from aside;
select * from productCatalog;


delete from application;
delete from page;
delete from headers;
delete from footer;
delete from navigator;
delete from section;
delete from article;
delete from aside;
delete from user;
delete from productCatalog;
delete from product;
delete from category;


alter table header change column pageID page bigint(20) unsigned NOT NULL;

alter table application add column flow varchar(255);

drop table application;
drop database CMS;
use CMS1;
show tables;

alter table application add column productCatalog bigint(20) unsigned NOT NULL;
alter table page add column createdOn datetime;
alter table product drop column productName;
alter table application add CONSTRAINT `fk_productCatalog_application` FOREIGN KEY (`productCatalog`) REFERENCES `productCatalog` (`productCatalogID`) ON DELETE CASCADE ON UPDATE CASCADE;
delete from category;
alter table category add column categoryLogo varchar(255);
alter table category add column valueLogo varchar(255);
alter table user add column role varchar(255);
delete from user where userName = 'admin';
update category set categoryLogo = NULL where categoryName='a';

create database cms2;
use cms2;

drop database cms2;
