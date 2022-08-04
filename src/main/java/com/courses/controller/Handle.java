package com.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.entity.Course;
import com.courses.services.CourseService;
import com.courses.services.Serviceimp;

@RestController
public class Handle {
    
	@Autowired
	public CourseService srv;
	
	
	@GetMapping("/courses")
	public List<Course>  courses()
	{
	 //  srv = new Serviceimp();
		return srv.courses();
	}
	@GetMapping("/course/{id}")
	public Course  course(@PathVariable String id)
	{
	 //   srv = new Serviceimp();
		return srv.course(Integer.parseInt(id));
	}
	@PostMapping("/addC")
	public Course putCourse(@RequestBody Course o)
	{
	   return srv.put(o);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) 
	{
		 srv.delete(Integer.parseInt(id));
	}
	
}
