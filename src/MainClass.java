
public class MainClass {
   public static void main(String[] args) {
	   //        0 1 2 3 4 5 6
     int[] ar = {8,1,3,2,4,9,3};
     OtherMethod.printArrayReverse(ar);
     int index = OtherMethod.searchMax(ar);
     System.out.println("Max in index : " + index);
     //                0        1        2      3 
     String[] ar1 = {"Kiwi","Orange","Apple","Banana"};
     OtherMethod.printStringArray(ar1);
}
}
