package me.espryth.studentbuilder.student;

import me.espryth.studentbuilder.builder.IBuilder;
import me.espryth.studentbuilder.course.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SimpleStudent implements Student {

    private final String name;
    private final UUID id;
    private final List<Course> courses;

    public SimpleStudent(String name, List<Course> courses) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.courses = courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    public static class Builder implements IBuilder<Student> {

        private String name;
        private List<Course> courses;

        public Builder() {
            this.courses = new ArrayList<>();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder addCourse(Course course) {
            this.courses.add(course);
            return this;
        }

        @Override
        public Student build() {
            return new SimpleStudent(name, courses);
        }
    }
}
