package ru.easydonate.easydonate4j.testing.api.v3;

import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("EasyDonate4J Testing Framework")
@SelectPackages("ru.easydonate.easydonate4j.testing.api.v3")
@IncludePackages({
        "ru.easydonate.easydonate4j.testing.api.v3.http.client",
        "ru.easydonate.easydonate4j.testing.api.v3.json.serialization"
})
public final class TestingFrameworkSuite {

}
