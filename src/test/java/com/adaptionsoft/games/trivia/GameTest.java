package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.approvaltests.Approvals;
import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.stream.IntStream;

@UseReporter(JunitReporter.class)
public class GameTest {

    @Test
    public void itsLockedDown() throws Exception {
        Random rand = new Random(12344566);
        ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayStream));
        IntStream.range(1, 15).forEach(i -> GameRunner.playGame(rand));
        Approvals.verify(byteArrayStream.toString());
    }
}
