import java.util.Arrays;

public class Recursion_part4 {
    
    //QUES-1 : {LEFT UPPER  TRIANGLE}
    // public static void main(String[] args) {
    //     pattern1(4, 0);
    // }
    // static void pattern1(int r, int c){
    //     if(r == 0){
    //         return;
    //     }
    //     if(c < r){
    //         System.out.print("*");
    //         pattern1(r, c+1);
    //     }else{
    //         System.out.println();
    //         pattern1(r-1, c=0);
    //     }
    // }


    //QUES-2 : {LEFT  LOWER  TRIANGLE}
    // public static void main(String[] args) {
    //     pattern2(4, 0);
    // }
    // static void pattern2(int r, int c){
    //     if(r == 0){
    //         return;
    //     }
    //     if(c < r){
    //         pattern2(r, c+1);
    //         System.out.print("*");
    //     }else{
    //         pattern2(r-1, c=0);
    //         System.out.println();
    //     }
    // }


    //QUES-3 : {BUBBLE_SORT}
    // public static void main(String[] args) {
    //     int[] arr={4,5,6,2,1};
    //     bubble(arr,arr.length-1,0);
    //     System.out.println(Arrays.toString(arr));
    // }
    // static void bubble(int[] arr,int r, int c){
    //     if(r == 0){
    //         return;
    //     }
    //     if(c < r){
    //         if(arr[c]> arr[c+1]){
    //             //swap
    //             int temp=arr[c];
    //             arr[c]=arr[c+1];
    //             arr[c+1]=temp;
    //         }
    //         bubble(arr,r, c+1);
            
    //     }else{
    //         bubble(arr,r-1, c=0);
    //     }
    // }   
    
    
    //QUES-4 : {SELECTION  SORT}
    public static void main(String[] args) {
        int[] arr={4,6,8,9,1,3};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int r,int c,int max){
        if(r== 0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr, r-1, c=0, max=0);
        }
    }
}
