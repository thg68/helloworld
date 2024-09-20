    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        int t = 0;
        PriorityQueue<Integer> arr = new PriorityQueue<>(A);
        while(arr.size() >= 2 && arr.peek() < k) {
            int temp = arr.poll();
            temp += arr.poll()*2;
            arr.add(temp);
            t++;
        }
        if(arr.size() < 2 && arr.peek() < k) return -1;
        return t;
    }

