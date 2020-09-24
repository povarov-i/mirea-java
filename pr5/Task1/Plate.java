public class Plate extends Dish {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
}
