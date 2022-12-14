package class_work_12_5;
/*	input 	4179
  
	output 	900
		 	700
   	 		100
      		400 	*/

public class Demo12 {
	public static void main(String[] args) {
		
	int n= 4179;
	for(; n>0; n=n/10){
	int r=n%10;
	System.out.println(r*100);
	
}
}
}