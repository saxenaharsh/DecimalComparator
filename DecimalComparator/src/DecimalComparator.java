public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

       //return((long)(firstNumber * 1000)) == (long)(secondNumber * 1000);
        if((long)(firstNumber * 1000) == (long)(secondNumber * 1000)){
            System.out.println(firstNumber);
            System.out.println(secondNumber);
            System.out.println("true");
            return true;
        }else{
            return false;
        }


    }
}
