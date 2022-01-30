import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int result = 0;
        for(int i=0; i<a; i++){
            result +=month[i];
        }
        result+=b-1;
        int week = (result%7)+2;
        String answer = day[week];
        return answer;
    }
}