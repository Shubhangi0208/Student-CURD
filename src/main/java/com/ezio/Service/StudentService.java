package com.ezio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezio.Entity.Student;
import com.ezio.Respository.StudentRespository;

@Service
public class StudentService {

	@Autowired
	private StudentRespository res;
	
	public void returnstud(Student s)
	{
		res.save(s);
	}
	public List<Student> getStud()
	{
		return res.findAll();
	}
	public Student updatestu(Long id)
	{
		return res.findById(id).get();
	}
	public Student delstu(Long id)
	{
		res.deleteById(id);
		return null;
		
	}
	public void upstu(Student s)
	{
		res.save(s);
	}
			
}
