class Solution {
    public int hIndex(int[] citations) {
    
        int index=0;
        Arrays.sort(citations);

        for(int i=0; i< citations.length/2; i++){
            int temp= citations[i];
            citations[i]= citations[citations.length-1-i];
            citations[citations.length-1-i]= temp;
        }

        for(int i=0; i<citations.length; i++){
            if(citations[i] >= i+1){
                index++;
            }

            else{
                break;
            }
        }
        return index;
    }
}