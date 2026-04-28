package com.codewithme.tpspringboot.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.codewithme.tpspringboot.entities.Course;
public interface CourseRepository extends JpaRepository<Course , Long>{
}
