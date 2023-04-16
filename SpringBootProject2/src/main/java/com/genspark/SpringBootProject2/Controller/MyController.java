package com.genspark.SpringBootProject2.Controller;

import com.genspark.SpringBootProject2.Entity.Assignment;
import com.genspark.SpringBootProject2.Service.AssignmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@Autowired
	private AssignmentService assignmentService;
	@GetMapping("/")
	public String home()
	{
		return "<HTML><H1>WELCOME</H1></HTML>";
	}

	@GetMapping("/assignments")
	public List<Assignment> getAssignments()
	{
		return this.assignmentService.getAllAssignments();
	}

	@GetMapping("/assignments/{id}")
	public Assignment getAssignment(@PathVariable String id)
	{
		return this.assignmentService.getAssignmentById(Integer.parseInt(id));
	}

	@PostMapping("/assignments")
	public Assignment addAssignment(@RequestBody Assignment assignment)
	{
		return this.assignmentService.addAssignment(assignment);
	}

	@PutMapping("/assignments")
	public Assignment updateAssignment(@RequestBody Assignment assignment)
	{
		return this.assignmentService.updateAssignment(assignment);
	}

	@DeleteMapping("/assignments/{id}")
	public String deleteAssignment(@PathVariable String id)
	{
		return this.assignmentService.deleteAssignment(Integer.parseInt(id));
	}
}
