package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String name = "   maven demo   ";
        System.out.println(StringUtils.capitalize(name.trim()));
    }
}
