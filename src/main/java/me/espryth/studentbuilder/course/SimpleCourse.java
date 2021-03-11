package me.espryth.studentbuilder.course;

import me.espryth.studentbuilder.builder.IBuilder;

public class SimpleCourse implements Course {

    private final String name;
    private final int score;

    public SimpleCourse(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    public static class Builder implements IBuilder<Course> {

        private String name;
        private int score;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setScore(int score) {
            this.score = score;
            return this;
        }

        @Override
        public Course build() {
            return new SimpleCourse(name, score);
        }
    }
}
