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