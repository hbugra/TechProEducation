package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

    //* 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)

    String gunler[] = {"Pazartesi", "Sali", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

    //* 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)

    Double gunlukKazanclar[] = new Double[7];

    //* 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.

    public void gunlukKazanclarArray() {


        int i = 0;
        while (i < 7) {
            Scanner input = new Scanner(System.in);
            System.out.println((i + 1) + ".gunun kazancini giriniz: ");
            double a = input.nextDouble();
            gunlukKazanclar[i] = a;
            i++;
        }
        System.out.println("gunluk kazanc listesi" + Arrays.toString(gunlukKazanclar));
        System.out.println();
    }


    //* 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    double ortalama;
    public void getOrtalamaKazanc() {

        double toplam = 0;
        for (double w : gunlukKazanclar) {

            toplam = toplam + w;
            ortalama = toplam / gunlukKazanclar.length;
        }
        System.out.println("7 gunluk ortalama kazanc " + ortalama + " TL dir");
        System.out.println();
    }

    //* 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.

    public void getOrtalamaninUstundeKazancGünleri(){
        for(int i = 0; i<gunlukKazanclar.length; i++){
            if(gunlukKazanclar[i]>ortalama){
                System.out.println(gunler[i] + " gunun kazanci " + gunlukKazanclar[i] + " TL ile " + "ortalamanin ustundedir");
            }
        }
        System.out.println();
    }
    //* 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //* for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //* ortalama kazançtan aşağıysa o günleri return yap.

    public void getOrtalamaninAltindaKazancGünleri(){
        for(int i = 0; i<gunlukKazanclar.length; i++){
            if(gunlukKazanclar[i]<ortalama){
                System.out.println(gunler[i] + " gunun kazanci " + gunlukKazanclar[i] + " TL ile " + "ortalamanin altindadir");
            }else if(gunlukKazanclar[i] == ortalama){
                System.out.println(gunler[i] + " gunun kazanci " + gunlukKazanclar[i] + " TL ile " + "ortalama kazanc ile aynidir");
            }
        }
        System.out.println();
    }

}
