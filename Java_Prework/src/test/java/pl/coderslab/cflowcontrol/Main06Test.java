package pl.coderslab.cflowcontrol;

import com.google.common.base.CharMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Main06Test {

    private static final String EXPECTED_OUTPUT = "0 - even" + System.lineSeparator() +
            "1 - odd" + System.lineSeparator() +
            "2 - even" + System.lineSeparator() +
            "3 - odd" + System.lineSeparator() +
            "4 - even" + System.lineSeparator() +
            "5 - odd" + System.lineSeparator() +
            "6 - even" + System.lineSeparator() +
            "0 - even" + System.lineSeparator() +
            "1 - odd" + System.lineSeparator() +
            "2 - even" + System.lineSeparator() +
            "3 - odd" + System.lineSeparator() +
            "4 - even" + System.lineSeparator() +
            "5 - odd" + System.lineSeparator() +
            "6 - even";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main06.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_OddEvenMessage() {
        assertThat(CharMatcher.whitespace().removeFrom(output), containsString(
                CharMatcher.whitespace().removeFrom(EXPECTED_OUTPUT)));
    }
}
