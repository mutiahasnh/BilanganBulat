import java.util.Scanner;

public class BilanganBulat {
    public static void main(String[] args) {

        double luas, keliling, p = 3.14;
        int r,menu;

        System.out.println("Silahkan pilih menu menghitung :");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Keliling Lingkaran");

        Scanner temp = new Scanner(System.in);

        menu = temp.nextInt();

        if (menu == 1){

            System.out.println("Masukan jari-jari (r)  : ");
            r = temp.nextInt();

            luas = p*r*r;
            System.out.println("Luas Lingkaran = "+ luas);
        }
        else {
            System.out.println("Masukan Jari-Jari (r) : ");
            r = temp.nextInt();
            
            keliling = 2*p*r;
            System.out.println("Keliling Lingkaran = "+ keliling);

        }
    }
}
