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

public class Main04Test {

    private static final String FIRST_EVEN_ELEMENT = "4";
    private static final String SECOND_EVEN_ELEMENT = "112";
    private static final String SUM_ODD_ELEMENT = "10711";

    private String[] lines;
    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main04.class;
    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp() throws Exception {
        Main04.main(null);
        output = systemOutRule.getLog();
        lines = output.split("\\r?\\n");
    }

    @Test
    public void whenRun_thenSystemOut_firstEvenElement() {
        assertEquals(FIRST_EVEN_ELEMENT, lines[0]);
    }

    @Test
    public void whenRun_thenSystemOut_secondEvenElement() {
        assertEquals(SECOND_EVEN_ELEMENT, lines[1]);
    }

    @Test
    public void whenRun_thenSystemOut_sumEvenElements() {
        assertEquals(SUM_ODD_ELEMENT, lines[2].replaceAll("[^0-9]", "").trim());
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        assertThat(compilationUnit).methodMainContainsVariable("numbers", "int[]");
    }

}
