class Solution {
    public int solution(int X, int Y, int D) {

        double y = (double)Y;
        double x = (double)X;
        double d = (double)D;

        double calculate = (y-x)/d;
        double round = Math.ceil(calculate);
        int result = (int)round;
        return result;
    }
}