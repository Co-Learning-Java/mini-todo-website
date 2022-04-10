package com.timemanagement.activitymanagment.repository;

import com.timemanagement.activitymanagment.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {


}
