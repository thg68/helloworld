class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        List<Integer> a = new ArrayList<>(100);
        for(int i = 0; i< 100;i++) {
            a.add(0);
        }

        for(int i = 0; i< 100;i++) {
            for(int j = 0 ; j<n;j++) {
                if(arr.get(j) == i) {
                    a.set(i, a.get(i) + 1);
                }
            }
        }

        return a;
    }

}