// Write a java program to proof that JVM is creating internal classes for diffent types array objects.

public class Ex1 {
    public static void main(String[] args) {
        
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.getClass().getName());

        int arr1[] = new int[5];
        System.out.println(arr1.getClass().getName()); 

        Integer arr2[] = new Integer[5];
        System.out.println(arr2.getClass().getName());

        float arr3[] = new float[5];
        System.out.println(arr3.getClass().getName());

        Float arr4[] = new Float[5];
        System.out.println(arr4.getClass().getName());
    }
}
