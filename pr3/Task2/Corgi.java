public class Corgi extends Dog {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void isDogBig(boolean isBig) {
        if(isBig == true) {
            System.out.println("This dog is big");
        } else {
            System.out.println("This dog is small");
        }
    }

    @Override
    public void showWeight(int weight) {
        System.out.println("This dog weighs " + weight + "kg.");
    }

    public void showColor(String color) {
        System.out.println("Color of this dog is " + color);
    }
}
