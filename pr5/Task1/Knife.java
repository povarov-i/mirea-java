public class Knife extends Dish{

    private int price;
    private boolean isSharp;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean sharp) {
        isSharp = sharp;
    }

    @Override
    public void isFragile(boolean fragile) {
        if(fragile == true) {
            System.out.println("This dish is fragile!");
        } else {
            System.out.println("This dish is not fragile.");
        }
    }

    @Override
    public void whichMaterial(String material) {
        System.out.println("This dish is made of " + material);
    }

    public void showPrice(int price) {
        System.out.println ("This dish costs " + price + "$");
    }

    public void isKnifeSharp(boolean isSharp) {
        if (isSharp == true) {
            System.out.println("This knife is sharp!");
        } else {
            System.out.println("This knife is not sharp!");
        }
    }
}
