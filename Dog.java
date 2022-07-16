public class Dog {
    // variable
    static String name;
    static String breed;
    static String color;
    static int age;

    // Constructor
    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;

    }

    // Method 1

    public String getName() {
        return name;
    }

    // Method 2
    public String getBreed() {
        return breed;
    }

    // Method 2
    public String getColor() {
        return color;
    }

    // Method 2
    public int getAge() {
        return age;
    }

    public String toString() {

        return ("Hi my name is " + this.getName() +
                ".\nMy breed,age and color are " +
                this.getBreed() + "," + this.getAge() +
                "," + this.getColor());

    }

    public static void main(String[] args) {
        Dog obj = new Dog("Jhon", "papilion", "white", 4);
        prln(obj.toString());
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

}
