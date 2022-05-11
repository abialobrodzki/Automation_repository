package pl.coderslab.utils;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.google.common.base.CharMatcher;
import org.assertj.core.api.AbstractAssert;

public class LmsAssert extends AbstractAssert<LmsAssert, CompilationUnit> {

    public LmsAssert(CompilationUnit actual) {
        super(actual, LmsAssert.class);
    }

    private static final String MAIN_NAME = "main";

    public static LmsAssert assertThat(CompilationUnit actual) {
        return new LmsAssert(actual);
    }

    /**
     * @param methodMame
     * @return
     */
    public LmsAssert hasMethod(String methodMame) {
        isNotNull();

        actual.findFirst(MethodDeclaration.class, m -> m.getName().asString().equals(methodMame))
                .ifPresentOrElse(m -> {
                        },
                        () -> failWithMessage("Expected class to have method name %s but was method not exist.",
                                methodMame));

        return this;
    }

    public LmsAssert methodMainContainsVariable(String variableName, String type) {
        isNotNull();
        hasMethod(MAIN_NAME);
        actual.findFirst(MethodDeclaration.class, m -> m.getName().asString().equals(MAIN_NAME))
                .get().getBody().get().findFirst(VariableDeclarator.class, v ->
                v.getName().asString().equals(variableName) &&
                        v.getType().asString().equals(type)
        )
                .ifPresentOrElse(v -> {
                        },
                        () -> failWithMessage("Expected main method contains variable %s with type %s but not found.",
                                variableName, type));

        return this;
    }

    /**
     * @param variableName
     * @param type
     * @param initializer
     * @return
     */
    public LmsAssert methodMainContainsVariableInitializedBy(String variableName, String type, String initializer) {
        isNotNull();
        hasMethod(MAIN_NAME);
        methodMainContainsVariable(variableName, type);
        actual.findFirst(MethodDeclaration.class, m -> m.getName().asString().equals(MAIN_NAME))
                .flatMap(m -> m.getBody())
                .flatMap(b -> b.findFirst(VariableDeclarator.class, v ->
                        v.getName().asString().equals(variableName) &&
                                v.getType().asString().equals(type)))
                .flatMap(i -> i.getInitializer())
                .filter(expression ->
                        CharMatcher.whitespace().removeFrom(expression.toString()
                        ).contains(initializer)
                )
                .ifPresentOrElse(iv -> {
                        },
                        () -> failWithMessage("Expected main method contains variable %s " +
                                        "with type %s initialized by %s but not found.",
                                variableName, type, initializer));
        return this;
    }

}
