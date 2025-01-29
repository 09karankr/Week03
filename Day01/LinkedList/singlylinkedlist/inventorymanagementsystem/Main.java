package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryList items = new InventoryList();
        items.addAtStart("Brush", 1, 10, 40);
        items.addAtEnd("Paste", 2, 2, 1000);
        items.addAtIndex("Phones", 3,12, 40000,1);

        items.searchItem(1,"Pasta");
        items.searchItem(2,"Paste");
        items.searchItem(3,"Fries");
        items.totalValue();

        items.sortInventory(false);



    }
}
