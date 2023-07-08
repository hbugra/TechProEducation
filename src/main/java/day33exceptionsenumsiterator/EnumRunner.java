package day33exceptionsenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {

        //Enum daki bir sabite nasil ulasabiliriz?
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);//HATAY

        //Adana sabinitinn ismine ulusalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);//Adana

        //Istanbul plaka koduna ulasalim
        int istanbulPlateCode = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlateCode);//34

<<<<<<< HEAD
            //Ankaranin posta koduna ulasalim
=======
        //Ankaranin posta koduna ulasalim
>>>>>>> f6465fcd2ce2c591fb9e1cd26c6199617d9ac3e4
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);//06000


    }
}