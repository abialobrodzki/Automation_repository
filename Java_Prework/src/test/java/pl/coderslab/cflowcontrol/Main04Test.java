package pl.coderslab.cflowcontrol;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class Main04Test {

    private static final String EXPECTED_OUTPUT = "1 2 3 4 5 6 7 8 9 10 " + System.lineSeparator() +
            "1 2 3 4 5 6 7 8 9 10";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main04.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_20DigitsIn2Rows() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }
}
