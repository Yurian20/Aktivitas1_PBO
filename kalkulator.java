import java.util.Scanner;

class Kalkulator {
  public static void main(String[] args) {
    char operator;
    int a, b, hasil;

    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan angka pertama: ");
    a = input.nextInt();
    System.out.println("Masukkan angka kedua: ");
    b = input.nextInt();
    System.out.println("Pilih Operasi: 1. Tambah, 2. Kurang, 3. Kali, 4. Bagi");
    operator = input.next().charAt(0);

    switch (operator) {
      case '1':
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);
        break;

      case '2':
        hasil = a - b;
        System.out.println(a + " - " + b + " = " + hasil);
        break;

      case '3':
        hasil = a * b;
        System.out.println(a + " x " + b + " = " + hasil);
        break;

      case '4':

          hasil = a / b;
          System.out.println(a + " ÷ " + b + " = " + hasil);
        break;

      default:
        System.out.println("Pilihan tidak valid!");
        break;
    }

    input.close();
  }
}
