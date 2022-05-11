package pl.coderslab.cflowcontrol;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class Main02Test {

    private static final Logger log = LoggerFactory.getLogger(Main02Test.class);
    private static final String EXPECTED_OUTPUT = "11";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main02.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_biggestValue() {
        assertEquals(EXPECTED_OUTPUT, output.replaceAll("[^\\d.-]", "").trim());
    }
}
