# VERSION       1.0
# ~~~~ Image base ~~~~
FROM java:8
MAINTAINER David Bourasseau <dbourasseau@viotech.net>
EXPOSE 9000
ADD session.jar session.jar
CMD java -Djava.security.egd=file:/dev/./urandom -jar session.jar -f /tmp/datatemu/ -d dockermgt:9001 --HD $HD --HDP $HDP --SD $SD
