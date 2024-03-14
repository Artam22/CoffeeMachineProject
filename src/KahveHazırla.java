import java.util.Scanner;


// COFFEE PREPARED IN THIS CLASS
public class KahveHazırla {
    Scanner oku = new Scanner(System.in);

    public void PrepareCoffee(int choice) throws InterruptedException {

        // CUSTOMER CHOICE
        switch (choice){
            case 1:
                System.out.println(CoffeeOptions.AMERICANO + " seçtiniz.");break;
            case 2:
                System.out.println(CoffeeOptions.ESPRESSO + " seçtiniz.");break;
            case 3:
                System.out.println(CoffeeOptions.CAPPUCINO + " seçtiniz.");break;
            case 4:
                System.out.println(CoffeeOptions.LATTE + " seçtiniz.");break;
            case 5:
                System.out.println(CoffeeOptions.MOCHA + " seçtiniz.");break;
            case 6:
                System.out.println(CoffeeOptions.MACCHIATO + " seçtiniz.");break;
            case 7:
                System.out.println(CoffeeOptions.AFFOGATO + " seçtiniz.");break;
            case 8:
                System.out.println(CoffeeOptions.BUZLU_KAHVE + " seçtiniz.");break;
            case 9:
                System.out.println(CoffeeOptions.FRAPPUCCINO + " seçtiniz.");break;
            case 10:
                System.out.println(CoffeeOptions.IRISH + " seçtiniz.");break;
            default:
                System.out.println("Geçersiz Kahve seçtiniz");
        }


        // IF IT'S A COLD COFFEE PRINT THE SENTENCE > "The best way to cool off on a hot summer day... Excellent decision!"
        if (choice == CoffeeOptions.FRAPPUCCINO.ordinal() || choice == CoffeeOptions.BUZLU_KAHVE.ordinal()) {
            System.out.println("Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!");
        }
        int size;
        boolean isTrue;

        // ASK FOR COFFEE SIZE
        do {
            isTrue = true;
            System.out.println("- Lütfen aşağıdaki menüden kahvenizin boyutunu (size) seçiniz…"+
                    " \n1. Small"+
                    " \n2. Medium"+
                    " \n3. Large"+
                    " \n4. XLarge");
            size = oku.nextInt();
            oku.nextLine();


            // PRINT: PREPARING + {SIZE} + COFFEE
            switch (size){
                case 1:System.out.println(Size.SMALL+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 2:System.out.println(Size.MEDIUM+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 3:System.out.println(Size.LARGE+" kahveniz hazırlanıyor…");
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(100);
                        System.out.print(">");
                    }break;
                case 4:System.out.println(Size.XLARGE+" kahveniz hazırlanıyor…");
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

        // ASK CUSTOMER IF THEY WANT MILK
        do {
            System.out.print("\nSüt eklemek ister misiniz: ");
            sut = oku.nextLine();
        } while (!sut.equalsIgnoreCase("evet") && !sut.equalsIgnoreCase("hayır"));

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Süt ekleniyor");
            for (int i = 0; i < 20; i++) {
                System.out.print(">");
                Thread.sleep(100);
            }
        }else if (sut.equalsIgnoreCase("hayır")) {
            System.out.println("Süt eklenmiyor");

        }
        String seker;

        // ASK CUSTOMER IF THEY WANT SUGAR
        do {
            System.out.print("\nŞeker ister misiniz?(Evet veya Hayır olarak cevaplayınız) ");
            seker = oku.nextLine();
        } while (!seker.equalsIgnoreCase("evet") && !seker.equalsIgnoreCase("hayır"));

        if (seker.equalsIgnoreCase("evet")) {
            System.out.println("Kaç şeker istersiniz? ");
            kacSeker = oku.nextInt();
            oku.nextLine();
            System.out.println(kacSeker + " şeker ekleniyor");
            for (int i = 0; i < 20; i++) {
                System.out.print(">");
                Thread.sleep(100);
            }
        } else if (seker.equalsIgnoreCase("hayır")) {
            System.out.println("Şeker eklenmiyor");
            System.out.println();
        }

        // PRINT COFFEE NAME AND SIZE
        for (CoffeeOptions k : CoffeeOptions.values()){
            if (k.ordinal() == choice ){
                for (Size b : Size.values()){
                    if (b.ordinal() == choice)
                        System.out.println(b.isim +" "+ k.isim +" kahveniz hazırlanıyor...");
                }

            }
        }

        // FOR VISUAL EFFECT
        for (int i = 0; i < 20; i++) {
            System.out.print(">");
            Thread.sleep(100);

        }
        System.out.println("\nKahveniz hazır Afiyet Olsun!.....");

    }
}
