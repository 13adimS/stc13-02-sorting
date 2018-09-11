public class BubbleSort {
    public static void main(String[] args) {
        Integer []m = {34, 67, 23, 68, 1, 3, 90, 45, 16, 23, 82, 12 };

        for (int i = 0; i < m.length; i++) {
            int num = m[i];

            for (int j = i-1; j>=0; j--) {
                int leftNumber = m[j];

                if (num < leftNumber) {
                    m[j+1] = leftNumber;
                    m[j] = num;
                } else {
                    break;
                }
            }
        }
        for (Integer n : m) {
            System.out.println(n + ",");
        }
    }
}
