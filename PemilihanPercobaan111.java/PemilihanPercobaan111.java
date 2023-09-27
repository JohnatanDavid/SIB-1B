import java.util.Scanner;
public class PemilihanPercobaan111{
    public static void main(String args[]){
        Scanner input11 = new Scanner(System.in);
        System.out.println("Masukan angka: ");
        int angka = input11.nextInt();
        // if (angka % 2 == 0)
        //     System.out.println("Angka "+angka+" bilangan genap");
        // else
        //     System.out.println("Angka "+angka+" bilangan ganjil");
        String message = angka % 2 == 0 ? " Bilangan Genap " : " Bilangan Ganjil ";
        System.out.println("Angkah yang dimasukkan = " + angka + " sehingga " + message);
    }
}
