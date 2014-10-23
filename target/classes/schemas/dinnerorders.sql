DROP DATABASE IF EXISTS dinnerorders;
CREATE DATABASE IF NOT EXISTS dinnerorders;
USE dinnerorders;

DROP TABLE IF EXISTS users,
                     groups,
                     group_users,
                     dishes, 
                     menus, 
                     menu_dishes,
					 group_menus;
   set storage_engine = InnoDB;
-- set storage_engine = MyISAM;
-- set storage_engine = Falcon;
-- set storage_engine = PBXT;
-- set storage_engine = Maria;

select CONCAT('storage engine: ', @@storage_engine) as INFO;
CREATE TABLE users (
    id      INT             NOT NULL AUTO_INCREMENT,
    birth_date  DATE           ,
    first_name  VARCHAR(30)     NOT NULL,
    last_name   VARCHAR(30)     NOT NULL,
    gender      ENUM ('M','F') ,    
    PRIMARY KEY (id)
);
CREATE TABLE groups (
    id  INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	desciption VARCHAR(180),
    PRIMARY KEY (id)
);
CREATE TABLE group_users (
    id INT NOT NULL AUTO_INCREMENT,
	group_id INT ,
	user_id INT,
	PRIMARY KEY (id),
	FOREIGN KEY (group_id) REFERENCES groups(id),
	FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE dishes(
    id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(180),
	description VARCHAR(180),
	price DECIMAL(6,2),
	PRIMARY KEY (id)
);
CREATE TABLE menus(
    id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(180),
	creation_time TIMESTAMP,
	PRIMARY KEY (id)
);
CREATE TABLE menu_dishes(
    id INT NOT NULL AUTO_INCREMENT,
	menu_id INT,
	dish_id INT,
	count INT,
	price Decimal(8,2),
	added_by INT,
	added_time TIMESTAMP,
	PRIMARY KEY (id),
	FOREIGN KEY (menu_id) REFERENCES menus(id),
	FOREIGN KEY (dish_id) REFERENCES dishes(id)
);
CREATE TABLE group_menus(
    id INT NOT NULL AUTO_INCREMENT,
	group_id INT,
	menu_id INT,
	creation_date DATE,
	creation_time TIMESTAMP,
	PRIMARY KEY(id),
	FOREIGN KEY (group_id) REFERENCES groups(id),
    FOREIGN KEY (menu_id) REFERENCES menus(id)
);


	
	


