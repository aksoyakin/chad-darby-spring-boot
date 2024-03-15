package dev.akinaksoy.cruddemo.dao;

import dev.akinaksoy.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
