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

    public static String convertNumberToNumerals(int unit, char valueOf10, char valueOf50, char valueOf100)
    {
        String lowestValue = Character.toString(valueOf10);
        String midValue = Character.toString(valueOf50);
        String highestValue = Character.toString(valueOf100);
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
        char I = 'I';
        char V = 'V';
        char X = 'X';
        char L = 'L';
        char C = 'C';
        char D = 'D';
        char M = 'M';
        String output = "";
        int counter = 1;

        for(int i = 0; i < intArray.length; i++)
        {
            if(counter == 1)
            {
                output += convertNumberToNumerals(intArray[i],M,M,M);
            }
            if(counter == 2)
            {
                output += convertNumberToNumerals(intArray[i],C,D,M);
            }
            if(counter == 3)
            {
                output += convertNumberToNumerals(intArray[i],X,L,C);
            }
            if(counter == 4)
            {
                output += convertNumberToNumerals(intArray[i],I,V,X);
            }
            counter++;
        }
        return output;
    }
}