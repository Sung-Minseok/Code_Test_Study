class Solution {
    public int solution(int n) {
        int num = n-1;
        int answer = 0;
        for (int i=2; i <= (int)Math.sqrt(num); i++){
            if(num%i==0){
                return i;
            }
        }
        return num;
    }
}