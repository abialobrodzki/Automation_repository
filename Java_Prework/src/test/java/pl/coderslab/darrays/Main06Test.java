package pl.coderslab.darrays;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import pl.coderslab.utils.LmsAssertions;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main06Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main06.class;
    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    private static final String EXPECTED_OUTPUT = "-69" + System.lineSeparator() +
            "9999" + System.lineSeparator() +
            "112" + System.lineSeparator() +
            "643" + System.lineSeparator() +
            "4";

    @Test
    public void whenRun_thenSystemOut_arrayFromBack() {
        Main06.main(null);
        assertEquals(EXPECTED_OUTPUT, systemOutRule.getLog().trim());
    }

    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        LmsAssertions.assertThat(compilationUnit).methodMainContainsVariable("numbers", "int[]");
    }
}
