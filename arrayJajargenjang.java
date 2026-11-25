package tugaspempro;

public class arrayJajargenjang {
    
    public static void main(String[] args) {

        int ukuran = 5; // harus ganjil
        int tengah = ukuran / 2;

        int[][] array = new int[ukuran][ukuran];

        // Mengisi array
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if (Math.abs(i - tengah) + Math.abs(j - tengah) <= tengah) {
                    array[i][j] = 1; // angka yang ditampilkan
                } else {
                    array[i][j] = 0; // spasi
                }
            }
        }

        // Menampilkan output
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if (array[i][j] == 1) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
        
    
    

