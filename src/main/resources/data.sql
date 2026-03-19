INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus De Nayer', 'Mechelen');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Geel', 'Geel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Brussel', 'Brussel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Antwerpen', 'Antwerpen');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Vorst', 'Brussel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Leuven', 'Leuven');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Turnhout', 'Turnhout');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Mol', 'Mol');

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Boormachine Bosch', 'Krachtige boormachine voor kleine klusjes', 'Gereedschap', 'beschikbaar', '/img/boormachine.jpg', 'Aalap', 1);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Calculus Boek', 'Studieboek Calculus 1e editie', 'Boeken', 'beschikbaar', '/img/calculus.jpg', 'Sara', 1);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Laptop Stand', 'Verstelbare laptop standaard', 'Elektronica', 'uitgeleend', '/img/laptopstand.jpg', 'Tom', 2);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Wetenschappelijke Calculator', 'Texas Instruments TI-84', 'Elektronica', 'beschikbaar', '/img/calculator.jpg', 'Lena', 3);




INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Aalap Kshirsagar', 'aalap@student.thomasmore.be', 'password', 1);

INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Sara Janssen', 'sara@student.thomasmore.be', 'password', 4);

INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Tom Peeters', 'tom@student.thomasmore.be', 'password', 2);

INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Lena Claes', 'lena@student.thomasmore.be', 'password', 3);


INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-19', '2026-03-22', 1, 1);

INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-20', '2026-03-25', 3, 2);

INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-21', '2026-03-23', 2, 3);