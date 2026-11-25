package klinikkecantikan;

import java.util.Scanner;

public class KlinikKecantikan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int pilihMenu;
        int jumlah;
        int hargaTreatment = 0;
        int totalBayar;
        int potongan = 0;
        int poin = 0;

        System.out.println("=================================");
        System.out.println("   SELAMAT DATANG DI KLINIK CANTIK");
        System.out.println("=================================");
        System.out.println("1. Facial");
        System.out.println("2. Whitening");
        System.out.println("3. Acne Care");
        System.out.println("4. Anti Aging");
        System.out.print("Silakan pilih treatment : ");
        pilihMenu = input.nextInt();

        // SWITCH CASE
        switch (pilihMenu) {
            case 1:
                hargaTreatment = 150000;
                break;
            case 2:
                hargaTreatment = 250000;
                break;
            case 3:
                hargaTreatment = 200000;
                break;
            case 4:
                hargaTreatment = 300000;
                break;
            default:
                System.out.println("Treatment tidak tersedia.");
        }

        System.out.print("Masukkan jumlah treatment : ");
        jumlah = input.nextInt();

        // ARITMATIKA
        totalBayar = hargaTreatment * jumlah;

        // IF ELSE IF + LOGIKA
        if (jumlah >= 5 && jumlah < 10) {
            potongan = totalBayar * 10 /100;
        } else if (jumlah >= 10) {
            potongan = totalBayar * 20/100;
        } else {
            potongan = 0;
        }

        totalBayar = totalBayar - potongan;

        // FOR + INCREMENT
        for (int i = 1; i <= jumlah; i++) {
            poin++; // tiap 1 treatment dapat 1 poin
        }

        // WHILE + DECREMENT
        int bonus = 0;
        while (poin >= 5) {
            bonus++;
            poin -= 5;
        }

        // DO WHILE
        int cetak;
        do {
            System.out.print("Cetak struk? (1 = Ya, 0 = Tidak) : ");
            cetak = input.nextInt();
        } while (cetak != 0 && cetak != 1);

        // IF
        if (cetak == 1) {
            System.out.println("\n========= STRUK KLINIK =========");
            System.out.println("Jumlah Treatment : " + jumlah);
            System.out.println("Potongan Harga   : Rp " + potongan);
            System.out.println("Total Bayar      : Rp " + totalBayar);
            System.out.println("Bonus Treatment  : " + bonus);
            System.out.println("================================");
        }

        System.out.println("Terima kasih sudah treatment di klinik kami ");
    }
}

    

     
    
    

