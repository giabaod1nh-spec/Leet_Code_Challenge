import java.util.Arrays;
import java.util.Scanner;

class Henshin{
    public void merge(int[] nums1 , int m , int[]  nums2 , int n ){
        int mdix = m -1 ; 
        int nidx = n -1 ; 
        int right = m + n -1 ; 
        while (nidx >= 0 ) {
            if (mdix >= 0  && nums1[mdix] > nums2[nidx]) {
                nums1[right] = nums1[mdix]; 
                mdix--; 
            }else{
            nums1[right] = nums2[nidx];
            nidx--;
        }
        right--; 
    }
}
    public static void main(String[] args) {
        Henshin h = new Henshin(); 
        Scanner sc = new Scanner(System.in); 
        int m = sc.nextInt(); 
        sc.nextLine(); 
        int[] nums1 = new int[m];
        for(int j = 0 ; j < m ; j ++){
            nums1[j] = sc.nextInt(); 
        }
        int n = sc.nextInt(); 
        sc.nextLine(); 
        int[] nums2 = new int[n]; 
        for(int k = 0 ; k < n ; k ++){
            nums2[k] = sc.nextInt(); 
        }
        h.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        sc.close(); 
    }
}