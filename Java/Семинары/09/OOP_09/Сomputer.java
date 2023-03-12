package OOP_09;

public class Сomputer implements Comparable<Сomputer> {
    public String model;
    public String CPU;
    public int price;
    public int RAM;

    public Сomputer (String model, String CPU, int price, int RAM) {
        this.model = model;
        this.CPU = CPU;
        this.price = price;
        this.RAM = RAM;
    }

    public String fullName() {
        return String.format("%s", model);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), price, RAM);
    }

    @Override
    public int compareTo(Сomputer o) {
        if (this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;
    }

}
