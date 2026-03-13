import java.util.*;

public class BucketSort {

    public static void sort(int[] arr){

        int n = arr.length;

        if(n<=0)
            return;

        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        int bucketCount = n;

        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[bucketCount];

        for(int i=0;i<bucketCount;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int num : arr){

            int index = (num-min)*(bucketCount-1)/(max-min);
            buckets[index].add(num);

        }

        int k=0;

        for(List<Integer> bucket : buckets){

            Collections.sort(bucket);

            for(int num : bucket){
                arr[k++] = num;
            }

        }

    }

}