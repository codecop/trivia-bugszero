package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;

/**
 * Created by bastien on 16/03/2017.
 */
public class Questions {

    private LinkedList<Question> questions = new LinkedList();
    private String category;

    public Questions(String category) {
        this.category = category;

        for (int i = 0; i < 50; i++) {
            questions.addLast(new Question(category, i));
        }
    }

    public Question next() {
        return questions.removeFirst();
    }
}
