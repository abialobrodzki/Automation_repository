package pl.coderslab.afirstprogram;

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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main02Test {

    private static final String EXPECTED_OUTPUT = "Hello Java" + System.lineSeparator() +
            "Hello Coderslab";

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main02.class;
    private String output;

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // we need to use reflection - in exercise student have to add main method
        Method method = clazz.getMethod("main", String[].class);
        method.invoke(null, new String[1]);
        output = systemOutRule.getLog();
    }

    @Test
    public void givenExercise_shouldContainInt1Variable_withIntType() {
        LmsAssertions.assertThat(compilationUnit).hasMethod("main");
    }


    @Test
    public void whenRun_thenSystemOut_printHelloWorld() {
        assertThat(output.trim()).contains(EXPECTED_OUTPUT);
    }
}
