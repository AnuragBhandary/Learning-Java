public class test1{
    public static void main(String[] args){
        int finalResult = addNums(5, 7);
        System.out.println("Final result = " + finalResult);
    }

    public static int addNums(int a, int b){
        int result = 0;
        result = a + b;
        return result;
    }
}