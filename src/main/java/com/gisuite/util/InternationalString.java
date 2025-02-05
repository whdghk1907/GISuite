package com.gisuite.util;

import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/**
 * ISO 19103에서 정의된 다국어 문자열을 지원하는 클래스.
 */
public class InternationalString {
    private final Map<Locale, String> translations;

    public InternationalString() {
        translations = new HashMap<>();
    }

    public void addTranslation(Locale locale, String text) {
        translations.put(locale, text);
    }

    public String getTranslation(Locale locale) {
        return translations.getOrDefault(locale, translations.get(Locale.ENGLISH));
    }
}
