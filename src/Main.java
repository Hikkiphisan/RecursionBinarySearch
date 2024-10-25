import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien so luong phan tu trong Array: ");
        int[] arrays = new int[scanner.nextInt()];
        System.out.println("Tung phan tu trong Array");
        for (int i = 0; i < arrays.length ; i++) {
            arrays[i] = scanner.nextInt();
        }

        System.out.println("Qua trinh sap xep mang bat dau");
        Arrays.sort(arrays);
        System.out.println("mang sau khi sap xep: " + Arrays.toString(arrays));

        System.out.println("Dien key: ");
        int key = scanner.nextInt();

        int first = 0;
        int last = arrays.length -1;
        int resultIndex = RecrusionBinarySearchMethod.rscrusionBinarySearch(arrays,first,last,2);

        if ( resultIndex  == -1) {
            System.out.println("Gia tri" + key+ "duoc tim thay o " + resultIndex );
        } else {
            System.out.println("Errror sort or no value");
        }
         scanner.close();
    }

}