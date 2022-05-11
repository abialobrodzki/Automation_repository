package pl.coderslab.cflowcontrol;

import com.google.common.base.CharMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Main07Test {

    private static final String EXPECTED_OUTPUT ="i=0j=0" +
            "i=0j=1" +
            "i=0j=2" +
            "i=1j=0" +
            "i=1j=1" +
            "i=1j=2" +
            "i=2j=0" +
            "i=2j=1" +
            "i=2j=2";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule =new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main07.main(null);
        output =systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_IandJ() {
        assertThat(CharMatcher.whitespace().removeFrom(output), containsString(
                CharMatcher.whitespace().removeFrom(EXPECTED_OUTPUT)));

    }
}
