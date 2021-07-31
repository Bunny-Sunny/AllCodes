package day5;
import java.util.Arrays;
import java.util.Scanner;

public class  Arrays1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int k=sc.nextInt(); 
		int flag=0;
		Arrays.sort(ar); //Sorted the array
		
		for(int i=0;i<k;i++) {
			if(ar[i]==ar[i+1]) {//if there is any duplicate increment k
				flag++;
			//	System.out.print("YEs");
			}
		}
		//System.out.println(k);
		System.out.print(ar[k+flag-1]);//print  the k value


	}

}
