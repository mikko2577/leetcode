class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int finalX = num;
        for(int i = 0; i < t; i++){
            finalX = finalX + operation(num);
        }
        return finalX;
    }
    public static int operation(int num){
        // num + 1 = x - 1; (max)
        // num + 1 = x + 1;
        // num - 1 = x - 1;
        // num - 1 = x + 1;
        int x = 2;
        return x;
    }
}