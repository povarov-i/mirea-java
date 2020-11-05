import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        Furniture table = new Furniture();
        Furniture closet = new Furniture();
        Furniture wardrobe = new Furniture();
        Furniture chair = new Furniture();
        Furniture fridge = new Furniture();

        Catalog catalog = new Catalog();

        table.setName("Table");
        closet.setName("Closet");
        wardrobe.setName("Wardrobe");
        chair.setName("Chair");
        fridge.setName("Fridge");

        table.setPrice(1999);
        closet.setPrice(2999);
        wardrobe.setPrice(8999);
        chair.setPrice(749);
        fridge.setPrice(24999);

        Furniture[] productList = new Furniture[5];

        productList[0] = table;
        productList[1] = closet;
        productList[2] = wardrobe;
        productList[3] = chair;
        productList[4] = fridge;

        catalog.setProductsList(productList);
        catalog.showProductList();
        System.out.println("Please choose your product: ");
        choice = in.nextInt();

        catalog.buyProduct(choice);

    }
}
