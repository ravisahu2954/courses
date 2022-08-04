package com.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entity.Course;


public interface CourseDao extends JpaRepository<Course ,Integer>{

}
