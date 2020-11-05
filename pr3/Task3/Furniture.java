public class Furniture {
    private int price;
    private String name;
    private String type;
    private boolean isBought = false;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBought() {
        return isBought;
    }

    public void purchase() {
        if (!isBought) {
            isBought = true;
            System.out.println("This product is now bought.");
        } else {
            System.out.println("This product is already bought.");
        }
    }
}
