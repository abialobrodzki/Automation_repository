package pl.coderslab.bvariablesandoperators;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import pl.coderslab.bvariablesandoperators.Main04;

import java.io.IOException;

import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main04Test {

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main04.class;
    private String output;
    private static final String EXPECTED_OUTPUT = "Java Course";

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Before
    public void setUp() {
        Main04.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void givenExercise_shouldContainStr1Variable_withStringType() {
        assertThat(compilationUnit).methodMainContainsVariable("str1", "String");
    }
    @Test
    public void givenExercise_shouldContainStr2Variable_withStringType() {
        assertThat(compilationUnit).methodMainContainsVariable("str2", "String");
    }
    @Test
    public void givenExercise_shouldContainJoinedStringsVariable_withStringType() {
        assertThat(compilationUnit).methodMainContainsVariable("joinedStrings", "String");
    }
    @Test
    public void givenExercise_shouldContainResultVariable_withStringTypeAndJoinedString() {
        assertThat(compilationUnit).methodMainContainsVariableInitializedBy("joinedStrings", "String", "str1+\"\"+str2");
    }

    @Test
    public void whenRun_thenSystemOut_resultContainExpected() {
        Assertions.assertThat(output).contains(EXPECTED_OUTPUT);
    }

}
