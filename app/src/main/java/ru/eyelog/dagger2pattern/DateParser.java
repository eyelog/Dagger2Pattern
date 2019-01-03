package ru.eyelog.dagger2pattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
class DateParser {

    @Inject
    public DateParser() {
    }

    @Provides
    public String parseThis(String s){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        String out = "Сейчас: " + simpleDateFormat.format(date) + "\n" + "И Вы написали - " + s;

        System.out.println("Logcat: " + out);

        return out;
    }
}
