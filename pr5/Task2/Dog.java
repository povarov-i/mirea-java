public abstract class Dog {
    private int weight;
    private boolean isBig;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public abstract void isDogBig(boolean isBig);
    public abstract void showWeight(int weight);
}
