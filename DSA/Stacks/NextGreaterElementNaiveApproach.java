package Stacks;

public class NextGreaterElementNaiveApproach {
    public static void main(String args[]) {
        int []arr={10,5,13,2,6,3};
        int size= arr.length;
        nextGreater(arr,size);

    }

    private static void nextGreater(int[] arr, int size) {
        for(int i=0;i<size;i++) {
            boolean flag=false;
            for(int j=i+1;j<size;j++) {
                if(arr[j]>arr[i]) {
                    System.out.print(arr[j]+" ");
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                System.out.print("-");
        }
    }
}
