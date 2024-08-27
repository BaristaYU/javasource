package extendstest;

public class CaptionTv extends Tv {
    private boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }

}
