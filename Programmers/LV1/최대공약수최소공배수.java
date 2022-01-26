class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n<m){
            int tmp = n;
            n = m;
            m = tmp;
        }
        
        int a = n;
        int b = m;
        while(b != 0){
            int re = a % b;
            a = b;
            b = re ;
        }
        
        answer[0] = a;
        answer[1] = n*m/a;
        
        return answer;
    }
}