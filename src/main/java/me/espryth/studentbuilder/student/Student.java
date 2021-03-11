package me.espryth.studentbuilder.student;

import me.espryth.studentbuilder.course.Course;

import java.util.List;
import java.util.UUID;

public interface Student {

    String getName();

    UUID getId();

    List<Course> getCourses();

}
