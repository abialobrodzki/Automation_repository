package pl.coderslab.utils;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public final class LmsTestWatcher extends TestWatcher {



    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println("IT FAILED");
    }

    @Override
    protected void succeeded(Description description) {
        System.out.println("IT PASSED");
    }
}