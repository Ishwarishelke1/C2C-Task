import java.util.HashMap;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (hm.containsKey(c1)) {
                if (hm.get(c1) != c2) {
                    return false;
                }
            } else {
                if (hm.containsValue(c2)) {
                    return false;
                }

                hm.put(c1, c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}