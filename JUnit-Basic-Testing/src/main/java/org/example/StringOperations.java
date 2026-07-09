package org.example;

public class StringOperations {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isEmpty(String str) {
        return str.isEmpty();
    }

    public String toUpper(String str) {
        return str.toUpperCase();
    }
}