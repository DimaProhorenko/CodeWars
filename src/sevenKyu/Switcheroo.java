package sevenKyu;

public class Switcheroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySwitch("aabacbaa"));

	}
	
	public static String mySwitch(String s) {
		String result = "";
		for (char c : s.toCharArray()) {
			switch(Character.toLowerCase(c)) {
			case 'a': result += 'b';
			break;
			case 'b': result += 'a';
			break;
			default: result += c;
			}
		}
		
		return result;
	}

}
