CREATE TABLE PLACE(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    COUNTRY VARCHAR(64) NOT NULL,
    CITY VARCHAR(64) NOT NULL,
    ADDRESS VARCHAR(64) NOT NULL,
    NAME VARCHAR(64) NOT NULL,
    LAT DOUBLE NOT NULL,
    LNG DOUBLE NOT NULL,
    PRICE DECIMAL(6,2) NOT NULL,
    BAG_CAPACITY INT NOT NULL,
    TIMEOPEN TIME(7) NOT NULL,
    TIMECLOSE TIME(7) NOT NULL,
    RATING INT NOT NULL,
    DESCRIPTION VARCHAR(256) NOT NULL
);


CREATE TABLE CUSTOMER(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(64) NOT NULL,
    EMAIL VARCHAR(64) NOT NULL,
    PASSWORD VARCHAR(64) NOT NULL,
);


CREATE TABLE BOOKING(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    CUSTOMER_ID BIGINT NOT NULL,
    PLACE_ID BIGINT NOT NULL,
    BAG_AMOUNT INT NOT NULL,
    DATETIME_START DATETIME NOT NULL,
    DATETIME_END DATETIME NOT NULL,
);