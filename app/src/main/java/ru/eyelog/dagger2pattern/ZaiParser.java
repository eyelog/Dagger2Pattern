package ru.eyelog.dagger2pattern;

import javax.inject.Inject;

public class ZaiParser{

    @Inject
    public ZaiParser() {
    }

    public String parseThis(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }

        String out = "Вы написали: " + s + "\n" + "И в нём - " + count + " символов";

        System.out.println("Logcat: " + out);

        return out;
    }
}
