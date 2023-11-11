import java.util.Scanner;

public class individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N < 5) {
            System.out.println("Nilai N yang dimasukkan harus minimal 5!");
            return;
        }

        for (int i = N; i >= 1; i--) {
    
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}