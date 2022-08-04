package com.courses.services;
import java.util.List;

import com.courses.entity.*;
public interface CourseService {
      public List<Course> courses();
      public Course course(int id);
      public Course put (Course o);
      public void delete (int id);
      
}
