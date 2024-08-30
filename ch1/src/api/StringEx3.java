package api;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park" };

        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                return "Kim 은 " + (i + 1) + "번째에 있다";
            }
        }
        return "Kim 없다";
    }
}
