DROP DATABASE IF EXISTS gameConsoleCollection;
CREATE DATABASE gameConsoleCollection;
USE gameConsoleCollection;

CREATE TABLE Region
(
  RegionType VARCHAR(50) NOT NULL,
  PRIMARY KEY (RegionType)
);

CREATE TABLE Platform
(
  PlatformName VARCHAR(100) NOT NULL,
  PRIMARY KEY (PlatformName)
);

CREATE TABLE ConditionType
(
  Abbreviation VARCHAR(20) NOT NULL,
  FullName VARCHAR(60) NOT NULL,
  PRIMARY KEY (Abbreviation)
);

CREATE TABLE User
(
  Username VARCHAR(50) NOT NULL,
  Password VARCHAR(255) NOT NULL,
  RegisterDate DATETIME NOT NULL,
  PRIMARY KEY (Username)
);

CREATE TABLE Console
(
  ConsoleId INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(200) NOT NULL,
  Color VARCHAR(50),
  Model VARCHAR(50),
  Edition VARCHAR(100),
  AdditionalInfo VARCHAR(2000),
  AddedDate DATETIME NOT NULL,
  PlatformName VARCHAR(100) NOT NULL,
  RegionType VARCHAR(50),
  Abbreviation VARCHAR(20),
  Username VARCHAR(100) NOT NULL,
  PRIMARY KEY (ConsoleId),
  FOREIGN KEY (PlatformName) REFERENCES Platform(PlatformName),
  FOREIGN KEY (RegionType) REFERENCES Region(RegionType),
  FOREIGN KEY (Abbreviation) REFERENCES ConditionType(Abbreviation),
  FOREIGN KEY (Username) REFERENCES User(Username)
);

CREATE TABLE Game
(
  GameId INT NOT NULL AUTO_INCREMENT,
  Title VARCHAR(200) NOT NULL,
  Edition VARCHAR(150),
  AdditionalInfo VARCHAR(2000),
  AddedDate DATETIME NOT NULL,
  RegionType VARCHAR(50),
  PlatformName VARCHAR(100) NOT NULL,
  Abbreviation VARCHAR(20),
  Username VARCHAR(100) NOT NULL,
  PRIMARY KEY (GameId),
  FOREIGN KEY (RegionType) REFERENCES Region(RegionType),
  FOREIGN KEY (PlatformName) REFERENCES Platform(PlatformName),
  FOREIGN KEY (Abbreviation) REFERENCES ConditionType(Abbreviation),
  FOREIGN KEY (Username) REFERENCES User(Username)
);

CREATE TABLE Image
(
  ImageId INT NOT NULL AUTO_INCREMENT,
  Image BLOB NOT NULL,
  Name VARCHAR(100) NOT NULL,
  GameId INT,
  ConsoleId INT,
  PRIMARY KEY (ImageId),
  FOREIGN KEY (GameId) REFERENCES Game(GameId),
  FOREIGN KEY (ConsoleId) REFERENCES Console(ConsoleId)
);

CREATE TABLE GameCondition
(
  ConditionId INT NOT NULL AUTO_INCREMENT,
  DustCover CHAR(1) NOT NULL,
  InnerStyrofoam CHAR(1) NOT NULL,
  Inlay CHAR(1) NOT NULL,
  GameProtector CHAR(1) NOT NULL,
  BoxProtector CHAR(1) NOT NULL,
  GameId INT NOT NULL,
  PRIMARY KEY (ConditionId),
  FOREIGN KEY (GameId) REFERENCES Game(GameId)
);