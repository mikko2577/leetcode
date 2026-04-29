class Solution {
    public int scoreOfString(String s) {
        // System.out.println(s);
        // System.out.println(Abs('c','a'));
        int result = find(s);
        return result;
    }
    public static int Abs(int a, int b){
        int result = a-b;
        if(result>0){
            return result;
        }
        else{
            return result*(-1);
        }
    }
    public static int find(String s){
        int result = 0;
        for(int i = 1;i<s.length();i++){
            // System.out.print("24"+s.charAt(i-1));
            // System.out.println(s.charAt(i));    
            char a = s.charAt(i-1);
            char b = s.charAt(i);
            // System.out.println(Abs(a,b));
            result = result + Abs(a,b); 
        }
        System.out.println(result);  
        return result;
    }
    
}