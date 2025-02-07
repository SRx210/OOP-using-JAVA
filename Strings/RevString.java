public class RevString {

    static void reverse_string(String word)
    {
        StringBuilder rev = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--)
        {
            rev.append(word.charAt(i));
        }

        System.out.println(rev.toString());
    }

    public static void main(String[] args) {
        reverse_string("apple");
    }
}
