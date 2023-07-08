package day15loops;

import java.util.Scanner;

public class DoWhile03Tekrar {

    /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */


    public static void main(String[] args) {







        int top = 0;
        do{ if(top==4){
            System.out.println("hesabınız bloke olmustur");
            break;
        }
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen kullanıcı adinizi girinz: ");
            String a = scan.next();
            System.out.println("lutfen sıfrenizi giriniz: ");
            String b = scan.next();

            if(a.equals("admin") && b.equals("pwd123") ){
                System.out.println("hesabınıza hos geldiniz! ");
                break;
            }
            top++;



        }while(true);




    }

}
