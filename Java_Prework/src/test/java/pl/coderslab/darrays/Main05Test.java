package pl.coderslab.darrays;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.coderslab.utils.LmsAssertions;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main05Test {

    private static final Logger log = LoggerFactory.getLogger(Main05Test.class);
    private static final String MIN_VALUE_ELEMENT = "-69";


    private String output;
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main05.class;
    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() throws Exception {
        Main05.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_sumEvenElements() {
        assertThat(output.trim()).contains(MIN_VALUE_ELEMENT);
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        LmsAssertions.assertThat(compilationUnit).methodMainContainsVariable("numbers", "int[]");
    }

}
