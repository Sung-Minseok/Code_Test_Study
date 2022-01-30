import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(arrList.isEmpty()){
                arrList.add(arr[i]);
                continue;
            }
            if(arrList.get(arrList.size()-1)!=arr[i]){
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i=0; i<arrList.size();i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}