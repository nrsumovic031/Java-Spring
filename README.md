<h2>Spring security</h2>

- Baza: 
  
        Mozete koristiti svoju mySql ali ostavio sam ovde docker-compose fajl ako hocete mozete
        da pokrenete preko dockera sa docker-compose up posto sam promenio portove a 
        i konfiguracija je u njemu podesena da se podudara sa ovom u programu.
        
        Ukoliko ne radi pravljenje tabele u application.properties zakomentarisite
        liniju 12 a odkomentarisite liniju 13 dok se napravi pa vratite na normalu.

- Rute

        POST /signIn (Prosledjuje mu se body i mogu svi da mu pristupe)
        POST /signUp (Prosledjuje mu se body i mogu svi da mu pristupe)
        GET /getUserProfile (Prosledjuje se id kao RequestParam i mogu da mu pristupe samo korisnici)
        GET /getAllUserProfiles (Ne prosledjuju mu se nikakvi argumenti i mogu da mu pristupe samo korisnici)
        DELETE /deleteUserProfile (Prosledjuje se id kao PathVariable i mogu da mu pristupe samo korisnici)
        PUT /updateUserProfile (Prosledjuje se id kao PathVariable kao i body za promenu i mogu da mu pristupe samo korisnici)
  
<h3>!!! U zadatku stoji da i ruta signIn treba da bude autorizovana ali mi nije imalo logike posto se preko nje prijavljujemo</h3>

- Dependency

        spring-boot-starter-data-jpa
        spring-boot-starter-security
        jjwt
        mysql-connector-java
        spring-boot-starter-web
        
<h2>Zadatak: </h2>

        Backend zadaci

        1. Napraviti Rest API koji ima sledece endpoint-e:

        signUp

        signIn

        getUserProfile

        getAllUserProfiles

        deleteUserProfile

        updateUserProfile

        2. Implementirati osnovnu autentifikaciju preko JWT tokena.

        3. Autentifikacija se koristi za:

        signIn

        getUserProfile

        getAllUserProfiles

        deleteUserProfile

        updateUserProfile

        4. SQL baza po izboru

        Aplikaciju napisati u Java Spring-u.

        Front-end nije potreban.