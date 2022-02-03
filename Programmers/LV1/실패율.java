import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage_remain = new double[N+1];
        double[] stage_clear = new double[N+1];
        double[] stage_fail = new double[N+1];
        HashMap<Integer, Double> map = new HashMap<>();
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<stages[i]; j++){
                stage_clear[j]+=1;
            }
            stage_remain[stages[i]-1]+=1;
        }
        for(int i=0; i<N; i++){
            if(stage_clear[i]!=0){
                stage_fail[i]=stage_remain[i]/stage_clear[i];
            }else{
                stage_fail[i]=0;
            }
            map.put(i+1,stage_fail[i]);
        }
        List<Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        for(int i=0; i<N; i++){
            answer[i] = list.get(i).getKey();
        }
        return answer;
    }
}