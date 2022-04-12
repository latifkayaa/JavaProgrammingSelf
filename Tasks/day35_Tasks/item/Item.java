package day35_Tasks.item;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }
    // name can not be empty or blank
    // name can not contain any special characters other than space
    // name must start with letters

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || !(Character.isLetter(name.charAt(0)))) {
            System.err.println("Either empty, blank or name doesn't start with a letter.");
            return;
        }
        for (char each : name.toCharArray()) {
            if (!(Character.isLetterOrDigit(each)) && !(each == ' ')) {
                System.err.println("Name contains special character other than 'space'.");
                return;
            }
        }
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice <= 0) {
            System.err.println("Invalid unit price: " + unitPrice);
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Invalid quantity: " + quantity);
            return;
        }
        if (name.equalsIgnoreCase("toilet paper") && quantity > 1) {
            System.err.println("Toilet paper can't be bought more than 1.");
            return;
        }
        this.quantity = quantity;
    }

    public int calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost= $" + calcCost() +
                '}';
    }
}
