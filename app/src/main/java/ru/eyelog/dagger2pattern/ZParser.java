package ru.eyelog.dagger2pattern;

import dagger.Component;

@Component
public interface ZParser {
   ZaiParser getZaiParser();
}
