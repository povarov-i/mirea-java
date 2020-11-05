public class Catalog {
    private int totalInCart;
    private Furniture[] productsList;

    public Furniture[] getProductsList() {
        return productsList;
    }

    public void setProductsList(Furniture[] productsList) {
        this.productsList = productsList;
    }

    public void buyProduct(int n) {
        int productPrice = productsList[n].getPrice();
        totalInCart += productPrice;
        productsList[n].purchase();
        System.out.println("Total amount: " + totalInCart + " rubles.");
    }

    public void showProductList() {
        for (int i = 0; i < productsList.length; i++) {
            String thisProductName = productsList[i].getName();
            int thisProductPrice = productsList[i].getPrice();
            System.out.println(i + ". " + thisProductName + ". Price: " + thisProductPrice + " rubles.");
        }
    }
}
