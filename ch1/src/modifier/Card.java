package modifier;

public class Card {
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("Heart", 2);
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
