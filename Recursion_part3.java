import java.util.ArrayList;

public class Recursion_part3 {
    QUES-1 : {SORTED  ARRAY}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]< arr[index+1] && sorted(arr, index+1);
    }


    //QUES-2 : {LINEAR  SEARCH}

    public static void main(String[] args) {
        int[] arr={1,5,8,6,9,4,0};
        System.out.println(find_element(arr, 5, 0));
        System.out.println(find_target(arr, 5, 0));
        System.out.println(find_targetfromlast(arr, 5, arr.length-1));
    }

    static boolean find_element(int[] arr,int target,int index){
        if(index== arr.length){
            return false;
        }
        return arr[index] ==target || find_element(arr,target,index+1);
    }

    static int find_target(int[] arr,int target,int index){
        if (index== arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return find_target(arr,target,index+1);
        }
    }

    static int find_targetfromlast(int[] arr,int target,int index){
        if (index== -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return find_targetfromlast(arr,target,index-1);
        }
    }


    QUES-3 : {LINEAR  SEARCH  FOR  MULTIPLE  OCCURANCE}

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,4,7};
        findallindex(arr, 4, 0);
        System.out.println(list);
    }
    static ArrayList <Integer> list=new ArrayList<>();
    static void findallindex(int[] arr,int target,int index){
        if(index ==arr.length){
            return ;
        }
        if( arr[index]==target){
            list.add(index);
        }
        findallindex(arr, target, index +1);
    }


    QUES-4 : {RETURN  AN  ARRAYLIST}
    public static void main(String[] args) {
        int[] arr={1,3,4,5,2,4};
        ArrayList<Integer> ans= findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans); 
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index +1, list);
    }


    QUES-5 : {RETURN  THE  LIST  WITHOUT  PASSING  THE  ARGUMENT}

    public static void main(String[] args) {
        int[] arr={1,5,8,7,5,2,3};
        System.out.println(findAllIndex(arr, 5, 0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBeforeCalls=findAllIndex(arr, target, index+1);
        list.addAll(ansFromBeforeCalls);
        return list;
    }


    QUES-6 : {ROTATED  BINARY  SEARCH }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if( arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>= arr[s] && target<= arr[m]){
                return search(arr,target,s,m-1);
            }
            else{
                return search(arr, target, s=m+1, e);
            }
        }

        if(target >= arr[m] && target <=arr[e]){
            return search(arr, target, s=m+1, e);
        }
        return search(arr,target,s,m-1);
    }
    
}
