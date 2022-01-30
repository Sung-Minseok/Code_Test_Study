class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String format = "%"+n+"s";
            map1[i] = String.format(format,Integer.toBinaryString(arr1[i])).replace(" ","0");
            map2[i] = String.format(format,Integer.toBinaryString(arr2[i])).replace(" ","0");
            String s = "";
            for(int j=0;j<n;j++){
                if(map1[i].charAt(j)=='0' && map2[i].charAt(j)=='0'){
                    s+=" ";
                }else{
                    s+="#";
                }
            }
            answer[i] = s;
        }
        
        
        return answer;
    }
}