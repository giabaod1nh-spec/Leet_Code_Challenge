import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Merge_Intervals56 {
    public int[][] merger (int [][] intervals){
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        List<int[]> merged = new ArrayList<>();

        //Khoang dau tien them vao lam diem xuat phat
        int[] current = intervals[0];   // arr dau tien nhu [1 ,4]
        merged.add(current);
        //Duyet va hop nhat
        for(int[] next : intervals){
            int currentEnd = current[1];
            int nextStart = next[0];
            int nextEnd = next[1];
            if(currentEnd >= nextStart){
                current[1] = Math.max(currentEnd , nextEnd);
            }else{
                current = next;
                merged.add(current);
            }
        }
        return merged.toArray(new int [merged.size()][]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu arr trong mang la:");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Nhap vao start " + i);
             intervals[i][0] = sc.nextInt();
            System.out.println("Nhap vao end " + i);
            intervals[i][1] = sc.nextInt();
        }
        Merge_Intervals56 obj = new Merge_Intervals56();
        obj.merger(intervals);
        for(int j = 0 ; j < intervals.length; j++){
            System.out.println("[" + intervals[j][0] + "," + intervals[j][1] + "]");
        }
        sc.close();
    }
}
