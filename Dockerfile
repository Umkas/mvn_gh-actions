FROM maven:3.9.6-sapmachine-21

RUN apt-get update
RUN apt-get install -y wget
RUN wget -q https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install -y ./google-chrome-stable_current_amd64.deb
RUN apt-get install -y xvfb --fix-missing

COPY . .

RUN mvn clean
CMD ["mvn", "test"]