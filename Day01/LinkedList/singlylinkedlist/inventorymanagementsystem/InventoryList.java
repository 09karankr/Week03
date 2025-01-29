package singlylinkedlist.inventorymanagementsystem;

public class InventoryList {
    public class InventoryNode{
        String ItemName;
        int id;
        int quantity;
        double price;
        InventoryNode next;

        public InventoryNode(String itemName, int id, int quantity, double price) {
            ItemName = itemName;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }
    private InventoryNode head;
    public InventoryList(){
        this.head = null;
    }

    //add at the start
    public void addAtStart(String ItemName, int id, int quantity, double price){
        InventoryNode newNode = new InventoryNode(ItemName,id,quantity,price);
        newNode.next = head;
       head = newNode;
        System.out.println("Added at the start");
    }
    //add at the end
    public void addAtEnd(String ItemName, int id, int quantity, double price){
        InventoryNode newNode = new InventoryNode(ItemName, id, quantity, price);
        if (head == null){
            head = newNode;
        } else{
            InventoryNode temp = head;
            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added at the end");
    }
    //Add at any index
    public void addAtIndex(String ItemName, int id, int quantity, double price, int index){
        if(index==0){
            addAtStart(ItemName,id,quantity,price);
            return;

        }
        InventoryNode newNode = new InventoryNode(ItemName, id, quantity,price);
        InventoryNode temp = head;
        while(index-- > 0){
            if (temp==null){
                System.out.println("index out of bound");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("added at index " + index);

    }

    //Delete the item
    public void deleteItem(int id){
        if (head==null){
            System.out.println("Empty list !!");
            return;
        }
        if (head.id == id){
            head = head.next;
            System.out.println("Deleted!!");
        }
        InventoryNode temp = head;
        while(temp.next != null && temp.next.id==id){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Item does not exist!");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted");

    }
    // Update the quantity
    public void updateItem(int id, int newQuantity){
        InventoryNode temp = head;
        while(temp != null){
            if(temp.id == id){
                temp.quantity = newQuantity;
                System.out.println("Updated the quantity !!");
                return;
            }

        }
        System.out.println("Item not found !!!");
    }
    //Search the item using the item id and item name
    public void searchItem(int id, String ItemName){
        if(head == null){
            System.out.println("Empty list!!");
            return;
        }
        InventoryNode temp = head;
        boolean flag = false;
        do {
            if (temp.id == id || temp.ItemName.equals(ItemName)){
                System.out.println("Item id: "+temp.id+" Item name "+temp.ItemName+" Item price : "+temp.price+" quantity "+temp.quantity);
                flag = true;
                return;
            }
            temp = temp.next;
        }
        while(temp!= null);
        if (!flag){
            System.out.println("Item not found");
        }
    }

    public double calculateTotal(){
        double total =0;
        InventoryNode temp = head;
        do {
            total += (temp.price * temp.quantity);
            temp = temp.next;
        }
        while (temp != null);
        return total;
    }
    public void totalValue(){
        System.out.println("Total value of inventory = " + calculateTotal());
    }

    // sorting using mergesort
     private InventoryNode mergeSort(InventoryNode head, boolean sortByName){
         if (head == null || head.next == null){
             return head;
         }
         InventoryNode middle = getMiddle(head);
         InventoryNode middleNext = middle.next;
         middle.next = null;

         InventoryNode left = mergeSort(middle, sortByName);
         InventoryNode right = mergeSort(middleNext, sortByName);

         return merge(left, right, sortByName);
     }

    private InventoryNode merge(InventoryNode left, InventoryNode right , boolean sortByName){
        if(left == null) return right;
        if(right == null) return left;

        if((sortByName && left.ItemName.compareTo(right.ItemName) < 0  || (!sortByName && left.price <= right.price))){

            left.next = merge(left.next, right, sortByName);
            return left;

        }
        else{
            right.next = merge(left, right.next, sortByName);
            return right;
        }
    }
    public void sortInventory(boolean sortByName){
        head = mergeSort(head, sortByName);
    }
    private InventoryNode getMiddle(InventoryNode head){

        InventoryNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    }

