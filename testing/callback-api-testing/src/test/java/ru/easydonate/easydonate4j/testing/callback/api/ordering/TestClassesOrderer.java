package ru.easydonate.easydonate4j.testing.callback.api.ordering;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.ClassDescriptor;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.ClassOrdererContext;

import java.util.Comparator;

public final class TestClassesOrderer implements ClassOrderer {

    private static final Comparator<ClassDescriptor> COMPARATOR = new TestClassesComparator();

    @Override
    public void orderClasses(@NotNull ClassOrdererContext classOrdererContext) {
        classOrdererContext.getClassDescriptors().sort(COMPARATOR);
    }

}
