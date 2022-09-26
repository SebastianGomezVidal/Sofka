package sura.enumerators;

public enum Option {

    FROM_A_TO_Z ("az"),
    FROM_Z_TO_A ("za"),
    FROM_LOW_TO_HIGH ("lohi"),
    FROM_HIGH_TO_LOW ("hilo");

    private final String option;

    Option(String option){ this.option = option; }

    public String getOption () { return option; }
}
