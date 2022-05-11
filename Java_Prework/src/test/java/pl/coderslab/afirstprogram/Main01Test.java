package pl.coderslab.afirstprogram;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.*;

public class Main01Test {

    private static final String EXPECTED_OUTPUT = "Hello world";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main01.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_printHelloWorld() {
      assertThat(output.trim()).contains(EXPECTED_OUTPUT);
    }
}
