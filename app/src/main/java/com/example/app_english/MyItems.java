package com.example.app_english;

public class MyItems {
    private final String word,types,def;

    public MyItems(String word, String types, String def) {
        this.word = word;
        this.types = types;
        this.def = def;
    }

    public String getWord() {
        return word;
    }

    public String getTypes() {
        return types;
    }

    public String getDef() {
        return def;
    }
}
