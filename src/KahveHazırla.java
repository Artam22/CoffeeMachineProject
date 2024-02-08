public class KahveHazırla {


    public KahveHazırla() {
    }

    public void kahveyiHazırla(int choice) {
        System.out.println("kahveler" + " seçtiniz.");
        if (choice == Kahveler.FRAPPUCCINO.ordinal() || choice == Kahveler.BUZLU_KAHVE.ordinal()) {
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!");

        }
    }


}
