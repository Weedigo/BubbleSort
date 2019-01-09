public class SortingUtil {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }


    public static void bubbleSort(int[] arr)
    {
        int x=arr.length;
        for(int i=0; i<x-1; i++)
        {
            for(int j=0; j<x-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static int[] randIntArr(int Count) {
        int[] array = new int[Count];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Count + 1);
        }
        return array;
    }


        public static boolean isSorted(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after)
    {
        int sum1 = 0;
        int sum2 = 0;
        if (before.length != after.length)
        {
            return false;
        } else {
            for (int i = 0; i < before.length; i++)
            {
                sum1 += before[i];
                sum2 += after[i];
            }
            if (sum1 != sum2)
            {
                return false;
            }
            return true;
        }
    }

    public static String printArray(int[] arr)
    {
        String result = "";
        for(int i=0; i<arr.length; i++)
        {
            result = result + "[" + arr[i] + "] ";
        }
        return result;
    }


}