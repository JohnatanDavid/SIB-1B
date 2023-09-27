import java.util.Scanner;
public class Lingkaran11 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas, phi = 3.14;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        keliling= 2*3.14*r;
        luas = phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);

    }
}