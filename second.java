import java.util.Scanner;

import org.graalvm.compiler.lir.LIRInstruction.Temp;

public class second
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int x[]={1,2,3,4,5,6,7};
      add(x, 1, 5);
      System.out.println(x[5]);
      
	

}
public static void add(int[] y,int i,int j) {
   int temp=y[i];
   y[i]=y[j];
   y[j]=temp;
   

}
   
       

}