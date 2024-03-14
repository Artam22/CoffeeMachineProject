import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) throws InterruptedException {

        // Declaring necessary objects
        Scanner scanner = new Scanner(System.in);
        KahveHazırla kahve = new KahveHazırla();



        // Show menu to the Customer
        menu(scanner, kahve);


        // Ask for new coffee after the order
        boolean isTrue = true;
        do {
            System.out.print("Yeni bir kahve ister misiniz?(Evet/Hayır): ");
            String dvm = scanner.nextLine();
            if (dvm.equalsIgnoreCase("evet")){
                menu(scanner, kahve);
            }else if (dvm.equalsIgnoreCase("hayır")){
                System.out.println("Çıkış yapılıyor...");
                isTrue = false;
            }
            else {
                System.out.println("Geçersiz seçim. Tekrar deneyiniz.");
            }
        }while (isTrue);


    }


    // menu() method for customer
    private static void menu(Scanner scanner, KahveHazırla kahve) throws InterruptedException {
        int choice;

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
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                kahve.PrepareCoffee(choice);
                break;
            case 0:
                System.out.println("Çıkış yapılıyor...");
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen geçerli bir düğmeye basın!");
                break;
            }

    }


}
