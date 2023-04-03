package com.example.testing_with_mockito;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class mockitojunitRunner extends Runner {
    @Override
    public Description getDescription() {
        return null;
    }

    @Override
    public void run(RunNotifier notifier) {

    }
}
