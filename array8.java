import java.util.*;

public class array8 {
    public static void main(String[] args) {
        int element = Integer.MIN_VALUE, max_count=1, count=1;
        int arr[] = {2, 4, 6, 4, 2, 4, 5, 8};
        Arrays.sort(arr);


        //loop through the array elements
        for(int i=1; i<arr.length; i++){
            //count the successive elements as long as they are same
            if(arr[i] == arr[i-1])
                count++;

            if(arr[i] != arr[i-1] || i==arr.length-1){
                if(count>max_count){
                    max_count = count;
                    element = arr[i-1];
                }
                count =1;
            }
        }
        System.out.println(element+": "+max_count);
    }
}