package pl.coderslab.darrays;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;
@Slf4j
public class Main03Test {

    private static final String SUM_ELEMENTS = "10827";
    private String output;

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main03.class;
    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() throws Exception {
        Main03.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_sumElements() {
        output = output.replaceAll("[^0-9]", "");
        assertEquals(SUM_ELEMENTS, output);
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        assertThat(compilationUnit).methodMainContainsVariable("numbers", "int[]");
    }
}
