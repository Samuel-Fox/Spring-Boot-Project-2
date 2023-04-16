package com.genspark.SpringBootProject2.Service;

import com.genspark.SpringBootProject2.Entity.Assignment;
import java.util.List;

public interface AssignmentService
{
	List<Assignment> getAllAssignments();
	Assignment getAssignmentById(int id);
	Assignment addAssignment(Assignment assignment);
	Assignment updateAssignment(Assignment assignment);
	String deleteAssignment(int id);
}
