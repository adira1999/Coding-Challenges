
public class DeleteElement {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newArr = new int[array.length-1];

        int targetEle = 1;

        array = deleteElement(array,targetEle);

        for(int i =0;i<newArr.length;i++ ){
            System.out.println(array[i]);
        }

    }

    private static int[] deleteElement(int[] array, int targetEle) {

        int pos = findPosition(array,targetEle);

        int[] newArr = new int[array.length-1];

        for(int i=0;i<array.length-1;i++){
            if(i < pos){
                newArr[i] = array[i];
            } else  {
                newArr[i] = array[i+1];
            }
        }

        return newArr;
    }

    private static int findPosition(int[] array, int targetEle) {
        for(int i=0; i< array.length;i++){
            if(array[i] == targetEle){
                return i;
            }
        }
        return -1;
    }
}
