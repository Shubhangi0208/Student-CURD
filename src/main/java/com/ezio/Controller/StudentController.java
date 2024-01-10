package com.ezio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ezio.Entity.Student;
import com.ezio.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ser;

	@PostMapping("/save-student")

	public String save(@RequestBody  Student s)

	{
		System.out.println("The value of s is:"+s);
		ser.returnstud(s);
		return "Save";
	}
	@GetMapping("/get-student")
	public List<Student> getStu()
	{
		return ser.getStud();
	}
	@GetMapping("/Findbyid-student/{id}")
	public Student updatestu(@PathVariable("id")Long id)
	{
		return ser.updatestu(id);
	}
	@DeleteMapping("/delete-student/{id}")
	public Student delstu(@PathVariable("id")Long id)
	{
		return ser.delstu(id);
	}
	@PutMapping("/update-student")
	public String upstu(@RequestBody  Student s)

	{
		ser.upstu(s);
		return "Save";
	}
	
}
