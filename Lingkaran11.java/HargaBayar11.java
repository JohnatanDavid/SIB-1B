import java.util.Scanner;
public class HargaBayar11 {
    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        int jumlah_halaman_buku;
        String merk_buku;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan merk buku");
        merk_buku=input.next();
        System.out.println("Masukkan jumlah halaman buku");
        jumlah_halaman_buku=input.nextInt();
        System.out.println("Masukkan besaran diskon");
        dis=input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);
    }
}
