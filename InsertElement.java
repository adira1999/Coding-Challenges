

public class InsertElement {



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int size = array.length;
        int targetEle = 6;
        int pos = 2;


        int[] newArr = new int[size+1];

        array = insertElement(array,size,targetEle,pos);

        for(int i =0;i<newArr.length;i++ ){
            System.out.println(array[i]);
        }

    }

    private static int[] insertElement(int[] array, int size, int targetEle, int pos) {

        int[] newArr = new int[size+1];

        for (int i= 0;i<= newArr.length;i++){
            if(i < pos){
                newArr[i] = array[i];
            } else if( i == pos){
                newArr[i] = targetEle;
            } else {
                if( i <= array.length) {
                    newArr[i] = array[i - 1];
                }
            }
        }
        return newArr;
    }


}
