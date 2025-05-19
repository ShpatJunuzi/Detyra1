import java.util.Scanner;

public class Detyra01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruani numrin e ushqimeve: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        if (N <= 0) {
            System.out.println("Numri i ushqimeve duhet te jete me i madh se 0.");
            return;
        }

        String[] ushqimet = new String[N];
        int[] sasite = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.print("Shkruani emrin e ushqimit " + (i + 1) + ": ");
            ushqimet[i] = scanner.nextLine();

            System.out.print("Shkruani sasine ne menu per " + ushqimet[i] + ":");
            sasite[i] = scanner.nextInt();
            scanner.nextLine();
        }


        while (true) {
            System.out.println("\nMenuja e Ushqimeve:");
            for (int i = 0; i < N; i++) {
                System.out.println(i + " - " + ushqimet[i] + " (" + sasite[i] + " ne stok)");
            }
            System.out.println("100 - Mbyll aplikacionin");

            System.out.print("\nZgjidh nje ushqim sipas indeksit: ");
            int zgjedhja = scanner.nextInt();


            if (zgjedhja == 100) {
                System.out.println("Aplikacioni u mbyll. Ju faleminderit!");
                break;
            }


            if (zgjedhja < 0 || zgjedhja >= N) {
                System.out.println("Indeksi i pavlefshem. Ju lutem zgjidhni nje indeks midis 0 dhe " + (N - 1) + ".");
                continue;
            }


            System.out.print("Sa copa te " + ushqimet[zgjedhja] + " deshironi qe t'i porosisni? ");
            int sasiaPorosi = scanner.nextInt();


            if (sasiaPorosi <= 0) {
                System.out.println("Sasia e porosise duhet te jete me e madhe se 0.");
            } else if (sasiaPorosi > sasite[zgjedhja]) {
                System.out.println("Na vjen keq, nuk ka sasi te mjaftueshme ne stok.");
            } else {
                sasite[zgjedhja] -= sasiaPorosi;
                System.out.println("Porosia u krye me sukses! Sasite e perditesuara ne stok:");
                System.out.println(ushqimet[zgjedhja] + " - " + sasite[zgjedhja] + " ne stok");
            }
        }
    }
}