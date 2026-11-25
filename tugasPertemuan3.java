package pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class tugasPertemuan3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();

        System.out.println("=== Sistem Pengelolaan Mood & Fokus Belajar Mahasiswa ===");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Laporan");
        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();
        input.nextLine(); // membersihkan newline

        // IMPLEMENTASI SWITCH CASE
        switch (menu) {
            case 1:
                System.out.print("Masukkan Nama Mahasiswa : ");
                String nama = input.nextLine();
                daftarNama.add(nama); // IMPLEMENTASI ARRAYLIST

                // IMPLEMENTASI IF
                System.out.print("1. Tentukan mood anda : ");
                String mood = input.nextLine();

                if (mood.equalsIgnoreCase("fokus")) {
                    System.out.println("Kamu sedang fokus, lanjut belajar!");

                    // IMPLEMENTASI IF ELSE
                    System.out.print("2. Mood anda setelah belajar : ");
                    String waktu = input.nextLine();

                    if (waktu.equalsIgnoreCase("fokus")) {
                        System.out.println("Lanjut belajar!");
                    } else {
                        System.out.println("Istirahat");

                        // IMPLEMENTASI IF ELSE IF
                        System.out.print("3. Pilih tingkat mood anda (1-5) : ");
                        int tingkatMood = input.nextInt();

                        if (tingkatMood < 2) {
                            System.out.println("Istirahatlah!");
                        } else if (tingkatMood < 5) {
                            System.out.println("Belajar sedang");
                        } else {
                            System.out.println("Belajar berat");
                        }
                    }
                } else {
                    System.out.println("Mood tidak fokus, sebaiknya istirahat dulu.");
                }
                break;

            case 2:
                // IMPLEMENTASI ARRAY 2D
                String[][] durasi = {
                    {"2 jam", "3 jam"},
                    {"3 jam", "2 jam"}
                };
                System.out.println("Durasi belajar harian [0][0] : " + durasi[0][0]);
                break;

            default:
                System.out.println("Menu tidak tersedia.");
        }

        input.close();
    }
}
        
    


