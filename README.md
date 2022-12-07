# 1-17-Pizza-3TableGy
## A Fleadat megtekinthető itt :
*[http://kecskemetpizza.asuscomm.com/](http://kecskemetpizza.asuscomm.com/)

*[http://kecskemetpizza.asuscomm.com:8080/api/](http://kecskemetpizza.asuscomm.com:8080/api/)

## Table of contents
* [General info](#general-info)

* [Java alkalmazások Beadandó - gyakorlat](JavaalkalmazásokBeadandógyakorlat)

## General info
Az alkalazás java springel készült
az adatbázis Mariadb-vel van megvalositva


## Java alkalmazások Beadandó - gyakorlat

[A feladathoz **segítséget** a feladat végénél talál!]{.underline}

**Alakítsanak ki két-fős csoportokat és a feladatot közösen,
projektmunkában oldják meg.** Ezzel gyakorolják a cégeknél általános
projektfeladatokat és a Git projektes használatát. A dokumentációban
majd írják le, hogy a két főből ki melyik feladatrészt csinálta meg. A
csoportoknál a kapcsolatfelvételt és a közös munkát a Teams-en meg lehet
oldani.

Az **Adatbázisok** mappában találnak adatbázis forrásokat, amik közül
kell egyet a csoportnak választani és felhasználni a feladatában. **Egy
adatbázist csak egy csoport választhat. Az adatbázist lehet újabb
táblákkal bővíteni** pl. felhasznalok tábla.

**Az elkészítendő weboldalának témáját a választott adatbázishoz
igazítsa**. Forrásokat (képek, szövegek, ...) gyűjtsön az Internetről.

**[Összesen 20 pont]{.underline}**

Készítsen egy weboldalt egy fiktív cég, szervezet, alapítvány...
részére, amely a következő követelményeknek tesz eleget:

1.  Az első oldalon mutassa be a céget egy látványos weboldalon **(2
    pont)**

2.  Legyen Regisztráció, Bejelentkezési lehetőség **(2 pont)**\
    - A „Belépés" menüpont akkor látható, ha nincs bejelentkezve a
    felhasználó.\
    - A „Kilépés" menüpont akkor látható, ha be van jelentkezve a
    felhasználó.\
    - A rendszer fejlécen jelenítse meg a bejelentkezett felhasználót,
    ha be van lépve

3.  Legalább 3 felhasználói szerepet különböztessen meg: **(4 pont)**\
    Admin, User, Látogató\
    A menüpontok megjelenése és az oldalak elérhetősége változik attól
    függően,\
    hogy melyik felhasználó használja az oldalt. (pl. admin oldal)

4.  legyen egy oldal, ahol a választott adatbázisból jelenít meg
    adatokat **(2 pont)**\
    Ehhez 3 tábla adatait használja fel az adatbázisból.

5.  Az egyik oldalon legyen egy kapcsolat űrlap, amelynek segítségével
    üzenetet **(2 pont)**\
    lehet küldeni az oldal tulajdonosa számára. Ellenőrizze megfelelően
    az űrlap\
    helyes kitöltését szerver oldali validációval is. Az elküldött Űrlap
    adatokat\
    mentse le az adatbázisba.

6.  Tegye lehetővé megtekinteni egy hatodik oldalon táblázatban az előző
    pontban **(2 pont)**\
    elküldött üzeneteket az adatbázisból fordított időrend szerint (a
    legfrissebb\
    legyen elől). Írja minden üzenethez a küldés idejét és az
    üzenetküldő nevét.\
    Ha nem bejelentkezett felhasználó írta, akkor: \"Vendég\".

7.  Valósítson meg az alkalmazásban egy RESTful API-t. **(2 pont)**\
    Tesztelje az API funkcióit cURL-el és Postman-al is. Mindkét
    tesztről tegyen\
    képernyőképeket a dokumentációba

8.  Használják a GitHub (github.com) verziókövető rendszert. **(2
    pont)**\
    (**Kötelező elem**! **A forrás ez alapján lesz javítva**)\
    A GitHub-on a projektmunka módszert alkalmazzák: látszódjék, hogy a\
    csoport tagjai melyik részt készítették el és kb. fele-fele arányban
    járuljanak\
    hozzá a projekthez. Ne csak a kész alkalmazást töltsék fel egy
    lépésben,\
    hanem a részállapotokat is még legalább 5 lépésben személyenként.

9.  Alkalmazását töltse fel és valósítsa meg Interneten a **Microsoft
    Azure** felhőben. **(2 pont)**\
    (**Kötelező elem**! **A működés ez alapján lesz javítva**)

**Készítsen legalább 10 oldalas dokumentációt (PDF formátumban)**,
amiben leírja az alkalmazás működését képernyőképekkel. (**Kötelező
elem**!) A dokumentációban adja meg a tárhely és a GitHub projektjének
URL címét **és írja le részletesen, hogy az előző feladatpontokat az
alkalmazásban hogy és hol valósította meg**. Fontos, hogy ez utóbbit
leírja a dokumentációban, mert a feladat ez alapján lesz javítva. A
dokumentációban adja meg az internetes szolgáltató belépéséhez szükséges
címet, felhasználónevet és jelszót, ami szükséges a megoldás
ellenőrzéséhez, valamint a GitHub címét.

**Be kell adni** a **Neptun MeetStreet**-en keresztül a dokumentációt.
Akik közösen csinálják, mindenki adja be a dokumentációt.
