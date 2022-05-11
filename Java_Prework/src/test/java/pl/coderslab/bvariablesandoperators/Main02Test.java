package pl.coderslab.bvariablesandoperators;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.IOException;

import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main02Test {
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main02.class;
    private String output;
    private static final String EXPECTED_OUTPUT = "351";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp() {
        Main02.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void givenExercise_shouldContainNr1Variable_withByteType() {
        assertThat(compilationUnit).methodMainContainsVariable("nr1", "byte");
    }
    @Test
    public void givenExercise_shouldContainNr2Variable_withShortType() {
        assertThat(compilationUnit).methodMainContainsVariable("nr2", "short");
    }
    @Test
    public void givenExercise_shouldContainResultVariable_withIntType() {
        assertThat(compilationUnit).methodMainContainsVariable("result", "int");
    }
    @Test
    public void givenExercise_shouldContainResultVariable_withIntTypeAndSumPrevious() {
        assertThat(compilationUnit).methodMainContainsVariableInitializedBy("result", "int", "nr1+nr2");
    }

    @Test
    public void whenRun_thenSystemOut_avgValueRounded() {
        Assertions.assertThat(output).contains(EXPECTED_OUTPUT);
    }


}
