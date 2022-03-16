import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int km, yasi, yolculuktipi;
        double ücret;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz : ");
        km = sc.nextInt();
        System.out.println("Yaşını Giriniz : ");
        yasi = sc.nextInt();
        System.out.println("Yolculuk Tipini Giriniz(1=>Tek Yön 2=>Gidiş Dönüş) : ");
        yolculuktipi = sc.nextInt();
        ücret = km * 0.10;
        if (km < 0 || yasi < 0 || (yolculuktipi != 1 && yolculuktipi != 2)) {
            System.out.println("Hatalı Giriş Yaptınız!");
        } else if (yasi < 12) {

            ücret = (ücret - ((ücret * 50) / 100));
            if (yolculuktipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yolculuktipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz!");

        } else if (yasi >= 12 && yasi <= 24) {
            ücret = (ücret - ((ücret * 10) / 100));
            if (yolculuktipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yolculuktipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz!");

        } else if (yasi >= 65) {

            ücret = (ücret - ((ücret * 30) / 100));
            if (yolculuktipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yolculuktipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz!");

        } else {
            ücret = km * 0.10;
            if (yolculuktipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yolculuktipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            }
        }

    }
}