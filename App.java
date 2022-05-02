public class App {
    public static void main(String[] args) throws Exception {
        int[] list = { 45, 24, 34, 25, 30, 16, 4, 5 };

        // selectionSort(list, 0); //递归
        selectionSort(list); // for循环

        for (int item : list) {
            System.out.print(item + " ");
        }
    }

    public static void selectionSort(int[] list, int i) { // 递归方法
        if (list.length > 1 && i < list.length - 1) {
            int minIndex = getMin(list, i, list.length); // 获得index>=i之后的最小值下标（关键）
            int tmp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = tmp; // 将下标 >=i 之后的最小值下标与 list[i] 进行交换
            selectionSort(list, ++i); // 将下标 >i 之后的数组进行与上面相同的操作
        }

    }

    public static void selectionSort(int[] list) { // for循环
        if (list.length > 1) {
            for (int index = 0; index < list.length - 1; index++) {
                int minIndex = getMin(list, index, list.length);
                int tmp = list[index];
                list[index] = list[minIndex];
                list[minIndex] = tmp;
            }
        }
    }

    public static int getMin(int[] list, int start, int end) {
        int minIndex = start; // 设置当前最小值下标为start
        for (int i = start + 1; i < end; i++) {
            if (list[i] < list[minIndex]) {// 设置当前最小值的下标
                minIndex = i;
            }
        }
        return minIndex;
    }
}
