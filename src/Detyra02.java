import java.util.Scanner;

public class Detyra02 {
    private static String[] kenget = new String[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zgjedhja;

        do {
            System.out.println("\nZgjidhni nje opsion:");
            System.out.println("1. Krijo nje kenge");
            System.out.println("2. Shfaq nje kenge");
            System.out.println("3. Shfaq te gjitha kenget");
            System.out.println("4. Ndrysho kengen");
            System.out.println("5. Fshij kengen");
            System.out.println("6. Dil nga aplikacioni");
            System.out.print("Zgjedhja juaj: ");
            zgjedhja = scanner.nextInt();
            scanner.nextLine();

            switch (zgjedhja) {
                case 1:
                    System.out.print("Vendos indeksin (0-9) per kengen e re: ");
                    int indexKrijo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Vendose emrin e kenges: ");
                    String emriKrijo = scanner.nextLine();
                    krijokenge(indexKrijo, emriKrijo);
                    break;
                case 2:
                    System.out.print("Vendos indeksin (0-9) per te shfaqur kengen: ");
                    int indexShfaq = scanner.nextInt();
                    shfaqKenge(indexShfaq);
                    break;
                case 3:
                    shfaqTeGjithaKenget();
                    break;
                case 4:
                    System.out.print("Vendos indeksin (0-9) per te ndryshuar kengen: ");
                    int indexNdrysho = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Vendos emrin e ri të këngës: ");
                    String emriRi = scanner.nextLine();
                    ndryshoKenge(indexNdrysho, emriRi);
                    break;
                case 5:
                    System.out.print("Vendos indeksin (0-9) per te fshire kengen: ");
                    int indexFshij = scanner.nextInt();
                    fshijKenge(indexFshij);
                    break;
                case 6:
                    System.out.println("Po dilni nga aplikacioni...");
                    break;
                default:
                    System.out.println("Zgjedhje e pavlefshme. Ju lutem provoni perseri.");
            }
        } while (zgjedhja != 6);

        scanner.close();
    }

    public static void krijokenge(int index, String emri) {
        if (index >= 0 && index < kenget.length) {
            kenget[index] = emri;
            System.out.println("Kenga u krijua me sukses!");
        } else {
            System.out.println("Indeksi i pavlefshem. Ju lutem perdorni nje indeks midis 0 dhe 9.");
        }
    }

    public static void shfaqKenge(int index) {
        if (index >= 0 && index < kenget.length && kenget[index] != null) {
            System.out.println("Kenga ne indeksin " + index + ": " + kenget[index]);
        } else {
            System.out.println("Nuk ka kenge ne kete indeks ose indeksi eshte i pavlefshem.");
        }
    }

    public static void shfaqTeGjithaKenget() {
        System.out.println("\nLista e te gjitha kengeve:");
        for (int i = 0; i < kenget.length; i++) {
            if (kenget[i] != null) {
                System.out.println(i + ". " + kenget[i]);
            } else {
                System.out.println(i + ". (Bosh)");
            }
        }
    }

    public static void ndryshoKenge(int index, String emriRi) {
        if (index >= 0 && index < kenget.length && kenget[index] != null) {
            kenget[index] = emriRi;
            System.out.println("Kenga u ndryshua me sukses!");
        } else {
            System.out.println("Nuk ka kenge ne kete indeks ose indeksi eshte i pavlefshem.");
        }
    }

    public static void fshijKenge(int index) {
        if (index >= 0 && index < kenget.length && kenget[index] != null) {
            kenget[index] = null;
            System.out.println("Kenga u fshi me sukses!");
        } else {
            System.out.println("Nuk ka kenge ne kete indeks ose indeksi eshte i pavlefshem.");
        }
    }
}