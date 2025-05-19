import java.util.Scanner;

public class Bonus {
    private static String[] studentet;
    private static byte[] notat;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Miresevini ne aplikacionin 'Noto Studentin'!");
        System.out.print("Sa studente deshironi te regjistroni? ");
        int numriStudenteve = scanner.nextInt();
        scanner.nextLine(); // e pastron ekranin

        if (numriStudenteve <= 0) {
            System.out.println("Numri i studenteve duhet t'jete me i madh se 0.");
            return;
        }

        studentet = new String[numriStudenteve];
        notat = new byte[numriStudenteve];

        System.out.println("\nLe te fillojm me regjistrimin e studentve dhe notave te tyre:");
        for (int i = 0; i < numriStudenteve; i++) {
            System.out.print("Vendos emrin e studentit " + (i + 1) + ": ");
            studentet[i] = scanner.nextLine();

            System.out.print("Vendos noten e studentit " + studentet[i] + " (0-10): ");
            notat[i] = scanner.nextByte();
            scanner.nextLine();
        }

        while (true) {
            System.out.println("\nCka deshironi te beni tani?");
            System.out.println("1. Shiko te gjithe studentet");
            System.out.println("2. Shiko te gjitha notat");
            System.out.println("3. Ndrysho nje student");
            System.out.println("4. Dil nga aplikacioni");
            System.out.print("Zgjedhja juaj: ");
            int zgjedhja = scanner.nextInt();
            scanner.nextLine();

            switch (zgjedhja) {
                case 1:
                    shfaqStudentet();
                    break;
                case 2:
                    shfaqNotat();
                    break;
                case 3:
                    System.out.print("Vendos indeksin e studentit qe deshiron te ndryshosh (0-" + (numriStudenteve - 1) + "): ");
                    int indeksi = scanner.nextInt();
                    scanner.nextLine();

                    if (indeksi >= 0 && indeksi < numriStudenteve) {
                        System.out.print("Vendos emrin e ri te studentit: ");
                        String emriRi = scanner.nextLine();

                        System.out.print("Vendos noten e re: ");
                        byte notaRe = scanner.nextByte();
                        scanner.nextLine(); // Pastro buffer-in

                        ndryshoStudentin(indeksi, emriRi, notaRe);
                        System.out.println("Ndryshimi u krye me sukses!");
                    } else {
                        System.out.println("Indeksi i pavlefshem. Ju lutem provoni perseri.");
                    }
                    break;
                case 4:
                    System.out.println("Faleminderit qe perdoret aplikacionin 'Noto Studentin'. Mirupafshim! <3");
                    scanner.close();
                    return;
                default:
                    System.out.println("Zgjedhje e pavlefshme. Ju lutem provoni perseri.");
            }
        }
    }

    private static void shfaqStudentet() {
        System.out.println("\nLista e studenteve:");
        for (int i = 0; i < studentet.length; i++) {
            System.out.println(i + ". " + studentet[i]);
        }
    }

    private static void shfaqNotat() {
        System.out.println("\nLista e notave:");
        for (int i = 0; i < notat.length; i++) {
            System.out.println("Studenti " + studentet[i] + ": " + notat[i]);
        }
    }

    private static void ndryshoStudentin(int indeksi, String emriRi, byte notaRe) {
        studentet[indeksi] = emriRi;
        notat[indeksi] = notaRe;
    }
}
