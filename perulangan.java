import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
    char Kendaraan;
    int hari, parkir = 0 , Motor = 2000, Mobil = 5000;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah hari masuk kampus: ");
    hari= input.nextInt();
    for (int i = 0; i < hari; i++) {
        System.out.println("Hari ke-" + (i + 1) + " (1. mobil, 2. motor):");
        Kendaraan = input.next().charAt(0);
        switch (Kendaraan) {
          case '1':
            parkir =+ Mobil ;
            break;
          case '2':
            parkir =+ Motor ;
            break;
    
          default:
            System.out.println("Pilihan tidak valid!");
            break;
        }
    }
    System.out.println("Total biaya parkir =" + parkir);
    }
}


















