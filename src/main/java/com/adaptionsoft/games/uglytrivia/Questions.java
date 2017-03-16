package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by bastien on 16/03/2017.
 */
public class Questions {

    private LinkedList<Question> questions = new LinkedList();

    public Questions() {
        for (Category category : Category.values()) {
            for (int i = 0; i < 50; i++) {
                questions.addLast(new Question(category, i));
            }
        }
    }

    public Question next(Category category) {
        for (Question question : questions) {
            if (question.category() == category) {
                questions.remove(question);
                return question;
            }
        }
        throw new NoSuchElementException(category.toString());
    }
}
