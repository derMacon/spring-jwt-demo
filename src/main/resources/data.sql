DROP DATABASE token_demo;
CREATE DATABASE token_demo;

USE token_demo;
SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE account (
  id VARCHAR(500) PRIMARY KEY,
  username VARCHAR(500) NOT NULL,
  password VARCHAR(5000) NOT NULL,
  firstname VARCHAR(500) NOT NULL,
  lastname VARCHAR(5000) NOT NULL
);

INSERT INTO account (id, username, password, firstname, lastname)
VALUES ("1", "test", "test", "test", "test");

