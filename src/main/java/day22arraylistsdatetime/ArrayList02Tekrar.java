package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02Tekrar {

    public static void main(String[] args) {
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(11);
        //[10, 12, 19, 23]
        Collections.sort(nums);

        int min = nums.get(1)-nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            min = Math.min(min,nums.get(i)-nums.get(i-1));
            if(nums.get(i)-nums.get(i-1)==min){
                System.out.println(nums.get(i-1) + " and "+ nums.get(i));
            }
        }


        /*int minDiff = nums.get(1)-nums.get(0);

        for (int i = 1; i <nums.size() ;             i++) {
            minDiff= Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);



        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1) + " and "+ nums.get(i));
            }
        }*/

    }

}
