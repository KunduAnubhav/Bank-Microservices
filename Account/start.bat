@echo off
echo =========================================
echo Starting Account Microservice...
echo =========================================

cd /d G:\my_pdf\TCS_explore\MicroServices\Account

echo.
echo ===== Running Maven Clean Install =====
call mvn clean install -DskipTests

if errorlevel 1 (
    echo.
    echo *************************************
    echo BUILD FAILED!
    echo *************************************
    pause
    exit /b 1
)

echo.
echo ===== Starting Spring Boot with QA Profile =====
call mvn spring-boot:run -Dspring-boot.run.profiles=qa

if errorlevel 1 (
    echo.
    echo *************************************
    echo APPLICATION FAILED TO START!
    echo *************************************
    pause
    exit /b 1
)

echo.
echo =========================================
echo Application started successfully.
echo =========================================

pause