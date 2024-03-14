public enum CoffeeOptions {
    Und(""),AMERICANO("Americano"),
    ESPRESSO("Espresso"),
    CAPPUCINO("Cappucino"), LATTE("Latte"), MOCHA("Mocha"),
    MACCHIATO("Macchiato"), AFFOGATO("Affogato"), BUZLU_KAHVE("Buzlu Kahve"),
    FRAPPUCCINO("Frapuccino"),IRISH("Irish");

    final String isim;
    CoffeeOptions(String isim) {
        this.isim = isim;
    }


}
