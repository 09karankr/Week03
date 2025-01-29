package singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args){
        SudentList students = new SudentList();
        students.addAtBeginning(1,"Karan", 22, 'A');
        students.addAtEnd(2,"Aryan",33,'B');
        students.addAtIndex(3,"Giraffe", 44, 'C',1);

        students.displayAll();
        students.searchByRollNumber(4);
        students.updateGrade(1,'C');
        students.displayAll();
    }
}
