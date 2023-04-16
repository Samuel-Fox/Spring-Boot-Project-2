package com.genspark.SpringBootProject2.Dao;

import com.genspark.SpringBootProject2.Entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentDao extends JpaRepository<Assignment, Integer>
{
}
