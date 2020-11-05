public class Human {
    private String skinColor;

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Human(String skinColor) {
        this.skinColor = skinColor;
    }

    public class Leg {
        public void getLegColor(String skinColor) {
            System.out.println("Leg's color is " + skinColor);
        }
    }

    public class Hand {
        public void getHandColor(String skinColor) {
            System.out.println("Hand's color is " + skinColor);
        }
    }
    public class Head {
        public void getHeadColor(String skinColor) {
            System.out.println("Head's color is " + skinColor);
        }
    }
}



