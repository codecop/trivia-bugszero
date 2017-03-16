package com.adaptionsoft.games.uglytrivia;

public class Question {
    private final String category;
    private final int number;

    public Question(String category, int number) {
        this.category = category;
        this.number = number;
    }

    @Override
    public String toString() {
        return category + " Question " + number;
    }
}
