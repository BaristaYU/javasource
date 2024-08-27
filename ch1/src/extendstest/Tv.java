package extendstest;

public class Tv {
    private String color;
    private int channel;
    private boolean power;

    void power() {
        this.power = !this.power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    public String getColor() {
        return color;
    }

    public void setChannel(int channel) {
        if (channel < 0 || channel > 100) {
            return;
        }
        this.channel = channel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower() {
        return power;
    }

    public int getChannel() {
        return channel;
    }

}
