class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int minBribes = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - i > 3) {
                System.out.println("Too chaotic");
                return ;
            }
            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) minBribes++;
            }
        }
        System.out.println(minBribes);
    }
}

