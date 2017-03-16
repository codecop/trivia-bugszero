package com.adaptionsoft.games.uglytrivia;

public class Question {
    private final Category category;
    private final String question;

    public Question(Category category, String question) {
        this.category = category;
        this.question = question;
    }

    @Override
    public String toString() {
        return category.toString() + " Question " + question;
    }

    public Category category() {
        return category;
    }
}
