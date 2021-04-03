package com.example.testjpa.reposity;

import com.example.testjpa.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserReposity extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    @Query("select a from User a where a.id = 1")
    List<User>selectById(int id);
}
