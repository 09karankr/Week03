package singlylinkedlist.studentrecordmanagement;

public class SudentList {
    private class StudentNode{
        int rollNumber;
        String name;
        int age;
        char grade;
        StudentNode next;

        public StudentNode(int rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }
    private StudentNode head;
    public SudentList(){
        this.head = null;
    }

    //Add at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade ){
           StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
           newNode.next =head;
           head = newNode;
        System.out.println("added at the beginning");
    }

    //Add at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade){
         StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
         if(head == null){
             head = newNode;
         } else{
             StudentNode temp = head;
             while(temp.next != null){
                 temp = temp.next;
             }
             temp.next = newNode;
         }
        System.out.println("added at the end");
    }

    // Add at any given index
    public void addAtIndex(int rollNumber, String name, int age, char grade, int index){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(index == 0){
            addAtBeginning(rollNumber, name, age, grade);
        }
        StudentNode temp = head;
        while(index > 1){
            if(temp == null){
                System.out.println("out of bound");
                return;
            }
            temp = temp.next;
            index--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Added at the given index " + index);
    }

    //Delete using the roll number
    public void deleteUsingRoll(int rollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber == rollNumber){
            head = head.next;
            System.out.println("Deleted");
            return;
        }
        StudentNode temp = head;
        while(temp.next != null && temp.next.rollNumber != rollNumber){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Roll number not found");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted");
    }
    // Search by roll number
    public void searchByRollNumber(int rollNumber){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student Found: Roll number " + temp.rollNumber + " ,Name "+ temp.name + " ,Age: " + temp.age + " ,Grade: " + temp.grade );
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    //Display all the details of the students
    public void displayAll(){
       if (head == null){
           System.out.println("Empty list");
       }
       StudentNode temp = head;
       System.out.println("Student List: ");
       while(temp!= null){
           System.out.println("Roll number: " + temp.rollNumber + " ,Name: " + temp.name + " ,Age:" + temp.age + " ,Grade: " + temp.grade);
           temp = temp.next;
       }
    }

    //Upgrade grade of student
    public void updateGrade(int rollNumber, char newGrade){
        StudentNode temp = head;
        while(temp != null){
            if (temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
}
