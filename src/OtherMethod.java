
public class OtherMethod {
   public static void printArrayReverse(int[] ar)
   {
	   for(int i = ar.length-1;i >= 0;i--)
	   {
		   System.out.print(ar[i] + " ");
	   }
	   System.out.println();
   }
   public static int searchMax(int[] ar )
   {
	   int i,max = ar[0],maxInd = 0;
	   for(i = 1; i < ar.length;i++)
	   {
		   if(ar[i] > max)
		   {
			   max = ar[i];
			   maxInd = i;
		   }
	   }
	   return maxInd;
   }
   public static void printStringArray(String[] ar)
   {
	   for(int i = 0; i < ar.length;i++)
	   {
		   System.out.print(ar[i] + " ");
	   }
	   System.out.println();
   }
}






