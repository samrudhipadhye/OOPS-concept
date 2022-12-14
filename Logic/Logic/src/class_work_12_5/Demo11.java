package class_work_12_5;
// input- 12345

public class Demo11 {
public static void main(String[] args) {
	
	int t=12345 ;
	for(int no=t; no>0; no=no/10){
	int r=no%10;
	for(int j=1; j<=r; j=j+1){
		System.out.print(r);
	}
    System.out.println();
}
}
}