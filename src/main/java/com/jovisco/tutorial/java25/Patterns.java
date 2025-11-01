package com.jovisco.tutorial.java25;

public class Patterns {

    void main() {
        var a = Integer.MAX_VALUE;
        IO.println(Patterns.what(a));
        IO.println(Patterns.whatIf(a));

        var b = Long.MAX_VALUE;
        IO.println(Patterns.what(b));
        IO.println(Patterns.whatIf(b));

        long c = 1;
        IO.println(Patterns.what(c));
        IO.println(Patterns.whatIf(c));

        var d = "A horse is a horse, is a horse ...";
        IO.println(Patterns.what(d));
        IO.println(Patterns.whatIf(d));

        var e = true;
        IO.println(Patterns.what(e));
        IO.println(Patterns.whatIf(e));
    }

    public static String what(Object that) {
        return switch (that) {
            case Integer i -> "Integer";
            case Long l -> "Long";
            case String s -> "String";
            default -> "Something else";
        };
    }

    public static String whatIf(Object that) {
        if (that instanceof Integer i) {
            return "Integer".toUpperCase();
        }
        if (that instanceof Long l) {
            return "Long".toUpperCase();
        }
        if (that instanceof String s) {
            return "String".toUpperCase();
        }
        if (that instanceof Boolean b) {
            return "Boolean".toUpperCase();
        }
        return "Something else".toUpperCase();
    }
}
