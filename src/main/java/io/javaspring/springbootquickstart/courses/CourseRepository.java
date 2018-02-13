package io.javaspring.springbootquickstart.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robin on 2/11/18.
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId); //method declaration, Figures out functionality based on name

}
