REM This file assumes that maven is installed
@echo off
echo The server resides on port 80
mvn install
mvn spring-boot:run