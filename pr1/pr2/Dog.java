public class Dog {
    private String breed;
    private int age;
    private String color;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Порода Собаки: " + breed + "\n" + "Цвет Собаки: " + color + "\n" + "Возраст Собаки: " + age + " собачьих лет = " + (age * 7) + " человеческих лет. " + "\n";
    }
}
