package array3d;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Schools");
		int n=sc.nextInt();
		System.out.println("Enter Number Of Classes");
		int m=sc.nextInt();
		System.out.println("Enter Number Of Students");
		int s=sc.nextInt();
		int[][][] a=new int[n][m][s];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter The School Of "+(i+1)+" and Class Of "+(j+1)+" and Student Of "+(k+1));
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println("");
			}
		}
		sc.close();
	}


}
