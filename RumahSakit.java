
import java.util.ArrayList;
import java.util.Scanner;

public class RumahSakit {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        ArrayList<String> pasien = new ArrayList<>();
        String lanjut;

        System.out.println("=== SISTEM PELAYANAN PASIEN RUMAH SAKIT ===");

        // ================= DO WHILE =================
        // Input data pasien
        do {
            System.out.print("Masukkan nama pasien: ");
            String nama = input.nextLine();
            pasien.add(nama);

            System.out.print("Tambah pasien lagi? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));

        // ================= FOR =================
        // Menampilkan semua pasien
        System.out.println("\nDaftar Pasien Terdaftar:");
        for (int i = 0; i < pasien.size(); i++) {
            System.out.println((i + 1) + ". " + pasien.get(i));
        }

        // ================= WHILE =================
        // Mencari pasien
        String cari;
        boolean ditemukan = false;

        System.out.print("\nCari nama pasien: ");
        cari = input.nextLine();

        int i = 0;
        while (i < pasien.size()) {
            if (pasien.get(i).equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
            i++;
        }

        if (ditemukan) {
            System.out.println("Pasien " + cari + " ditemukan di nomor antrian " + (i + 1));
        } else {
            System.out.println("Pasien " + cari + " tidak ditemukan.");
        }

        System.out.println("Program selesai.");
    }
}
    



    
    

