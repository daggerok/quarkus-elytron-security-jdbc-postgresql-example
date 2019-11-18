# quarkus elytron postgresql security [![Build Status](https://travis-ci.org/daggerok/quarkus-elytron-security-jdbc-postgresql-example.svg?branch=master)](https://travis-ci.org/daggerok/quarkus-elytron-security-jdbc-postgresql-example)
Secure Quarkus apps with JDBC

Java 8 (JDK8) is required.
See usages [in .travis.yml](.travis.yml) file

## getting started

```bash
./mvnw -Pfabric8-pg-app clean compile quarkus:build docker:build docker:start
http :8080
http :8080/health
http :8080/api/hello
http :8080/api/hello/max
./mvnw -Pfabric8-pg-app docker:stop docker:remove
```

## resources

* [Quarkus - override config at runtime](https://quarkus.io/guides/config#overriding-properties-at-runtime)
* [Quarkus - using security with a JDBC realm](https://quarkus.io/guides/security-jdbc.html)
* [Quarkus - datasources](https://quarkus.io/guides/datasource)
* [Apache assets](http://maven.apache.org/plugins/maven-assembly-plugin/assembly-component.html)
* [Maven + Docker by using fabric.io](https://dmp.fabric8.io/)
* [Fabric8 external Dockerfile](https://maven.fabric8.io/#external-dockerfile)
* [Postgres on Docker Hub](https://hub.docker.com/_/postgres)
* [Docker cleanup: docker images -f "dangling=true"](https://docs.docker.com/engine/reference/commandline/images/)
* [docker-compose-maven-plugin](https://github.com/dkanejs/docker-compose-maven-plugin)
* [Container Training](https://container.training/)
