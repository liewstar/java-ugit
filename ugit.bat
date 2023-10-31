@echo off
javac -cp "src/main/java" src/main/java/cli.java
java -cp "src/main/java" cli %*