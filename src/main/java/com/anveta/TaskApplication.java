package com.anveta;

import com.anveta.service.TaskService;
import com.anveta.domain.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {

            taskService.save(new Task(1L, "create SpringBootApplication", LocalDate.now(), true));
            taskService.save(new Task(4L, "create SpringBootApplication", LocalDate.now(), true));
            taskService.save(new Task(2L, "create SpringBootPackages", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(3L, "create SpringBootStructure", LocalDate.now(), true));


        };
    }
}