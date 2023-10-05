import java.util.Scanner; 
public class Pemilihan2Percobaan211 {
    public static void main(String args[]){
        double sudut1,sudut2,sudut3,totalSudut;
        Scanner input11 = new Scanner(System.in);
        System.out.println("Masukkan sudut 1 :");
        sudut1 = input11.nextDouble();
        System.out.println("Masukkan sudut 2 :");
        sudut2 = input11.nextDouble();
        System.out.println("Masukkan sudut 3 :");
        sudut3 = input11.nextDouble();
        totalSudut = sudut1 +sudut2 +sudut3;
        System.out.println("Total sudut segitiga :" + totalSudut);
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if (sudut1 == sudut2 && sudut2 == sudut3)
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3)
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
            System.out.println("Bukan segitiga");
    }
}
