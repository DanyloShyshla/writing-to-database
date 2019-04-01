package ua.lviv.iot.dbsample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DbSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            repository.save(new Student("Andrew", "Petrenko", "2019"));
            repository.save(new Student("Phill", "Mykhailenko", "2019"));
            repository.save(new Student("Someone", "Vidminenko", "2019"));
            repository.findAll().forEach(student -> System.out.println(student));
        };
    }
}
