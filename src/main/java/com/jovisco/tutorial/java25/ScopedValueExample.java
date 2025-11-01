package com.jovisco.tutorial.java25;

public class ScopedValueExample {

    private static final ScopedValue<String> USER_NAME = ScopedValue.newInstance();
    private static final ScopedValue<String> TRANSACTION_ID = ScopedValue.newInstance();

    void main() {
        new ScopedValueExample().doSomething();
    }

    public void doSomething() {

        ScopedValue
                .where(USER_NAME, "joheiss")
                .where(TRANSACTION_ID, "4711")
                .run(() -> {
                    processTask();
                    IO.println("Task has been executed successfully");
                });
    }

    private void processTask() {
        IO.println("Processing task for: " + USER_NAME.get());
        performTransaction();
    }

    private void performTransaction() {
        IO.println("Performing transaction " + TRANSACTION_ID.get() + " for user " + USER_NAME.get());
    }
}
