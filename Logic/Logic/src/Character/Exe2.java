package Character;
/* 999999999
   88888888
   7777777
   666666
   55555
   4444
   333
   22
   1
   22
   333
   4444
   55555
   666666
   7777777
   88888888
   999999999      */

public class Exe2 {
public static void main(String[] args) {
	long no=98765432123456789l;
	
	while(no>0){
		long r=no%10;
		no=no/10;
		System.out.print(r);
		
		for(double i=1;i<r;i++){
			System.out.print(r);
		}
	System.out.println();
}
}
}
