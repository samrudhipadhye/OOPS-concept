package Character;

public class Exe10 {
public static void main(String[] args) {
	String s="Bingo";
	for(int i=0;i<s.length();i++){
		for(int j=0;j<=i;j++){
			System.out.print(s.charAt(j));		
		}
		System.out.println();
	}
	for(int i=s.length()-1;i>=0;i--){
		for(int j=0;j<=i;j++){
			System.out.print(s.charAt(j));		

	}
		System.out.println();
}
}
}