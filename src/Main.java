import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int variable;
        System.out.println("Начальное состояние массива: "+ Arrays.toString(numbers));
        for(int count=0;count<numbers.length/2;count++){
            variable=numbers[count];
            numbers[count]=numbers[numbers.length-1-count];
            numbers[numbers.length-1-count]=variable;
        }
        System.out.println("Конечное значение массива: "+Arrays.toString(numbers));
    }
}