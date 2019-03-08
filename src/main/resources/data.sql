INSERT INTO PLACE (COUNTRY, CITY, ADDRESS, NAME, LAT, LNG, PRICE, BAG_CAPACITY, TIME_OPEN, TIME_CLOSE, RATING, DESCRIPTION)
VALUES ('Sweden', 'Stockholm', 'Landsvägen 40, 172 63 SUNDBYBERG', 'Swedbank AB', 59.359163, 17.974759, 110, 10, 08, 17, 5, 'We are a centrally placed bank who in addition to storing money also can offer a bag storing service!');
INSERT INTO PLACE (COUNTRY, CITY, ADDRESS, NAME, LAT, LNG, PRICE, BAG_CAPACITY, TIME_OPEN, TIME_CLOSE, RATING, DESCRIPTION)
VALUES ('Sweden', 'Stockholm', 'Drottninggatan 16, 111 51 STOCKHOLM', 'Espresso House', 59.330144, 18.065417, 60, 10, 09, 18, 4, 'Welcome to Espresso House! We make best coffee in town. Drop by and leave your bag.');
INSERT INTO PLACE (COUNTRY, CITY, ADDRESS, NAME, LAT, LNG, PRICE, BAG_CAPACITY, TIME_OPEN, TIME_CLOSE, RATING, DESCRIPTION)
VALUES ('Sweden', 'Stockholm', 'Observatoriegatan 8, 113 29 STOCKHOLM', 'Flippin Burgers', 59.340831, 18.050811, 90, 10, 10, 19, 3, 'We are a centrally placed burger place who in addition to storing money also can offer a bag storing service!');

INSERT INTO CUSTOMER (FULL_NAME, USERNAME, EMAIL, PASSWORD) VALUES ('Emma Piskator', 'emma','emma@mail.com','dog123');
INSERT INTO CUSTOMER (FULL_NAME, USERNAME, EMAIL, PASSWORD) VALUES ('Jungha Lee','jungha','jungha@mail.com','cat123');
INSERT INTO CUSTOMER (FULL_NAME, USERNAME, EMAIL, PASSWORD) VALUES ('Tejaswini Kollu','teju','tejaswini@mail.com','pig123');
INSERT INTO CUSTOMER (FULL_NAME, USERNAME, EMAIL, PASSWORD) VALUES ('Alexander Eriksson','alex','alexander@mail.com','rat123');

INSERT INTO BOOKING (CUSTOMER_ID, PLACE_ID, BAG_AMOUNT, DATE_START, DATE_END) VALUES (1,1,2, '2019-03-08', '2019-03-09');
INSERT INTO BOOKING (CUSTOMER_ID, PLACE_ID, BAG_AMOUNT, DATE_START, DATE_END) VALUES (2,2,4, '2019-03-08', '2019-03-09');