package dev.akinaksoy.cruddemo;

import dev.akinaksoy.cruddemo.dao.StudentDAO;
import dev.akinaksoy.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

        return runner -> {
            //createStudent(studentDAO);

            //createMultipleStudents(studentDAO);

            readStudent(studentDAO);




        };
    }

    private void readStudent(StudentDAO studentDAO) {

        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Duffy", "Duck", "dd@mail.com");

        System.out.println("Savin the student...");
        studentDAO.save(tempStudent);

        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);

        System.out.println("Retrieving student with id: " + theId);
        Student myStudent = studentDAO.findById(theId);

        System.out.println("Found the student: " + myStudent);

    }

    private void createMultipleStudents(StudentDAO studentDAO) {

        System.out.println("Creating 3 student object....");
        Student tempStudent1 = new Student("John","Hikmet","john@mail.com");
        Student tempStudent2 = new Student("Mary","Yilmaz","mary@mail.com");
        Student tempStudent3 = new Student("Fikret","Okatar","fiko@mail.com");


        System.out.println("Saving the 3 students....");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO) {

        System.out.println("Creating new student object....");
        Student tempStudent = new Student("Paul","Doe","paul@mail.com");

        studentDAO.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());

    }

}
