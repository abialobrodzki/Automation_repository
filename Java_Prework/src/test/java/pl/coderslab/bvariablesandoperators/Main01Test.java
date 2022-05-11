package pl.coderslab.bvariablesandoperators;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static pl.coderslab.utils.LmsAssertions.assertThat;
import static pl.coderslab.utils.LmsAssertions.convertClassToJavaFilePath;

public class Main01Test {
    private static CompilationUnit compilationUnit;
    private static Class clazz = Main01.class;

    @BeforeClass
    public static void before() throws IOException {
        compilationUnit = StaticJavaParser.parse(convertClassToJavaFilePath(clazz));
    }

    @Test
    public void givenExercise_shouldContainInt1Variable_withIntType() {
        assertThat(compilationUnit).methodMainContainsVariable("int1", "int");
    }
    @Test
    public void givenExercise_shouldContainChar2Variable_withCharType() {
        assertThat(compilationUnit).methodMainContainsVariable("char2", "char");
    }
    @Test
    public void givenExercise_shouldContainLong3Variable_withLongType() {
        assertThat(compilationUnit).methodMainContainsVariable("long3", "long");
    }
    @Test
    public void givenExercise_shouldContainDouble3Variable_withDoubleType() {
        assertThat(compilationUnit).methodMainContainsVariable("double4", "double");
    }
    @Test
    public void givenExercise_shouldContainBoolean5Variable_withBooleanType() {
        assertThat(compilationUnit).methodMainContainsVariable("boolean5", "boolean");
    }

}
