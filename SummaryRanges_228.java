import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int [] nums){
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
          int j = 0 ;
          List<String > resultList = new ArrayList<>();
          for(int i = 0 ; i < nums.length -1 ; i++){
              if (nums[i +1] - nums[i] != 1){
                  if (j == i) {
                      resultList.add(String.valueOf(nums[j]));
                  }else{
                      resultList.add(nums[j] + "->" + nums[i]);
                  }
                  j = i + 1;
              }
          }
        int i_last = nums.length -1 ;
        if(j == i_last){
            resultList.add(String.valueOf(nums[j]));
        }else{
            resultList.add(nums[j] + "->" + nums[i_last]);
        }
          return resultList;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        SummaryRanges_228 obj = new SummaryRanges_228();
        System.out.println(obj.summaryRanges(arr));
    }
}
