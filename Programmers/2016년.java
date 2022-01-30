import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int result = 0;
        for(int i=0; i<a-1; i++){
            result +=month[i];
        }
        result+=b-1;
        int week = (result%7);
        String answer = day[week];
        return answer;
    }
}