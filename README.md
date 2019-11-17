# quarkus elytron postgresql security [![Build Status](https://travis-ci.org/daggerok/quarkus-elytron-security-jdbc-postgresql-example.svg?branch=master)](https://travis-ci.org/daggerok/quarkus-elytron-security-jdbc-postgresql-example)
Secure Quarkus apps with JDBC

Status: IN PROGRESS

## getting started

```bash
./mvnw clean compile quarkus:build docker:build docker:start
http :8080
http :8080/health
http :8080/api/hello
http :8080/api/hello/max
./mvnw docker:stop docker:remove
```

## resources

* [Quarkus - using security with a JDBC realm](https://quarkus.io/guides/security-jdbc.html)
* [Apache assets](http://maven.apache.org/plugins/maven-assembly-plugin/assembly-component.html)
* [Maven + Docker by using fabric.io](https://dmp.fabric8.io/)
* [Postgres on Docker Hub](https://hub.docker.com/_/postgres)
* [Docker cleanup: docker images -f "dangling=true"](https://docs.docker.com/engine/reference/commandline/images/)
* [docker-compose-maven-plugin](https://github.com/dkanejs/docker-compose-maven-plugin)
* [Container Training](https://container.training/)
