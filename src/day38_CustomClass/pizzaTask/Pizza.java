package day38_CustomClass.pizzaTask;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 :(size == 'M') ? 12 : 14;
        double priceOfToppings = 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
        return (startingPrice + priceOfToppings)* 1.08; // including the tax
    }

    public String toString() {
        return "Pizza{" +
                "size= " + size +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping= " + numberOfPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }
}
