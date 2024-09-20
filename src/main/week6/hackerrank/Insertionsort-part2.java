class Result {

    public static void printArray(List<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\n");
    }

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for(int i = 1; i < n; i++){
            int num = arr.get(i);
            int j;
            for(j = i - 1; j >= 0 && arr.get(j) > num; j--){
                arr.set(j + 1, arr.get(j));
            }
            arr.set(j + 1, num);
            printArray(arr);
        }
    }

}
