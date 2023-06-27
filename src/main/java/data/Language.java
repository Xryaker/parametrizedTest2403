package data;

public enum Language {
    EN("en"),
//    RU("ru"),
//    ES("es"),
//    DE("de"),
    FRAN("fr");
    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
