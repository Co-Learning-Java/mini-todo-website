package com.timemanagement.activitymanagment.repository;

import com.timemanagement.activitymanagment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
