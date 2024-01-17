public class ArrayOps {
    public static void main(String[] args) {
        int [] hi = {8,8,7,1};
       System.out.println("uniq" +uniqueValues(hi));
    }
    
    public static int findMissingInt (int [] array) {
        int [] arr = array;
        int arrLength = arr.length;
        //calculates the sum assumed sum
        int totalSum= (arrLength*(arrLength+1))/2;
        int ActualSum=0;
        //adds each num in the array to the empty sum
        for (int i=0; i<(arrLength); i++){
            ActualSum+= arr[i];    
        }
        //subtracts total sum from supposed sum
        totalSum-=ActualSum;
        //returns the missing int
        return totalSum;
    }

    public static int maxValue(int [] array) {
        int [] arr = array;
        int n = arr.length;
        int bignum = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>bignum){
                bignum=arr[i];
            }
        }
        return bignum;
    }

    public static int secondMaxValue(int [] array) {
        int [] arr = array;
        int n = arr.length;
        int bignum = maxValue(array);
        int secondNum= 0;
        for(int i=0; i<n; i++){
            if(arr[i]>secondNum && arr[i]<bignum){
                secondNum=arr[i];
            }
        }
        return secondNum;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static int uniqueValues(int [] array) {
        int [] arr = array;
        int n = arr.length;
        for (int i=0; i<n; i++){
            for(int j=(n-1);j>0;j--){
                if (arr[j]==arr[i]){
                    n--;
                }
            }
        }
        return n;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
