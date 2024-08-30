package api;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12A34B5AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    static int count(String src, String target) {
        // String count[] = src.split(target);
        // if (count.length != 1) {
        // return count.length;
        // }

        int pos = 0;
        int count = 0;

        while ((pos = src.indexOf(target, pos)) != 1) {
            count += 1;
            pos += target.length();
        }

        return count;

    }
}
