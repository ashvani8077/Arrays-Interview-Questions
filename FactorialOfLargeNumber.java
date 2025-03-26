import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        int n = 5000;
        List<Integer> result = solution(n);
        for (int digit : result) {
            System.out.print(digit);
        }
    }

    public static List<Integer> solution(int n) {
        int arr[] = new int[20000];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        int size = 1;

        for (int multiplier = 2; multiplier <= n; multiplier++) {
            size = multiply(arr, size, multiplier);
        }

        List<Integer> li = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            li.add(arr[i]);
        }

        return li;
    }

    public static int multiply(int arr[], int size, int multiplier) {
        int carry = 0;

        for (int i = 0; i < size; i++) {
            int res = multiplier * arr[i] + carry;
            arr[i] = res % 10;
            carry = res / 10;
        }

        while (carry > 0) {
            arr[size] = carry % 10;
            carry /= 10;
            size++;
        }
        return size;
    }
}
