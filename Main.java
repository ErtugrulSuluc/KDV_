import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdvoranı,tutarı,kdvlifiyat;
        System.out.print("Fiyatını Giriniz: ");
        tutarı = inp.nextDouble();

        if (tutarı<=1000){
            kdvoranı = 0.18;
            kdvlifiyat = kdvoranı*tutarı;
            System.out.println("KDVLİ FIYATI: "+kdvlifiyat);
            double toplam = kdvlifiyat+tutarı;
            System.out.println("TOPLAM FİYAT: "+toplam);

        } else if (tutarı>1000){
            kdvoranı = 0.8;
            kdvlifiyat = kdvoranı*tutarı;
            System.out.println("KDVLİ FIYATI: "+kdvlifiyat);
            double toplam = kdvlifiyat+tutarı;
            System.out.println("TOPLAM FİYAT: "+toplam);




        }



    }
}