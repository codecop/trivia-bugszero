package com.adaptionsoft.games.uglytrivia;

public class Question {
    private final Category category;
    private final int number;

    public Question(Category category, int number) {
        this.category = category;
        this.number = number;
    }

    @Override
    public String toString() {
        return category.toString() + " Question " + number;
    }

    public Category category() {
        return category;
    }
}
