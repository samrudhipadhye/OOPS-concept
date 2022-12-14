package class_work_12_5;
// input- 4179

public class Demo10 {
public static void main(String[] args) {
	
	int no=4179;
	int r; 
	for(no=4179; no>0; no=no/10){
	 r=no%10; 
	System.out.println(r); 
	}
	System.out.println();
		
	
////
	System.out.println("=============");
	
	int n=12345;
	int re,sum=0;
	while (n>0){
		re=n%10;
		n=n/10;
		sum=(sum*10)+re;
	}
		System.out.print(sum);
	}



	}
