package pl.coderslab.darrays;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main02Test {

    private static final String FIRST_ELEMENT = "apple";
    private static final String LAST_ELEMENT = "berry";
    private static final String ALL_ELEMENTS = "applebananaberry";

    private String[] lines;
    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main02.class;
    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp(){
        Main02.main(null);
        output = systemOutRule.getLog();
        lines = output.split("\\r?\\n");
    }

    @Test
    public void whenRun_thenSystemOut_firstElement() {
        assertEquals(FIRST_ELEMENT, lines[0]);
    }

    @Test
    public void whenRun_thenSystemOut_lastElement() {
        assertEquals(LAST_ELEMENT, lines[1]);
    }

    @Test
    public void whenRun_thenSystemOut_allElements() {
       String collect = Arrays.stream(lines).skip(2).collect(Collectors.joining("")).replaceAll("\\s+","");
        assertEquals(ALL_ELEMENTS, collect);
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        assertThat(compilationUnit).methodMainContainsVariable("fruits", "String[]");
    }
}
