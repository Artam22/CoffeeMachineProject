import java.util.Scanner;

public class KahveHazırla {
    Scanner oku = new Scanner(System.in);
    Scanner okuStr=new Scanner(System.in);

    public KahveHazırla() {
    }

    public void kahveyiHazırla(int choice) throws InterruptedException {
        switch (choice){
            case 1:
                System.out.println(Kahveler.AMERICANO + " seçtiniz.");break;
            case 2:
                System.out.println(Kahveler.ESPRESSO + " seçtiniz.");break;
            case 3:
                System.out.println(Kahveler.CAPPUCINO + " seçtiniz.");break;
            case 4:
                System.out.println(Kahveler.LATTE + " seçtiniz.");break;
            case 5:
                System.out.println(Kahveler.MOCHA + " seçtiniz.");break;
            case 6:
                System.out.println(Kahveler.MACCHIATO + " seçtiniz.");break;
            case 7:
                System.out.println(Kahveler.AFFOGATO + " seçtiniz.");break;
            case 8:
                System.out.println(Kahveler.BUZLU_KAHVE + " seçtiniz.");break;
            case 9:
                System.out.println(Kahveler.FRAPPUCCINO + " seçtiniz.");break;
            case 10:
                System.out.println(Kahveler.IRISH + " seçtiniz.");break;
            default:
                System.out.println("Geçersiz Kahve seçtiniz");
        }

        if (choice == Kahveler.FRAPPUCCINO.ordinal() || choice == Kahveler.BUZLU_KAHVE.ordinal()) {
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!");
        }
        int size;
        boolean isTrue;
        do {
            isTrue = true;
            System.out.println("- Lütfen aşağıdaki menüden kahvenizin boyutunu (size) seçiniz…"+
                    " \n1. Small"+
                    " \n2. Medium"+
                    " \n3. Large"+
                    " \n4. XLarge");
            size = oku.nextInt();


            switch (size){
                case 1:System.out.println(Boyutlar.SMALL+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 2:System.out.println(Boyutlar.MEDIUM+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 3:System.out.println(Boyutlar.LARGE+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 4:System.out.println(Boyutlar.XLARGE+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                default:
                    System.out.println("Geçersiz kahve boyu tekrar deneyin");
                    isTrue=false;
            }

        }while (!isTrue);

        String sut;
        int kacSeker;

        do {
            System.out.print("\nSüt eklemek ister misiniz: ");
            sut = okuStr.nextLine();
        } while (!sut.equalsIgnoreCase("evet") && !sut.equalsIgnoreCase("hayır"));

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor");
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
                System.out.print(">");
            }
        }else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor");

        }
        String seker;

        do {
            System.out.print("\nŞeker ister misiniz?(Evet veya Hayır olarak cevaplayınız) ");
            seker = okuStr.nextLine();
        } while (!seker.equalsIgnoreCase("evet") && !seker.equalsIgnoreCase("hayır"));

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker istersiniz? ");
            kacSeker = oku.nextInt();
            oku.nextLine();
            System.out.println(kacSeker + " şeker ekleniyor");
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
                System.out.print(">");
            }
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Şeker eklenmiyor");
            System.out.println();
        }

        System.out.println("\nKahveniz hazırlanıyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");

        }
        System.out.println("\nKahveniz hazır Afiyet Olsun!.....");
    }


}
