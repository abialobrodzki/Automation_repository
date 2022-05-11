package pl.coderslab.afirstprogram;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class Main04Test {

    private static final String EXPECTED_OUTPUT =
               "J    a   v     v  a " + System.lineSeparator() +
            "   J   a a   v   v  a a" + System.lineSeparator() +
            "J  J  aaaaa   V V  aaaaa" + System.lineSeparator() +
            " JJ  a     a   V  a     a";


    private String output;


    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main04.main(null);
        output = systemOutRule.getLog();
    }


    @Test
    public void whenRun_thenSystemOut_printJava() {
      assertThat(output.trim()).contains(EXPECTED_OUTPUT);
    }
}
