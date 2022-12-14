package Character;

public class Exe11 {
public static void main(String[] args) {
	String s="HelloJava" ;
	int cnt=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='a')
			cnt++;
	}
	System.out.println(cnt);
}
}
