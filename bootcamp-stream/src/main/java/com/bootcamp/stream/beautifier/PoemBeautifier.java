package com.bootcamp.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(text);
    }
}
