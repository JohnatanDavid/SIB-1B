import java.util.Scanner;

public class Kubus11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus : ");

        double panjangSisi = input.nextDouble();
        double volume = hitungVolumeKubus(panjangSisi);
        double luasPermukaan = hitungLuasPermukaanKubus(panjangSisi);

        System.out.println("Volume kubus adalah : " + volume);
        System.out.println("Luas permukaan kubus adalah : " + luasPermukaan);
    }
    public static double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }
    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
}
