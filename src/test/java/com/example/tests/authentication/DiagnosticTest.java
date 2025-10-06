package com.example.tests.authentication;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DiagnosticTest {

    @BeforeSuite
    public void beforeSuite(ITestContext context) {
        System.out.println("=== DIAGNOSTIC INFORMATION ===");
        System.out.println("Suite Name: " + context.getSuite().getName());
        System.out.println("Test Name: " + context.getCurrentXmlTest().getName());
        System.out.println("Included Groups: " + java.util.Arrays.toString(context.getIncludedGroups()));
        System.out.println("Excluded Groups: " + java.util.Arrays.toString(context.getExcludedGroups()));
        System.out.println("=== END DIAGNOSTIC ===");
    }

    @Test(groups = {"regression"})
    public void regressionTest() {
        System.out.println("REGRESSION TEST - SHOULD RUN");
    }

    @Test(groups = {"sanity"})
    public void sanityTest() {
        System.out.println("SANITY TEST - SHOULD NOT RUN");
    }

    @Test
    public void noGroupTest() {
        System.out.println("NO GROUP TEST - SHOULD NOT RUN");
    }
}