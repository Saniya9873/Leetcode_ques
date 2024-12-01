import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Recursion_part5 {

    //Skip a character:
    // public static void main(String[] args) {
    //     skip("", "baccdah");
    // }
    // static void skip(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch=up.charAt(0);
    //     if(ch=='a'){
    //         skip((p), up.substring(1));
    //     }
    //     else{
    //         skip(p+ ch, up.substring(1));
    //     }
    // }

    //Return a String:
    // public static void main(String[] args) {
    //     System.out.println(skip("baccdaha  "));
    // }
    // static String skip(String up){
    //     if(up.isEmpty()){
    //         return "";
    //     }
    //     char ch=up.charAt(0);
    //     if(ch=='a'){
    //         return skip(up.substring(1));
    //     }   
    //     else{
    //         return ch + skip(up.substring(1));
    //     } 
    // }

    //Skip a String :
    // public static void main(String[] args) {
    //     System.out.println(skipapple("nbhyfvmnkapplenjuyfsb"));
    // }
    // static String skipapple(String up){
    //     if(up.isEmpty()){
    //         return "";
    //     }
    //     if(up.startsWith("apple")){
    //         return skipapple(up.substring(5));
    //     }
    //     else{
    //         return up.charAt(0)+ skipapple(up.substring(1));
    //     }
    // }

    //Skip a string if its not the required string : 
    // public static void main(String[] args) {
    //     System.out.println(skipAppNotApple("bachsaappniuhnd"));
    // }
    // static String skipAppNotApple(String up){
    //     if(up.isEmpty()){
    //         return "";
    //     }
    //     if(up.startsWith("app") && !up.startsWith("apple")){
    //         return skipAppNotApple(up.substring(5));
    //     }
    //     else{
    //         return up.charAt(0)+ skipAppNotApple(up.substring(1));
    //     }
    // }

    //Printing  SUBSETS [ARRAYLIST] :
    // public static void main(String[] args) {
    //     System.out.println(subseq("", "ab"));
    // }
    // static  ArrayList<String> subseq(String p,String up ){
    //     if(up.isEmpty()){
    //         ArrayList<String> list=new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     char ch=up.charAt(0);
    //     ArrayList<String> left =subseq(p+ch , up.substring(1));
    //     ArrayList<String> right =subseq(p, up.substring(1));
    //     left.addAll(right);
    //     return left;
    // }


    //ASCII :
    // public static void main(String[] args) {
    //     char ch='A';
    //     System.out.println(ch+0);
    // }


    //ITERATIVE  PROGRAM  TO  PRINT  SUBSEQUENCES :[1,2,3]
    // public static void main(String[] args) {
    //     int[] arr={1,2,3};
    //     List<List<Integer>> ans=subset(arr);
    //     for(List<Integer> list : ans){
    //         System.out.println(list);
    //     }
    // }
    // static List<List<Integer>> subset(int[] arr){
    //     List<List<Integer>> outer=new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     for(int num :arr ){
    //         int n=outer.size();
    //         for(int i=0;i<n;i++){
    //             List<Integer> internal=new ArrayList<>(outer.get(i));
    //             internal.add(num);
    //             outer.add(internal);
    //         }
    //     }
    //     return outer;  
    // }


    //COMPLEXITY :
    //        [ O(N * 2^N) ]


    // SUBSEQUENCES OF A STRING WITH DUPLICATE ELEMENTS :[1,2,2]
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetDuplicate(arr);
        for(List<Integer> list :ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr); 
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0; i< arr.length;i++){
            start=0; 
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for (int j=start ; j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
            
        }
        return outer;
    }


}
