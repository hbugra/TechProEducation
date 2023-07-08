package day20statickeywordconstructors;

public class CarTekrar {

    String marka = "Honda";
    String model = "Accord";
    int year = 2001;
    boolean hybrid= true ;

    public CarTekrar(String marka,String model,int year,boolean hybrid){
        this.hybrid = hybrid;
        this.marka = marka;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarTekrar{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
