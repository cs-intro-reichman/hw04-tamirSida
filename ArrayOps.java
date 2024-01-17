public class ArrayOps {
    public static void main(String[] args) {
     
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

    //create an array to store the number and its index
    public static int [] maxValueIndex(int [] array) {
        int [] arr = array;
        int n = arr.length;
        int bignum = arr[0];
        int index=0;
        int [] bigindex = new int [2];
        for(int i=0; i<n; i++){
            if(arr[i]>bignum){
                bignum=arr[i];
                index =i;
            }
        }
        arr[0]=bignum;
        arr[1]=index;
        return bigindex;
    }

    public static boolean has2Max (int [] arr){
        int []bigarr =maxValueIndex(arr);
        //get the big number from array
        int bigNum=bigarr[0];
        //get the index of it from array
        int indexOfBig= bigarr[1];
        for(int i=indexOfBig+1;i<arr.length;i++){
            if(arr[i]==bigNum){
                return true;
            }
        }
        return false;
    }

    public static int secondMaxValue(int [] arr) {
        int n = arr.length;
        int [] bigarr= maxValueIndex(arr);
        int bignum = bigarr[1];
        int secondNum= 0;
        if (has2Max(arr)) {
            secondNum=bignum;
        }
        else{
            for(int i=0; i<n; i++){
                if(arr[i]>secondNum && arr[i]<bignum){
                secondNum=arr[i];
                }
             }
            }
        return secondNum;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean contain = true;
        int [] set1 = set(array1);
        int [] set2 = set(array2);
        if (set1.length!=set2.length) {
           contain=false;
        }
        else{
            for(int i=0;i<set1.length;i++){
                if (!containspec(set2,set1[i])){
                    contain=false;
                    break;
                }
            }
        } 
        return contain;
    }


    public static boolean containspec(int [] set, int value){
        for (int i=0; i<set.length;i++){
            if (set[i]==value){
                return true;
            }
        }
        return false;
    }


    public static int [] set(int [] arr){
        int [] comp = new int [countUnique(arr)];
        int index = 0;
        for (int i=0; i>arr.length; i++){
            if(!contains(arr, arr[i], i)){
                comp[index++]=arr[i];
            }
        }

        return comp;  
    }

    public static boolean contains(int [] arr, int value, int index) {
       for (int i =0; i<index; i++){
        if (arr[i]==value){
            return true;
        }
       }

        return false;
    }

    public static int countUnique (int[] arr){
        int count =0;
        for (int i=0; i<arr.length; i++){
         count = contains(arr, arr[i], i) ? count : count+ 1;  
        }
        return count;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted= (isBiggert(array)||issmaller(array));
        return sorted;
    }

    public static boolean isBiggert(int [] arr) {
        for (int i =0; i<arr.length-1; i++){
         if (arr[i]>arr[i+1]){
             return false;
         }
        }
         return true;
     }

     public static boolean issmaller(int [] arr) {
        for (int i =0; i<arr.length-1; i++){
            if (arr[i]<arr[i+1]){
                return false;
            }
           }
            return true;
     }
    
}
