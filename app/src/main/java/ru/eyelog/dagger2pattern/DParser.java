package ru.eyelog.dagger2pattern;

import dagger.Component;

@Component(modules = {DateParser.class})
public interface DParser {
    DateParser getDateParser();
}
