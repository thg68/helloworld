class SherlockandArrays {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int tongfull = 0;
        for(int i=0;i<arr.size();i++)
        {
            tongfull += arr.get(i);
        }
        int trai = 0;
        for(int i=0;i<arr.size();i++)
        {
            tongfull -= arr.get(i);
            if(tongfull == trai){
                return "YES";
            }
            else
                trai += arr.get(i);

        }
        return "NO";
    }

}