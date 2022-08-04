package com.courses.services;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.dao.CourseDao;
import com.courses.entity.Course;

@Service
public class Serviceimp implements CourseService {
	
	//  List<Course> list;
	  @Autowired
      public CourseDao cd;
	 public Serviceimp() {
	 /*	 list = new ArrayList<>();
		list.add(new Course(1,"JAVA",1500));
		list.add(new Course(2, "C++" ,1200));*/
	 }
	public List<Course> courses()
	 {
		return cd.findAll();
		
	//	 return list;
	 }
     public Course course(int id)
     {
    /*	 for(Course o : list)
    	 {
    		  if(o.id == id)
    			   return o;
    	 }
    	 return null;*/
    	return cd.findById(id).get();
     }
     public Course put (Course o)
     {
    	/* list.add(o);
    	 return o;*/
    	return cd.save(o);
     }
     public void delete (int id)
     {
    	/* for(Course o : list)
    	 {
    		  if(o.id == id)
    		  {
    			 
    			   list.remove(o);
    			   return o;
    		  }
    	 }
    	 return null;*/
    	 Course o = cd.findById(id).get();
    	 cd.delete(o);
     }
}
