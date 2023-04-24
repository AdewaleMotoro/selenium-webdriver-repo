import java.util.ArrayList;

public class SeleniumTest {

    public static void main(String[]args) {


        int arr[] = {2, 3, 4, 5, 6, 7,8,9,10,222};
        for ( int i =0; i< arr.length; i++){

            if (arr[i] % 2 == 0 ){
                System.out.println(arr[i]);
            }
            else
            {
                System.out.println(arr[i] + "Is not multiple of 2");
            }
        }
//Array Listing
        ArrayList<String> a = new ArrayList<String>();
        a.add("Motoro");
        a.add("Ade");
        a.add("Kemo");
        a.add("Jide");
        System.out.println(a.get(3));
        //Using For loop in Array listing
        for (int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        //To check if Item is Present//
      System.out.println(  a.contains("Kemo"));

    }



}
