package com.timemanagement.activitymanagment.repository;

import com.timemanagement.activitymanagment.entities.Status;
import com.timemanagement.activitymanagment.entities.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepo;
    Task task = new Task();
    @Test
    void anything() {
        task.setName("Read Agile");
        task.setId(1);
        task.setDescription("Should complete week one of Agile principles and methodology");
        task.setStatus(Status.DONE);

        taskRepo.save(task);
    }
    @Test
    void produceTaskClass(){

        Optional<Task> OptionalTask= taskRepo.findById(1);

        Task task = OptionalTask.get();

        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task);
        System.out.println(task.getStatus());
    }


}