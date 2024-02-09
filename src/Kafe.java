import java.util.Scanner;

public class Kafe {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        KahveHazırla kahve = new KahveHazırla();


        int choice;
        do {
            System.out.println("Hoş Geldiniz");
            System.out.println("Lütfen seçiminizi yapınız ");
            System.out.println("1- Americano");
            System.out.println("2- Espresso ");
            System.out.println("3- Cappucino");
            System.out.println("4- Latte");
            System.out.println("5- Mocha");
            System.out.println("6- Macchiato");
            System.out.println("7- Affogato");
            System.out.println("8- Buzlu Kahve (Soğuk kahve)");
            System.out.println("9- Frappuccino (Soğuk kahve)");
            System.out.println("10- Irish");
            System.out.println("0- Çıkış");
            choice=scanner.nextInt();

            switch (choice){
                case 1:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 2:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 3:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 4:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 5:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 6:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 7:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 8:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 9:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 10:
                    kahve.kahveyiHazırla(choice);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen geçerli bir düğmeye basın!");
                    break;
            }

        }while (choice!=0);



    }
}
