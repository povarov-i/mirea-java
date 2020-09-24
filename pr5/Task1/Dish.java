public abstract class Dish {
    private String material;
    private boolean fragile;

    public abstract void isFragile(boolean fragile);
    public abstract void whichMaterial(String material);

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }
}





