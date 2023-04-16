package com.genspark.SpringBootProject2.Service;

import com.genspark.SpringBootProject2.Dao.AssignmentDao;
import com.genspark.SpringBootProject2.Entity.Assignment;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServiceImpl implements AssignmentService
{
	@Autowired
	private AssignmentDao assignmentDao;


	@Override
	public List<Assignment> getAllAssignments()
	{
		return this.assignmentDao.findAll();
	}

	@Override
	public Assignment getAssignmentById(int id)
	{
		Optional<Assignment> a = this.assignmentDao.findById(id);
		Assignment assignment = null;
		if(a.isPresent())
		{
			assignment = a.get();
		}
		else
		{
			throw new RuntimeException("Assignment not found for id :: " + id);
		}
		return assignment;
	}

	@Override
	public Assignment addAssignment(Assignment assignment)
	{
		return this.assignmentDao.save(assignment);
	}

	@Override
	public Assignment updateAssignment(Assignment assignment)
	{
		return this.assignmentDao.save(assignment);
	}

	@Override
	public String deleteAssignment(int id)
	{
		this.assignmentDao.deleteById(id);
		return "Deleted";
	}
}
