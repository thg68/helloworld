public static boolean checkl (char a, char b) {
        if (a == '(' && b == ')') return true;
        else if (a == '[' && b == ']') return true;
        else if( a == '{' && b == '}') return true;
        return false;
}

public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> str = new Stack<>();
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) {
                str.push(current);
            }
            else {
                if(str.isEmpty()) {
                    return "NO";
                } else if (checkl(str.peek(),current) == false) {
                    return "NO";
                } else {
                    str.pop();
                }
            }
        }
        if(str.empty()) {
            return "YES";
        }else {
            return "NO";
        }
}