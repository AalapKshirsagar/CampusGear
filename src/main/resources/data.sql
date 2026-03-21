INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus De Nayer', 'Mechelen');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Geel', 'Geel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Brussel', 'Brussel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Antwerpen', 'Antwerpen');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Vorst', 'Brussel');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Leuven', 'Leuven');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Turnhout', 'Turnhout');
INSERT INTO CAMPUS (NAAM, CITY) VALUES ('Campus Mol', 'Mol');

INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Aalap Kshirsagar', 'aalap@student.thomasmore.be', 'password', 1);
INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Sara Janssen', 'sara@student.thomasmore.be', 'password', 2);
INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Tom Peeters', 'tom@student.thomasmore.be', 'password', 3);
INSERT INTO STUDENT (NAAM, EMAIL, PASSWORD, CAMPUS_ID)
VALUES ('Lena Claes', 'lena@student.thomasmore.be', 'password', 4);

-- Campus De Nayer (Mechelen) - 6 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Boormachine Bosch', 'Krachtige boormachine voor kleine klusjes', 'Gereedschap', 'beschikbaar', '/img/boormachine.jpg', 'Aalap', 1);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Calculus Boek', 'Studieboek Calculus 1e editie', 'Boeken', 'beschikbaar', '/img/calculus.jpg', 'Aalap', 1);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Laptop Stand', 'Verstelbare laptop standaard', 'Elektronica', 'uitgeleend', '/img/laptopstand.jpg', 'Aalap', 1);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Gitaar', 'Akoestische gitaar Yamaha', 'Muziek', 'beschikbaar', '/img/gitaar.jpg', 'Aalap', 1);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Strijkijzer', 'Philips strijkijzer', 'Huishouden', 'beschikbaar', '/img/strijkijzer.jpg', 'Aalap', 1);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Voetbal', 'Nike voetbal maat 5', 'Sport', 'beschikbaar', '/img/voetbal.jpg', 'Aalap', 1);

-- Campus Geel - 5 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Wetenschappelijke Calculator', 'Texas Instruments TI-84', 'Elektronica', 'beschikbaar', '/img/calculator.jpg', 'Sara', 2);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Natuurkunde Boek', 'Natuurkunde voor ingenieurs', 'Boeken', 'beschikbaar', '/img/natuurkunde.jpg', 'Sara', 2);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Hamer', 'Stanley hamer 500g', 'Gereedschap', 'beschikbaar', '/img/hamer.jpg', 'Sara', 2);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Micro SD Kaart', '128GB Samsung micro SD', 'Elektronica', 'uitgeleend', '/img/sdkaart.jpg', 'Sara', 2);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Tennisracket', 'Wilson tennisracket', 'Sport', 'beschikbaar', '/img/tennisracket.jpg', 'Sara', 2);

-- Campus Brussel - 6 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Arduino Kit', 'Arduino starter kit met sensoren', 'Elektronica', 'beschikbaar', '/img/arduino.jpg', 'Tom', 3);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Schaar', 'Professionele schaar', 'Huishouden', 'beschikbaar', '/img/schaar.jpg', 'Tom', 3);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Programmeerboek Java', 'Java voor beginners', 'Boeken', 'uitgeleend', '/img/javaboek.jpg', 'Tom', 3);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Keyboard', 'Logitech draadloos keyboard', 'Elektronica', 'beschikbaar', '/img/keyboard.jpg', 'Tom', 3);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Basketbal', 'Spalding basketbal maat 7', 'Sport', 'beschikbaar', '/img/basketbal.jpg', 'Tom', 3);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Zaklamp', 'LED zaklamp 500 lumen', 'Gereedschap', 'beschikbaar', '/img/zaklamp.jpg', 'Tom', 3);

-- Campus Antwerpen - 5 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Drone', 'DJI Mini drone met camera', 'Elektronica', 'beschikbaar', '/img/drone.jpg', 'Lena', 4);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Wiskunde Boek', 'Hogere wiskunde deel 2', 'Boeken', 'beschikbaar', '/img/wiskunde.jpg', 'Lena', 4);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Yogamat', 'Adidas yogamat 6mm', 'Sport', 'uitgeleend', '/img/yogamat.jpg', 'Lena', 4);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Stofzuiger', 'Philips steelstofzuiger', 'Huishouden', 'beschikbaar', '/img/stofzuiger.jpg', 'Lena', 4);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('USB Hub', '7-poorts USB hub', 'Elektronica', 'beschikbaar', '/img/usbhub.jpg', 'Lena', 4);

-- Campus Vorst - 5 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Keyboard Piano', 'Yamaha keyboard 61 toetsen', 'Muziek', 'beschikbaar', '/img/piano.jpg', 'Aalap', 5);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Schroevendraaier Set', 'Set van 12 schroevendraaiers', 'Gereedschap', 'beschikbaar', '/img/schroevendraaier.jpg', 'Aalap', 5);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Statistiek Boek', 'Statistiek voor sociale wetenschappen', 'Boeken', 'uitgeleend', '/img/statistiek.jpg', 'Sara', 5);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Webcam', 'Logitech HD webcam 1080p', 'Elektronica', 'beschikbaar', '/img/webcam.jpg', 'Sara', 5);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Badminton Set', 'Badminton set met 2 rackets', 'Sport', 'beschikbaar', '/img/badminton.jpg', 'Tom', 5);

-- Campus Leuven - 6 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Raspberry Pi', 'Raspberry Pi 4 model B', 'Elektronica', 'beschikbaar', '/img/raspberrypi.jpg', 'Tom', 6);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Economie Boek', 'Micro-economie 3e editie', 'Boeken', 'beschikbaar', '/img/economie.jpg', 'Tom', 6);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Waterkoker', 'Philips waterkoker 1.7L', 'Huishouden', 'uitgeleend', '/img/waterkoker.jpg', 'Lena', 6);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Niveau', 'Stanley waterpas 60cm', 'Gereedschap', 'beschikbaar', '/img/niveau.jpg', 'Lena', 6);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Springtouw', 'Professioneel springtouw', 'Sport', 'beschikbaar', '/img/springtouw.jpg', 'Lena', 6);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Ukulele', 'Mahalo ukulele soprano', 'Muziek', 'beschikbaar', '/img/ukulele.jpg', 'Aalap', 6);

-- Campus Turnhout - 5 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Monitor', 'Samsung 24 inch monitor', 'Elektronica', 'beschikbaar', '/img/monitor.jpg', 'Sara', 7);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Chemie Boek', 'Organische chemie basis', 'Boeken', 'beschikbaar', '/img/chemie.jpg', 'Sara', 7);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Mixer', 'Braun handmixer 400W', 'Huishouden', 'uitgeleend', '/img/mixer.jpg', 'Tom', 7);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Fitness Mat', 'Nike fitness mat 10mm', 'Sport', 'beschikbaar', '/img/fitnessmat.jpg', 'Tom', 7);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Soldeerbout', 'Weller soldeerbout 40W', 'Gereedschap', 'beschikbaar', '/img/soldeerbout.jpg', 'Lena', 7);

-- Campus Mol - 5 items
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('VR Bril', 'Meta Quest 2 VR bril', 'Elektronica', 'beschikbaar', '/img/vrbril.jpg', 'Aalap', 8);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Biologie Boek', 'Moleculaire biologie', 'Boeken', 'beschikbaar', '/img/biologie.jpg', 'Aalap', 8);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Tafeltennisset', 'Tafeltennisset met 2 batjes', 'Sport', 'beschikbaar', '/img/tafeltennis.jpg', 'Sara', 8);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Koffiemachine', 'Nespresso koffiemachine', 'Huishouden', 'uitgeleend', '/img/koffie.jpg', 'Sara', 8);
INSERT INTO ITEM (TITLE, DESCRIPTION, CATEGORY, STATUS, IMAGE_URL, OWNER_NAME, CAMPUS_ID)
VALUES ('Multimeter', 'Fluke digitale multimeter', 'Gereedschap', 'beschikbaar', '/img/multimeter.jpg', 'Tom', 8);

-- Reservaties
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-19', '2026-03-22', 3, 1);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-20', '2026-03-25', 9, 2);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-21', '2026-03-28', 13, 3);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-19', '2026-03-24', 19, 4);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-22', '2026-03-26', 26, 1);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-20', '2026-03-23', 32, 2);
INSERT INTO RESERVATION (START_DATE, END_DATE, ITEM_ID, STUDENT_ID)
VALUES ('2026-03-21', '2026-03-27', 37, 3);