package org.example;

public class Main
{

    public static void main(String[] args) throws Exception {
        int numberInput = 153;
        int[] outputArray =  splitInputToArray(numberInput);
        String output = romanConstructorV2(outputArray);
        System.out.println(output);
    }

    public static int[] splitInputToArray(int numberInput) throws Exception
    {
        if(numberInput > 3999 || numberInput < 0)
        {
            throw new ExcessError("Number not within range ( > 0 and < 3999");
        }
            int[] intArray = new int[4];
            intArray[0] = numberInput / 1000;
            intArray[1] = numberInput % 1000 / 100;
            intArray[2] = numberInput % 1000 % 100 / 10;
            intArray[3] = numberInput % 1000 % 100 % 10;

        return intArray;
    }

    public static String convertNumberToNumerals(int unit, String lowestValue, String midValue, String highestValue)
    {

        String outputString ="";
        switch (unit)
        {
            case 1:
                outputString = lowestValue;
                break;
            case 2:
                outputString = lowestValue + lowestValue;
                break;
            case 3:
                outputString = lowestValue + lowestValue + lowestValue;
                break;
            case 4:
                outputString = lowestValue+midValue;
                break;
            case 5:
                outputString = midValue;
                break;
            case 6:
                outputString = midValue+lowestValue;
                break;
            case 7:
                outputString = midValue+lowestValue+lowestValue;
                break;
            case 8:
                outputString = midValue+lowestValue+lowestValue+lowestValue;
                break;
            case 9:
                outputString = lowestValue+highestValue;
                break;
        }
        return outputString;
    }
    public static String romanConstructorV2(int[] intArray )
    {
        String I = "I";
        String V = "V";
        String X = "X";
        String L = "L";
        String C = "C";
        String D = "D";
        String M = "M";
        String output = "";

                output += convertNumberToNumerals(intArray[0],M,M,M);
                output += convertNumberToNumerals(intArray[1],C,D,M);
                output += convertNumberToNumerals(intArray[2],X,L,C);
                output += convertNumberToNumerals(intArray[3],I,V,X);
        return output;
    }
}