package FunctionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Item {
    String SKU;
    double price;
    String item;
    
    public Item(String SKU, double price, String item) {
        this.SKU = SKU;
        this.price = price;
        this.item = item;
    }
}

public class Biconsumer {
    public static void main(String[] args) {
        Map<String, Item> items = new HashMap<>();
        items.put("DOFO-008", new Item("DOFO-008", 10.0, "Super Doo-dad"));
        items.put("THNG-003", new Item("THNG-003", 2.99, "Thingamajig"));
        items.put("WIDG-005", new Item("WIDG-005", 6.99, "Super Widget"));
        items.put("GADG-006", new Item("GADG-006", 8.99, "Super Gadget"));
        items.put("THNG-007", new Item("THNG-007", 15.0, "Super Thingamajig"));
        items.put("WIDG-001", new Item("WIDG-001", 3.99, "Widget"));
        items.put("GADG-002", new Item("GADG-002", 5.99, "Gadget"));
        items.put("DBOO-004", new Item("DBOO-004", 4.99, "Doo-dad"));

        List<Item> itemsList = items.values().stream()
                .sorted((item1, item2) -> item1.SKU.compareTo(item2.SKU))
                .collect(Collectors.toList());

        for (Item item : itemsList) {
            System.out.println(item.SKU + " " + item.price + " " + item.item);
        }
    }
}
