public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
        int num = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] < num){
                num = list[i];
            }
        }

        return true; // placeholder to avoid errors. You may need to change this.
    }

    public static boolean hasDupes(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i]) == (list[j])) ;
                {
                    return true;
                }else
                return false;
            }
        }
    }




    public static int[] leftShift(int[] nums, int shift) {

        return new int[] {}; // placeholder to avoid errors. You may need to change this.
    }
}
