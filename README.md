### Udemy Spring Especialista
Project based on course: \
[www.udemy.com](https://www.udemy.com/share/102JK83@PC72nb8818rzCuyfbmhCgY1e7_EpiC3NaGzwqWQjoDrihv32DgbVE4pREGexsoCi/) \
Oficial lesson's repository: \
https://github.com/cursodsousa/curso-spring-boot-especialista \
Oficial lesson's documentation \
[https://whimsical.com/curso-sboot-expert](https://whimsical.com/curso-sboot-expert-CKxrH3Bcd65xsfS6TibJqX)

Pre-requisites:
- JDK 21
- IntelliJ Community
- Postman
- Docker

Spring Start configuration
![sprinStartConfiuration.png](docs/sprinStartConfiuration.png)

Docker configuration \
Using <u>podman</u> to create and mount a container with postgres database.
```bash
    podman run -d \
      --name my-postgres-db \
      -p 5432:5432 \
      -e POSTGRES_DB=springjpaudemy \
      -e POSTGRES_USER=myuser \
      -e POSTGRES_PASSWORD=mypassword \
      postgres:latest
```
Alternatively it is possible create and run another container with a database client. \
To connect both containers it is necessary a network. \
Using <u>podman</u> to setting this structure.
```bash
    podman network create database_network
```
There is two ways to connect both containers with this network.
1. Add the parameter in container creation
    ```
        --network database_network
    ```
2. Run a podman command
    ```bash
        podman network connect database_network my-postgres-db
    ```
    Run the `connect` command again with the <u>database client</u> container name.

> **NOTE:**
> To see all created databases can be run this command in database client
> `SELECT datname FROM pg_database WHERE datistemplate = FALSE;`
