#!/bin/bash

# compiling .java files
javac -d .. enums/*.java
javac -cp .. -d .. abstract-classes/Person.java
javac -cp .. -d .. interfaces/*.java
javac -cp .. -d .. abstract-classes/Detective.java
javac -cp .. -d .. heroes/*.java
javac -cp .. -d .. Story.java

# make jar
echo "Manifest-Version: 1.0" > MANIFEST.mf
echo "Main-Class: prog1.lab3.Story" >> MANIFEST.mf
echo "Class-Path: .." >> MANIFEST.mf
jar cmf MANIFEST.mf Lab3.jar ../prog1

# documentation
# javadoc -encoding UTF-8 -charset UTF-8  -d docs/ -cp .. \
# *.java */*.java