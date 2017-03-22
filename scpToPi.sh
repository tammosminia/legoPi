#!/usr/bin/env bash
gradle fatJar
scp build/libs/legoPi-all-1.0-SNAPSHOT.jar pi@192.168.3.58:~
#ssh pi@192.168.3.58 "java -jar legoPi-all-1.0-SNAPSHOT.jar Forward"
ssh pi@192.168.3.58 "/opt/scala-2.12.1/bin/scala -classpath legoPi-all-1.0-SNAPSHOT.jar"
