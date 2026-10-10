import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean berjalan = true;

        System.out.println("==========================================");
        System.out.println("  PROGRAM PBO       ");
        System.out.println("==========================================");

        while (berjalan) {
            System.out.println("\nPilih menu:");
            System.out.println("1. Buat Objek BujurSangkar");
            System.out.println("2. Buat Objek Lingkaran");
            System.out.println("3. Buat Objek Silinder");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda (1-4): ");

            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- MEMBUAT BUJURSANGKAR ---");
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaBS = input.nextLine();

                    BujurSangkar userBS = new BujurSangkar(sisi, warnaBS);
                    System.out.print("Hasil: ");
                    userBS.printInfo();
                    break;

                case 2:
                    System.out.println("\n--- MEMBUAT LINGKARAN ---");
                    System.out.print("Masukkan jari-jari (radius): ");
                    double radius = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaLK = input.nextLine();

                    Lingkaran userLK = new Lingkaran(radius, warnaLK);
                    System.out.print("Hasil: ");
                    userLK.printInfo();
                    break;

                case 3:
                    System.out.println("\n--- MEMBUAT SILINDER ---");
                    System.out.print("Masukkan tinggi silinder: ");
                    double tinggi = input.nextDouble();
                    System.out.print("Masukkan jari-jari (radius): ");
                    double radiusSilinder = input.nextDouble();
                    input.nextLine();
                    System.out.print("Masukkan warna: ");
                    String warnaSL = input.nextLine();

                    Silinder userSL = new Silinder(tinggi, radiusSilinder, warnaSL);
                    System.out.print("Hasil: ");
                    userSL.printInfo();
                    break;

                case 4:
                    berjalan = false;
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Masukkan angka 1 - 4.");
                    break;
            }
        }

        input.close();
    }
}