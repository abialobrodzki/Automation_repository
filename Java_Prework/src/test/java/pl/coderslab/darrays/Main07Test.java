package pl.coderslab.darrays;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class Main07Test {

    private static final String EXPECTED_OUTPUT = "56,09";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main07.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_avgValueRounded() {
        assertThat(output).contains(EXPECTED_OUTPUT);
    }
}
