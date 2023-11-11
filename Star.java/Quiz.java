import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success =(answer==number);

                if (answer == number) {
                    System.out.println("Mantap Jiwaa, Selamat, Tebakan Anda benar.");
                    success = true;
                } else if (answer < number) {
                    System.out.println("hahahaha, maaf tetapi Tebakan Anda terlalu kecil");
                } else {
                    System.out.println("Wadidawww, maaf tetapi Tebakan Anda terlalu besar");
                }
            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);

        } while (menu == 'y' || menu =='Y');
}
}