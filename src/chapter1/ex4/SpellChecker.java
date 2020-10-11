package chapter1.ex4;

import jdk.nashorn.internal.ir.LexicalContext;

import java.util.List;

public class SpellChecker {
    private final LexicalContext dictionary;

    public SpellChecker(LexicalContext dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return true;
    }
    public List<String> suggestions(String typo) {
        return null;
    }
}
