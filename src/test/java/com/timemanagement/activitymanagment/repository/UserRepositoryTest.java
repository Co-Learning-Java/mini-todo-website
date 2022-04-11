package com.timemanagement.activitymanagment.repository;

import com.timemanagement.activitymanagment.entities.Task;
import com.timemanagement.activitymanagment.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class UserRepositoryTest {

    @Autowired
    UserRepository userRepo;
    @Autowired
    TaskRepository taskRepo;

    @Test
    void shouldCreateAUser(){
        Task task = taskRepo.findById(3).get();

        User user = userRepo.findById(1).get();
        user.getTasks().add(task);

        userRepo.save(user);



//        User user1 = userRepo.findById(1).get();

//        Assertions.assertEquals(user,user1);


    }

    @Test
    void remove(){
        userRepo.deleteById(2);
    }

    @Test
    void shouldGetAUsersTask(){
        User user = userRepo.findById(1).get();
        List<Task> userTask = user.getTasks();
        System.out.println(userTask);


        for(int i = 0; i < userTask.size(); i++){

            if(userTask.get(i).getId()== 3){
                userTask.remove(i);
            }
        }

        user.setTasks(userTask);
        userRepo.save(user);

    }




}