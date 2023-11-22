import java.util.Scanner;

public class Percobaan511 {
    static void Tampil(String str, int... a) {
        System.out.println("String " + str);
        System.out.println("Jumlah argumen/parameter int: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void TampilString(String str, String... s) {
        System.out.println("String " + str);
        System.out.println("Jumlah argumen/parameter String: " + s.length);

        for (String i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");

        TampilString("Teknologi", "Informasi", "Fast", "Bravo");
        TampilString("Polinema", "Joss", "Joss");
        TampilString("Horeee");
    }
}
