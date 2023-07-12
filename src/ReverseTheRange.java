import java.util.Scanner;

public class ReverseTheRange {
    static int[] reverseTheRange(int[] A, int B, int C){
        while(B<C){
            A[C] = A[B] + A[C];
            A[B] = A[C] - A[B];
            A[C] = A[C] - A[B];
            B++;
            C--;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter start: ");
        int B = scanner.nextInt();
        System.out.print("Enter end: ");
        int C = scanner.nextInt();
        array = reverseTheRange(array, B, C);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
