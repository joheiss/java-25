package com.jovisco.tutorial.java25;

public class Patterns {

    void main() {
        var a = Integer.MAX_VALUE;
        IO.println(Patterns.what(a));
        var b = Long.MAX_VALUE;
        IO.println(Patterns.what(b));
        long c = 1;
        IO.println(Patterns.what(c));
        var d = "A horse is a horse, is a horse ...";
        IO.println(Patterns.what(d));
        var e = true;
        IO.println(Patterns.what(e));
    }

    public static Object what(Object that) {
        return switch (that) {
            case Integer i -> "Integer";
            case Long l -> "Long";
            case String s -> "String";
            default -> "Something else";
        };
    }
}
