package homeworkweek9;

/*Write a Java program to reverse an array of integer values.*/
public class Program_3_ReverseArray {
    public static void main(String[] args) {
        //initalize array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }


}
