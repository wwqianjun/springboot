# springboot
In Spring Boot, to create a non-web application, implements CommandLineRunner and override the run method, for 
```java
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringBootConsoleApplication.class, args);

    }

    //access command line arguments
    @Override
    public void run(String... args) throws Exception {

        //do something

    }
}
```

#### MySQL + Druid example

Database Connection Pooling
Spring Boot uses Tomcat pooling tomcat-jdbc by default, and follow this sequence to find the connection pool :
```
Tomcat pool -->> - HikariCP -->>  Commons DBCP -->>  Commons DBCP2
```
Read this official Spring Boot doc – Connection to a production database
