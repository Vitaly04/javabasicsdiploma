package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;

public class Schema implements TextColorSchema {
    @Override
    public char convert(int color) {
        char[] chars = {'-', '+', '*', '%', '@', '$', '#'};

        for (int i =1; i < chars.length; i++) {
            if (255/i <= color) return chars[i-1];
        }
        return '-';
    }
}
