package pl.coderslab.cflowcontrol;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class Main01Test {

    private static final String EXPECTED_OUTPUT = "7";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main01.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_biggerValue() {
        assertEquals(EXPECTED_OUTPUT, output.replaceAll("[^\\d.-]", "").trim());
    }
}
