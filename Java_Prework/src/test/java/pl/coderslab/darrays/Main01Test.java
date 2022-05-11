package pl.coderslab.darrays;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main01Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private static final String EXPECTED_OUTPUT = "3 4 5";
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main01.class;
    private String output;

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp() {
        Main01.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_threeElement() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        assertThat(compilationUnit).methodMainContainsVariable("threeElements", "int[]");
    }
}
