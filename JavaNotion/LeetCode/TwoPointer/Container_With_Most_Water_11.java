package JavaNotion.LeetCode.TwoPointer;

import java.util.Scanner;

class Soda {
    public int maxArea(int[] height){
        int left = 0 ;
        int right = height.length -1 ;
        int area  = 0 ;
        while(left < right){
            int heighRectangle  = Math.min(height[left] , height[right]);
            int widthRectangle = right - left ;
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            int tempArea = heighRectangle * widthRectangle;
            if(tempArea > area){
                area = tempArea;
            }
        }
        return area;
    }
}

public class Container_With_Most_Water_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu cua height[]: ");
        int n = sc.nextInt();
        //Khoi tao height[]
        int height[] = new int[n];
        System.out.println("Nhap cac phan tu trong height[]: ");
        for(int i = 0 ; i < height.length ; i++){
            height[i] = sc.nextInt() ;
        }

        Soda soda = new Soda();
        System.out.println(soda.maxArea(height));
    }
}
