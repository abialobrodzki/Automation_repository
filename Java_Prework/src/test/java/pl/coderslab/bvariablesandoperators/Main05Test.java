package pl.coderslab.bvariablesandoperators;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import pl.coderslab.bvariablesandoperators.Main05;

import java.io.IOException;

import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main05Test {

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main05.class;
    private String output;
    private static final String EXPECTED_OUTPUT = "true";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp() {
        Main05.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void givenExercise_shouldContainNr11Variable_withDoubleType() {
        assertThat(compilationUnit).methodMainContainsVariable("nr1", "double");
    }
    @Test
    public void givenExercise_shouldContainNr2Variable_withFloatType() {
        assertThat(compilationUnit).methodMainContainsVariable("nr2", "float");
    }
    @Test
    public void givenExercise_shouldContainResultVariable_withBooleanType() {
        assertThat(compilationUnit).methodMainContainsVariable("result", "boolean");
    }
    @Test
    public void givenExercise_shouldContainResultVariable_withBooleanTypeAndCompareVariables() {
        assertThat(compilationUnit).methodMainContainsVariableInitializedBy("result", "boolean", "nr1>nr2");
    }

    @Test
    public void whenRun_thenSystemOut_avgValueRounded() {
        Assertions.assertThat(output).contains(EXPECTED_OUTPUT);
    }

}
