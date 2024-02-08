import java.util.Scanner;

public class KahveHazırla {
    Scanner oku = new Scanner(System.in);

    public KahveHazırla() {
    }

    public void kahveyiHazırla(int choice) {
        System.out.println("---kahveler---" + " seçtiniz.");
        if (choice == Kahveler.FRAPPUCCINO.ordinal() || choice == Kahveler.BUZLU_KAHVE.ordinal()) {
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!");
        }
        int size;
        boolean isTrue;
        do {
            isTrue = true;
            System.out.println("- Lütfen aşağıdaki menüden kahvenizin boyutunu (size) seçiniz…"+
                    "1. Small"+
                    "2. Medium"+
                    "3. Large"+
                    "4. XLarge");
            size = oku.nextInt();
            if (size == Boyutlar.SMALL.ordinal()){
                System.out.println("{size} {kahve}'niz hazırlanıyor…");
            } else if (size == Boyutlar.MEDIUM.ordinal()) {
                System.out.println("{size} {kahve}'niz hazırlanıyor…");
            } else if (size == Boyutlar.LARGE.ordinal()) {
                System.out.println("{size} {kahve}'niz hazırlanıyor…");
            }else if (size == Boyutlar.XLARGE.ordinal()){
                System.out.println("{size} {kahve}'niz hazırlanıyor…");
            }
            else {
                isTrue = false;
            }

        }while (!isTrue);



        String sut;
        int kacSeker;

        do {
            System.out.print("Süt eklemek ister misiniz: ");
            sut = oku.nextLine();
        } while (!sut.equalsIgnoreCase("evet") || !sut.equalsIgnoreCase("hayır"));

        if (sut.equalsIgnoreCase("evet"))
            System.out.println("Süt ekleniyor");
        else if (sut.equalsIgnoreCase("hayır"))
            System.out.println("Süt eklenmiyor");
        String seker;

        do {
            System.out.print("Şeker ister misiniz?(Evet veya Hayır olarak cevaplayınız) ");
            seker = oku.nextLine();
        } while (!seker.equalsIgnoreCase("evet") || !seker.equalsIgnoreCase("hayır"));

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker istersiniz? ");
            kacSeker = oku.nextInt();
            oku.nextLine();
            System.out.println(kacSeker + " şeker ekleniyor");
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Şeker eklenmiyor");
        }
    }


}
