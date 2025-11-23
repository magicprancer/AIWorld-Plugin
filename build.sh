#!/bin/bash
echo "Building AIWorld plugin for Linux..."
./gradlew shadowJar

if [ $? -ne 0 ]; then
    echo "Build failed!"
    exit 1
fi

echo "Build completed! JAR file is in build/libs/AIWorld.jar"
