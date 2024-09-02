// import java.util.Vector;
// public class Vector {
//     public static void main(String a[])
//     {
//         Vector<Integer> vector = new Vector<>(3,2);
//         Scanner inp=new Scanner(System.in);
//         int size;
//         System.out.println("Enter the size ");
//         size=inp.nextInt();
//         for(int i=0;i<size;i++)
//         {
//             int element = inp.nextInt();
//             vector.add(element);
//         }
//     }
// }

import java.util.Vector;

public class VectorExample{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);

        // Add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // Insert an element at index 1
        v.insertElementAt(0, 1);

        // Remove the element at index 2
        v.removeElementAt(2);

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }
    }
}