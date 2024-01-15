import java.util.ArrayList;
import java.util.Scanner;

public class Apliikasiparkir {
    public static void main(String[] args) {
        // Membuat ArrayList untuk setiap lantai parkir
        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("=== APLIKASI PARKIR ===");
            System.out.println("1. Masukkan Kendaraan");
            System.out.println("2. Keluar dari Program");
            System.out.print("Pilih Menu (1/2): ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    masukkanKendaraan(scanner, lantai1, lantai2, lantai3);
                    break;
                case 2:
                    System.out.println("Terima kasih telah menggunakan aplikasi parkir.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
                    break;
            }
        } while (menu != 2);
    }

    private static void masukkanKendaraan(Scanner scanner, ArrayList<String> lantai1, ArrayList<String> lantai2, ArrayList<String> lantai3) {
        System.out.println("Masukkan informasi kendaraan:");

        System.out.print("Nomor Plat: ");
        String nomorPlat = scanner.next();

        System.out.print("Kapasitas Mesin (CC): ");
        int kapasitasMesin = scanner.nextInt();

        String lantai = "";
        if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
            lantai = "Lantai 3";
            lantai3.add(nomorPlat);
        } else if (kapasitasMesin >= 1500 && kapasitasMesin <= 2000) {
            lantai = "Lantai 2";
            lantai2.add(nomorPlat);
        } else if (kapasitasMesin >= 2500) {
            lantai = "Lantai 1";
            lantai1.add(nomorPlat);
        } else {
            System.out.println("Kendaraan dengan kapasitas mesin tersebut tidak dapat diparkir.");
            return;
        }

        System.out.println("Kendaraan berhasil diparkir di " + lantai);
    }
}
