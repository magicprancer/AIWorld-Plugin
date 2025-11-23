@echo off
echo Building AIWorld plugin for Windows...
gradlew.bat shadowJar
if %errorlevel% neq 0 (
    echo Build failed!
    pause
    exit /b %errorlevel%
)
echo Build completed! JAR file is in build\libs\AIWorld.jar
pause
