import java.util.Scanner;

public class DoWhileCuti11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();

    do {
        System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();
        
        if (konfirmasi.equalsIgnoreCase("y")) {
        
        }if (konfirmasi.equalsIgnoreCase("t")) {
            break;
        }
            System.out.println("Jumlah hari : ");
            jumlahHari = sc.nextInt();

            if(jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti : " + jatahCuti);  
            } else {
                System.out.println("Sisa jatah cuti anda tidak mencukupi");
            }
    } while (jatahCuti > 0);
    }   
}
