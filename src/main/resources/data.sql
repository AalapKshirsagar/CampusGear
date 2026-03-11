INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus De Nayer', 'Mechelen');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Geel', 'Geel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Brussel', 'Brussel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Antwerpen', 'Antwerpen');

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Boormachine Bosch', 'Krachtige boormachine voor kleine klusjes', 'Gereedschap', 'beschikbaar', '/img/boormachine.jpg', 'Aalap', 1);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Calculus Boek', 'Studieboek Calculus 1e editie', 'Boeken', 'beschikbaar', '/img/calculus.jpg', 'Sara', 1);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Laptop Stand', 'Verstelbare laptop standaard', 'Elektronica', 'uitgeleend', '/img/laptopstand.jpg', 'Tom', 2);

INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Wetenschappelijke Calculator', 'Texas Instruments TI-84', 'Elektronica', 'beschikbaar', '/img/calculator.jpg', 'Lena', 3);