public class Runner {
    public static void main(String[] args) {

        int[] randIntArr = SortingUtil.randIntArr(10);

        int[] beforeArray = randIntArr;
        System.out.println("Before: ");
        System.out.println(SortingUtil.printArray(randIntArr));

        long time = System.nanoTime();
        SortingUtil.bubbleSort(randIntArr);
        time = System.nanoTime() - time;

        SortingUtil.bubbleSort(randIntArr);

        System.out.println("After: ");
        System.out.println(SortingUtil.printArray(randIntArr));
        SortingUtil.printArray(randIntArr);
        int[] afterArray = randIntArr;

        System.out.println("Time Taken: " + time);

        if (!SortingUtil.isSorted(randIntArr) || !SortingUtil.checkSum(beforeArray, afterArray)) {
            System.out.println("This sorter sux :/");
        }
    }
}
