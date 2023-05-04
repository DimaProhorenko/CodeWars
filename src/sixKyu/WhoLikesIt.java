package sixKyu;

public class WhoLikesIt {

	public static void main(String[] args) {
		
		System.out.println(getWhoLikesIt("Alex", "Jacob", "Mark", "Max"));
	}
	
	
	public static String getWhoLikesIt(String... a) {
	       String message = "no one";
			String ending = " like this";
			
	    if (a.length == 0) {
	      ending = " likes this";
	    }
			else if (a.length == 1) {
				message = a[0];
				ending = " likes this";
			}	
			else if (a.length == 2) {
				message = a[0] + " and " + a[1];
			}
			else if (a.length == 3) {
				message =a[0] + ", " + a[1] + " and " + a[2];
			}	
			else if (a.length > 3) {
				message = String.format("%s, %s and %d others", a[0], a[1], a.length-2);
			}
			
			return message + ending;
	    }
}