from clojure:latest

ENV APP_HOME /sicp

COPY . /sicp
WORKDIR /sicp

ADD project.clj $APP_HOME/project.clj

RUN lein deps

USER root
CMD bash
