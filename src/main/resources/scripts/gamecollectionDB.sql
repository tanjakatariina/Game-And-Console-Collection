DROP DATABASE IF EXISTS gameCollection;
CREATE DATABASE gameCollection;
USE gameCollection;

CREATE TABLE Region
(
  RegionType VARCHAR(30) NOT NULL,
  PRIMARY KEY (RegionType)
);

CREATE TABLE Platform
(
  PlatformName VARCHAR(50) NOT NULL,
  PRIMARY KEY (PlatformName)
);

CREATE TABLE ConditionType
(
  Abbreviation VARCHAR(10) NOT NULL,
  FullName VARCHAR(50) NOT NULL,
  PRIMARY KEY (Abbreviation)
);

CREATE TABLE Console
(
  ConsoleId INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(250) NOT NULL,
  Color VARCHAR(50),
  Model VARCHAR(50),
  Edition VARCHAR(150),
  AdditionalInfo VARCHAR(2000),
  PlatformName VARCHAR(50) NOT NULL,
  RegionType VARCHAR(30),
  Abbreviation VARCHAR(10),
  PRIMARY KEY (ConsoleId),
  FOREIGN KEY (PlatformName) REFERENCES Platform(PlatformName),
  FOREIGN KEY (RegionType) REFERENCES Region(RegionType),
  FOREIGN KEY (Abbreviation) REFERENCES ConditionType(Abbreviation)
);

CREATE TABLE Game
(
  GameId INT NOT NULL AUTO_INCREMENT,
  Title VARCHAR(250) NOT NULL,
  Version VARCHAR(150),
  AdditionalInfo VARCHAR(2000),
  RegionType VARCHAR(30),
  PlatformName VARCHAR(50) NOT NULL,
  Abbreviation VARCHAR(10),
  PRIMARY KEY (GameId),
  FOREIGN KEY (RegionType) REFERENCES Region(RegionType),
  FOREIGN KEY (PlatformName) REFERENCES Platform(PlatformName),
  FOREIGN KEY (Abbreviation) REFERENCES ConditionType(Abbreviation)
);

CREATE TABLE Image
(
  ImageId INT NOT NULL AUTO_INCREMENT,
  Image BLOB NOT NULL,
  Name VARCHAR(150) NOT NULL,
  GameId INT NOT NULL,
  PRIMARY KEY (ImageId),
  FOREIGN KEY (GameId) REFERENCES Game(GameId)
);

CREATE TABLE GameCondition
(
  ConditionId INT NOT NULL AUTO_INCREMENT,
  DustCover CHAR(1),
  InnerStyrofoam CHAR(1),
  Inlay CHAR(1),
  GameProtector CHAR(1),
  BoxProtector CHAR(1),
  GameId INT,
  PRIMARY KEY (ConditionId),
  FOREIGN KEY (GameId) REFERENCES Game(GameId)
);