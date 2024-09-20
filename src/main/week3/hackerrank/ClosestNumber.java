class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        int sum = Math.abs(arr.get(0) - arr.get(1));
        int a= -20,b = 30;
        for(int i = 0 ; i< arr.size();i++){
            for(int j = i+1;j<arr.size();j++){
                int h = Math.abs(arr.get(i) - arr.get(j));
                if(h<sum){
                    sum = h;
                    a = arr.get(i);
                    b = arr.get(j);
                }
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(Math.min(a,b));
        result.add(Math.max(a,b));
        return result;
    }

}