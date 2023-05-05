package sixKyu;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ConsecutiveStrings {

  public static String longestConsec(String[] strArr, int k) {
    return (k > 0 && strArr.length > 0 && k <= strArr.length) ?
      IntStream.rangeClosed(0, strArr.length - k)
        .mapToObj(i -> IntStream.range(0, k).mapToObj(j -> strArr[i + j]).collect(Collectors.joining()))
        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
        .findFirst().get()
      : "";
  }
}
