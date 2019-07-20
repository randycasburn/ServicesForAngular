# This file assumes that maven is installed
echo The server resides on port 80
mvn install; mvn spring-boot:run; start "" http://localhost