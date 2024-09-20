class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int count = 0;
        for(int i = 0 ; i<arr.size();i++){
            if(Math.abs(arr.get(i) - arr.get(j)) == k){
                count ++;
            }
            else if(Math.abs(arr.get(i) - arr.get(j)) > k){
                break;
            }
        }
        return count;

    }
}