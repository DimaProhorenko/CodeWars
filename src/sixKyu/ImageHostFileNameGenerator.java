package sixKyu;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ImageHostFileNameGenerator {
	private static int length = 6;
	private static List<Character> characters = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PhotoManager pm = new PhotoManager();
		System.out.println(generateName(pm));
		System.out.println(generateName(pm));
		System.out.println(generateName(pm));
		System.out.println(generateName(pm));

	}
	
	public static void generateCharacters() {
		for (int i = 65; i < 123; i ++) {
			if (i > 90 && i < 97) continue;
			characters.add((char)i);
		}
	}
	
	public static String generateName(PhotoManager pm) {
		generateCharacters();
		Random random = new Random();
		String imageName = "";
		for (int i = 0; i < length; i++) {
			imageName += characters.get(getRandomLetter(random, 0, characters.size()));
			pm.addName(imageName);
		}
		return imageName;
	}
	
	public static int getRandomLetter(Random r, int min, int max) {
		return min + r.nextInt(max - min);
	}

}


class PhotoManager {
	private List<String> names = new ArrayList<>();
	
	public void addName(String name) {
		names.add(name);
	}
	
	public boolean nameExists(String name) {
		return names.contains(name);
	}
}
