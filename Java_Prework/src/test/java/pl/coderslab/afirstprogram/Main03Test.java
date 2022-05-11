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
import pl.coderslab.cflowcontrol.Main02Test;
import pl.coderslab.utils.LmsAssertions;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main03Test {

    private static final Logger log = LoggerFactory.getLogger(Main02Test.class);
    private static final String EXPECTED_OUTPUT = "Today I am starting" + System.lineSeparator() +
            "TESTER course" + System.lineSeparator() +
            "in CodersLab";

    private static CompilationUnit compilationUnit;
    private static Class clazz = Main03.class;
    private String output;

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main03.main(null);
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
