# CampusGear
# 🏠 Welkom bij CampusGear

Dit is de centrale documentatie voor het project **CampusGear**, ontwikkeld voor het vak *Advanced Programming Techniques*.

## ℹ️ Over dit project
CampusGear is een webapplicatie waarmee studenten eenvoudig spullen (zoals studieboeken, gereedschap of elektronica) kunnen uitlenen aan elkaar. Het doel is om duurzaamheid te bevorderen en kosten te besparen.



## 📂 Inhoudstafel

Klik op de links hieronder om de onderdelen te bekijken:

* **[[Product Description]]**
    * *De business case: Wat maken we, voor wie en waarom?*
    * 💡 Wat is CampusGear? CampusGear is een online platform waar studenten studiemateriaal, gereedschap, elektronica en andere bruikbare items kunnen uitlenen aan of huren van medestudenten. Het brengt vraag en aanbod binnen de campus samen.

👥 Voor wie is het? Het platform richt zich op twee rollen:

De Lener (Student): Iemand die tijdelijk iets nodig heeft (bijv. een boormachine voor een uur, of een cursusboek voor een week) en geen zin heeft om het nieuw te kopen.
De Uitlener (Student/Eigenaar): Iemand die spullen heeft liggen die stof staan te happen en daar graag iemand anders mee helpt (of een klein centje mee wil bijverdienen).
🚀 Waarom maken we dit?

Kostenbesparing: Studenten hebben vaak een beperkt budget. Lenen is goedkoper dan kopen.
Duurzaamheid: Door spullen te delen, gaan we de wegwerpmaatschappij tegen.
Sociale Cohesie: Het versterkt het contact tussen studenten op dezelfde campus.
* **[[Analysis]]**
    * *De technische kant: Database en User Stories.*
    ** erDiagram
      ```mermaid
    USER ||--o{ ITEM : "bezit"
    USER ||--o{ RESERVATION : "plaatst"
    ITEM ||--o{ RESERVATION : "heeft"

    USER {
        string email
        string password
        string naam
        string campus
    }
    ITEM {
        string titel
        string omschrijving
        string categorie
        string status
        string image_url
    }
    RESERVATION {
        date startDatum
        date eindDatum
        string status
    }
* **[[Design]]**
    * *Het visuele ontwerp: Persona's en Wireframes.*
We hebben 3 typische gebruikers uitgewerkt:

👱‍♀️ Eline (De Uitlener)
Leeftijd: 21 jaar (Multimedia student)
Doel: Ze heeft dure camera-apparatuur die ze doordeweeks niet gebruikt. Ze wil dat deze nuttig gebruikt wordt en er misschien een kleinigheidje aan verdienen.
Frustratie: Spullen staan stof te happen en nemen ruimte in.
👨‍🎓 Tom (De Lener)
Leeftijd: 19 jaar (Rechten student)
Doel: Snel en goedkoop een item vinden (bijv. een beamer voor een filmavond) in de buurt, zonder naar de winkel te hoeven.
Frustratie: Dure aanschafkosten voor iets dat hij maar één keer nodig heeft.
👮‍♂️ Mark (De Admin)
Functie: Campus beheerder
Doel: Zorgen dat er geen illegale of gevaarlijke items op het platform staan.


**2. Wireframes (Schetsen)**
**StartPagina**
<img width="1748" height="943" alt="Schermafbeelding 2026-02-14 142654" src="https://github.com/user-attachments/assets/9947c671-92d0-4bf6-bfbc-311c9480f82d" />


<img width="1408" height="752" alt="FOTO_1_CampusGear" src="https://github.com/user-attachments/assets/533c2637-a037-4b3e-a78b-cb2c17414122" />



