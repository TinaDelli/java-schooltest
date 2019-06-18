package com.lambdaschool.school.repository;

import com.lambdaschool.school.model.Instructor;
import io.swagger.models.auth.In;
import org.springframework.data.repository.CrudRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface InstructorRepository extends CrudRepository<Instructor, Long>
{
    ArrayList<Instructor> findInstructorsByInstructnameEquals (String name);

    Instructor findByInstructid(long id);

    Instructor findByInstructname(String name);
}
