public class Solution {
    public static void printArray(List<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\n");
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        for(int i = 1; i < n; i++){
            int num = arr.get(i);
            int j;
            for(j = i - 1; j >= 0 && arr.get(j) > num; j--){
                arr.set(j + 1, arr.get(j));
                printArray(arr);
            }
            arr.set(j + 1, num);
        }
        printArray(arr);

    }
}