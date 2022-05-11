package pl.coderslab.utils;


import com.github.javaparser.ast.CompilationUnit;

import java.nio.file.Path;
import java.nio.file.Paths;

public class LmsAssertions {


    public static LmsAssert assertThat(CompilationUnit actual) {
        return new LmsAssert(actual);
    }

    /**
     * The package separator character: {@code '.'}.
     */
    private static final String PACKAGE_SEPARATOR = ".";

    /**
     * The path separator character: {@code '/'}.
     */
    private static final String PATH_SEPARATOR = System.getProperty("file.separator");

    public static Path convertClassToJavaFilePath(Class clazz) {
        String java = String.join(".", clazz.getName().replace(PACKAGE_SEPARATOR, PATH_SEPARATOR), "java");
        return Paths.get(System.getProperty("user.dir"), "src", "main", "java", java);

    }


}

