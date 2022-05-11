package pl.coderslab.cflowcontrol;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class Main05Test {

    private static final String EXPECTED_OUTPUT = "55" + System.lineSeparator() +
            "55";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main05.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_ReturnResult() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }
}
