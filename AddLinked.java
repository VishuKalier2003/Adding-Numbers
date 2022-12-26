/* Problem:- Given Two Linked List which are non empty representing two non-negative integers... The digits are stored in reverse order, and each of their node contains a single digit... Add the two numbers and return their sum as an integer... */
import java.util.Scanner;
public class AddLinked
{
    public class Node
    {
        public String number;
        public Node next;
        public Node(String val)
        {
            this.number = val;
            this.next = null;
        }
    }
    Node head = null;                 // Head pointer...
    public String Insert(String val, String value)
    {
        Node x = new Node(val);
        if(head == null)
        {
            head = x;
            value = x.number + value;
            return value;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = x;
        value = x.number + value;
        x.next = null;
        return value;
    }
    public void PrintList()
    {
        Node temp = head;
        while(temp.next != null)
        {
            System.out.print(temp.number+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.number);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AddLinked list1 = new AddLinked();
        AddLinked list2 = new AddLinked();
        String value1 = "", value2 = "";
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value1 = list1.Insert("9", value1);
        value2 = list2.Insert("9", value2);
        value2 = list2.Insert("9", value2);
        value2 = list2.Insert("9", value2);
        value2 = list2.Insert("9", value2);
        System.out.println("The first number is : "+value1);
        System.out.println("The Second number is : "+value2);
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int sum = val1 + val2;
        System.out.println("The Sum of the Two Numbers is : "+sum);
        System.out.println("The First Number List : ");
        list1.PrintList();
        System.out.println("The Second Number list : ");
        list2.PrintList();
        sc.close();
    }
}