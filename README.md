# Quarkus Sandbox
Playground for Quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

# Prerequisites

**Java JDK:** Required min version: JDK 17+ installed with JAVA_HOME configured appropriately. Tested with:
* Open JDK version 21
* Azul Zulu version 21

**Maven**: Tested with Apache Maven 3.9.9

**PostgreSql:**: Optional, can be started with docker-compose. Tested with PostgreSql 17+

**Docker**: Tested with Docker version 27.3.1

**Docker-Compose**: Tested with Docker Compose version v2.30.3

# Getting Started
## Database
From /quarkus-sandbox/scripts run:
```shell script
docker-compose up -d
```
Postgres DB connection available on port 5434 so that it does not conflict with an eventual local postgres instance running on the default 5432.
```shell script
jdbc:postgresql://localhost:5434/sandbox
```

PgAdmin access from localhost: http://localhost:8034/browser/
Create new server connection to (notice docker network host 'db' and port '5432' because PgAdmin runs within the docker network):
```shell script
host: db
port: 5432
user: testuser
pass: testuser
```

## Running the application in dev mode

Start the database (either local installation or using ~/.../quarkus-sandbox/scripts/**docker-compose up -d**)

You can run your application in dev mode that enables live coding using: 
```shell script
./mvnw quarkus:dev
```

Test localhost access:
```shell script
curl -w "\n" http://localhost:8090/hello
"Hello from Quarkus REST 'HelloResource':  \__(o-o)__/"
```
> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8090/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-sandbox-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- REST ([guide](https://quarkus.io/guides/rest)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
