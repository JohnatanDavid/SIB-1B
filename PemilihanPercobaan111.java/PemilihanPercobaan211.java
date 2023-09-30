import java.util.Scanner; 
public class PemilihanPercobaan211 {
    public static void main(String args[]){
        Scanner input11 = new Scanner(System.in);
        System.out.println("Nilai uas       :");
        float uas = input11.nextFloat();
        System.out.println("Nilai uts       : ");
        float uts = input11.nextFloat();
        System.out.println("Nilai kuis      :");
        float kuis = input11.nextFloat();
        System.out.println("Nilai tugas     :");
        float tugas = input11.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) +(tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai akhir: ");
        int nilai = input.nextInt();
        String nilaiHuruf = "";

        if (nilai >= 80) {
            nilaiHuruf = "A";
        } 
        else if (nilai >= 73) {
            nilaiHuruf = "B+";            
        } 
        else if (nilai >= 65) {
            nilaiHuruf = "B";            
        } 
        else if (nilai >= 60){
             nilaiHuruf = "C+";
        }
        else if (nilai >= 50) {
            nilaiHuruf = "C";
        } 
        else if (nilai >= 39) {
            nilaiHuruf = "D";           
        } 
        else {
            nilaiHuruf = "E";            
        }
        System.out.printf("Nilai huruf = %s\n", nilaiHuruf);
    }
    }
}
