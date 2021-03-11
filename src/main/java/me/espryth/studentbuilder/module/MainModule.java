package me.espryth.studentbuilder.module;

import me.espryth.studentbuilder.course.SimpleCourse;
import me.espryth.studentbuilder.student.SimpleStudent;
import me.espryth.studentbuilder.student.Student;

import java.util.Arrays;
import java.util.Scanner;

public class MainModule implements Module {

    @Override
    public void send() {

        SimpleStudent.Builder  studentBuilder = new SimpleStudent.Builder();

        Scanner input = new Scanner(System.in);

        System.out.println("Dame el nombre del estudiante");
        studentBuilder.setName(input.next());

        System.out.println("Quieres agregar una nueva materia?");

        boolean wantAddCourse = input.nextBoolean();

        while(wantAddCourse) {

            SimpleCourse.Builder courseBuilder = new SimpleCourse.Builder();

            System.out.println("Dame el del curso");
            courseBuilder.setName(input.next());

            System.out.println("Dame su calificacion del estudiante en ese curso");
            courseBuilder.setScore(input.nextInt());

            studentBuilder.addCourse(courseBuilder.build());

            System.out.println("Quieres agregar una nueva materia?");

            wantAddCourse = input.nextBoolean();

        }

        Student student = studentBuilder.build();


        Arrays.asList(

                "Estudiante: " + student.getName(),
                "Id: " + student.getId().toString(),
                "Cursos:"

        ).forEach(System.out::println);

        student.getCourses().forEach(course -> {
            System.out.println(" " + "Nombre: " + course.getName());
            System.out.println(" " + "Califcacion: " + course.getScore());
            System.out.println(" ");
        });

    }

}
