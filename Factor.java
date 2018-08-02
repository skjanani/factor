package janani;
import java.util.Scanner;
public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
for(i=1;i<=n;i++){
	if(n%i==0){
		System.out.println(i+" ");
	}
}
	}

}
