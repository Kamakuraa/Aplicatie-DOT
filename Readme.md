mariadb docker start command: 

<code>docker run -p 127.0.0.1:3306:3306 --name mariadb -e MARIADB_ROOT_PASSWORD=Password123! -d mariadb:latest</code>

connect to mariadb 

<code>docker exec -it mariadb mariadb --user root -pPassword123!</code>

Shell cmd for db create:

<code>create database omologari;</code>
