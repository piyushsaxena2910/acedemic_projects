
use smartgrid;


SELECT * FROM energyprovider;
SELECT * FROM appliances;
SELECT * FROM peaktiming;
SELECT * FROM home;
SELECT * FROM network;
SELECT * FROM networkbreakdown;

INSERT INTO `energyprovider` VALUES (1,'BOSTON ENERGY PROVIDER','143 PARK DRIVE, BOSTON, MA'),(2,'MASS ENERGY PROVIDER','120 PARK DRIVE, BOSTON, MA');
INSERT INTO `home` VALUES (1,'Piyush Saxena','143 PARK DRIVE, BOSTON, MA',1),(2,'Swarna Dommeti','137 PARK DRIVE, BOSTON, MA',1),(3,'Vivek Dalal','128 PARK DRIVE, BOSTON, MA',1),(4,'Anindita Chakraborti','101 PARK DRIVE, BOSTON, MA',1),(5,'Mushtaq Rizvi','113 PARK DRIVE, BOSTON, MA',1),(6,'Abhishek Shukla','142 PARK DRIVE, BOSTON, MA',2),(7,'Shruti Shrivastava','136 PARK DRIVE, BOSTON, MA',2),(8,'Sagar Rana','127 PARK DRIVE, BOSTON, MA',2),(9,'Siddhesh Mhattre','100 PARK DRIVE, BOSTON, MA',2),(10,'Dharshit Sariya','112 PARK DRIVE, BOSTON, MA',2);
INSERT INTO `appliances` VALUES (1,'Fan',1,'',1),(2,'Lamp',1,'',1),(3,'Washing Machine',1,'',1),(4,'Dish Wassher',1,'',1),(5,'Fan',2,'',1),(6,'Lamp',2,'',1),(7,'Washing Machine',2,'',1),(8,'Dish Wassher',2,'',1),(9,'Fan',3,'',1),(10,'Lamp',3,'',1),(11,'Washing Machine',3,'',1),(12,'Dish Wassher',3,'',1),(13,'Fan',4,'',1),(14,'Lamp',4,'',1),(15,'Washing Machine',4,'',1),(16,'Dish Wassher',4,'',1),(17,'Fan',5,'',1),(18,'Lamp',5,'',1),(19,'Washing Machine',5,'',1),(20,'Dish Wassher',5,'',1),(21,'Fan',6,'',2),(22,'Lamp',6,'',2),(23,'Washing Machine',6,'',2),(24,'Dish Wassher',6,'',2),(25,'Fan',7,'',2),(26,'Lamp',7,'',2),(27,'Washing Machine',7,'',2),(28,'Dish Wassher',7,'',2),(29,'Fan',8,'',2),(30,'Lamp',8,'',2),(31,'Washing Machine',8,'',2),(32,'Dish Wassher',8,'',2),(33,'Fan',9,'',2),(34,'Lamp',9,'',2),(35,'Washing Machine',9,'',2),(36,'Dish Wassher',9,'',2),(37,'Fan',10,'',2),(38,'Lamp',10,'',2),(39,'Washing Machine',10,'',2),(40,'Dish Wassher',10,'',2);
INSERT INTO `peaktiming` VALUES (1,'08:00:00','02:00:00',1),(2,'20:00:00','24:00:00',2);
INSERT INTO `network` VALUES (1,'1,2,3,4,5',1,'YES','0'),(2,'1,3,2',1,'NO','1,2'),(3,'1,3,4,5',1,'NO','1,2'),(4,'1,2',1,'NO','2,3'),(5,'1,3,4,5',1,'NO','2,3'),(6,'1,2',1,'NO','3,4'),(7,'1,5,4',1,'NO','3,4'),(8,'1,2,3,4',1,'NO','4,5'),(9,'1,5',1,'NO','4,5'),(10,'6,7,8,9,10',2,'YES','0'),(11,'6,8,7',2,'NO','6,7'),(12,'6,8,9,10',2,'NO','6,7'),(13,'6,7',2,'NO','7,8'),(14,'6,8,9,10',2,'NO','7,8'),(15,'6,7',2,'NO','8,9'),(16,'6,10,9',2,'NO','8,9'),(17,'6,7,8,9',2,'NO','9,10'),(18,'6,10',2,'NO','9,10');

ALTER TABLE appliances ADD COLUMN addedtime datetime;
call appliancesswitchonprocedure;
update appliances set addedtime = NOW() where homeid IN (1,2,3,4,5,6,7,8,9,10);

select * from appliances where applilanceid >1 order by addedtime desc limit 1;

select variance(applilanceid) as variance from appliances;
SELECT applilanceid FROM appliances ORDER BY CAST(applilanceid AS CHAR);

select concat('hello','world');
SELECT LEAST(34.0,3.0,3.01,76.0);
SELECT STRCMP('string here', 'string here too');
SELECT WEEKDAY('2008-02-03 22:23:00');
SELECT DATE_ADD('2008-01-02', INTERVAL 31 DAY);

SELECT UTC_TIMESTAMP(), UTC_TIMESTAMP() + 0;

select name from energyprovider cross join peaktiming 
on energyprovider.energyproviderid = peaktiming.energyproviderid;

select applilanceid from appliances where applilanceid in (
select appliances.homeid from appliances join home on appliances.homeid = home.homeid);

show grants;

SELECT networkbreakdown.energyproviderid from networkbreakdown where energyproviderid = 1
ORDER BY networkbreakdown.timeupdated DESC LIMIT 1;

INSERT INTO networkbreakdown values(1,'1,2',1,NOW());

UPDATE network SET status = 'No' where network.energyproviderid = 1;
UPDATE network SET status = 'Yes' where network.breakdownpath = 
(SELECT networkbreakdown.network from networkbreakdown where energyproviderid = 1
ORDER BY networkbreakdown.timeupdated DESC LIMIT 1);


INSERT INTO `energyprovider` VALUES (3,'BOSTON ENERGY PROVIDER','143 PARK DRIVE, BOSTON, MA');

rollback;
select * from energyprovider;

rollback;
delete from energyprovider where energyproviderid in (3,4);
select * from energyprovider;
INSERT INTO `energyprovider` VALUES (4,'BOSTON ENERGY PROVIDER','143 PARK DRIVE, BOSTON, MA');
commit;
rollback;

UPDATE energyprovider SET name = 'abc' where energyproviderid = 1;
SAVEPOINT point1;

UPDATE energyprovider SET name = 'abc' where energyproviderid = 1;
ROLLBACK TO SAVEPOINT point1;
select * from energyprovider;

LOCK TABLE energyprovider AS MYALIAS read;

UNLOCK TABLE;
select * from energyprovider;

CREATE VIEW homeView as SELECT * FROM HOME;
select * from homeView;

CREATE VIEW numberOfAppliancesInHome as SELECT homeid, COUNT(homeid) FROM appliances GROUP BY homeid;
select * from numberOfAppliancesInHome;

CREATE VIEW energyprovideridDescTimeupdate as
(SELECT networkbreakdown.energyproviderid from networkbreakdown where energyproviderid = 1
ORDER BY networkbreakdown.timeupdated DESC);

select * from energyprovideridDescTimeupdate;