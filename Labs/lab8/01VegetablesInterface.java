package LAB.lab8;

abstract class Vegetable {

    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public String toString() {
        return "Vegetable: " + getVegetableName() + ", " + color;
    }

    abstract String getVegetableName();
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    public String getVegetableName() {
        return "Potatoes";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    public String getVegetableName() {
        return "Brinjals";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    public String getVegetableName() {
        return "Tomatoes";
    }
}

class _01Vegetable {
    public static void main(String[] args) {
        Vegetable Potato1 = new Potato("brown");
        Vegetable Brinjal1 = new Brinjal("purple");
        Vegetable Tomato1 = new Tomato("red");
        System.out.println(Potato1);
        System.out.println(Brinjal1);
        System.out.println(Tomato1);
    }
}
