class Result {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int equal = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i = 0; i < arr.size() ; i++) {
            if(arr.get(i) < equal) {
                left.add(arr.get(i));
            } else if (arr.get(i) > equal) {
                right.add(arr.get(i));
            }
        }
        left.add(equal);
        left.addAll(right);
        return left;
    }

}