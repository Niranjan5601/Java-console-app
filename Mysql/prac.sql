CREATE DATABASE library;
USE library;

CREATE TABLE USERS(UID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, USERNAME VARCHAR(30), USR_PASSWORD VARCHAR(30), IS_ADMIN BOOLEAN);

CREATE TABLE BOOKS(BID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, BNAME VARCHAR(50), GENRE VARCHAR(20), PRICE INT);


CREATE TABLE ISSUED(IID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, UID INT, BID INT);


INSERT INTO BOOKS(BNAME, GENRE, PRICE) VALUES ('War and Peace', 'Mystery', 200),  ('The Guest Book', 'Fiction', 300), ('The Perfect Murder','Mystery', 150), ('Accidental Presidents', 'Biography', 250), ('The Wicked King','Fiction', 350);
select * from BOOKS;

INSERT INTO ISSUED(UID,BID) VALUES (10,5),(1,4),(10,3);
select BID from ISSUED WHERE UID = 10 ;	
SET SQL_SAFE_UPDATES=0;
DELETE  FROM USERS ;
SELECT * FROM USERS;
ALTER TABLE USERS ADD COLUMN IS_ADMIN INT;
INSERT INTO USERS(USERNAME, USR_PASSWORD, IS_ADMIN) VALUES('admin','admin',1),('Hello','123',0),('Lol','4454',1);