import java.io.*;
import java.util.*;

public class findCode {
    public static int findKey(int input1, int input2, int input3) {
        int[] thousands = {input1 / 1000, input2 / 1000, input3 / 1000};
        int[] hundreds = {(input1 / 100) % 10, (input2 / 100) % 10, (input3 / 100) % 10};
        int[] tens = {(input1 / 10) % 10, (input2 / 10) % 10, (input3 / 10) % 10};
        int[] units = {input1 % 10, input2 % 10, input3 % 10};

        int maxThousands = Math.min(Math.min(thousands[0], thousands[1]), thousands[2]);
        int maxHundreds = Math.min(Math.min(hundreds[0], hundreds[1]), hundreds[2]);
        int maxTens = Math.min(Math.min(tens[0], tens[1]), tens[2]);
        int maxUnits = Math.min(Math.min(units[0], units[1]), units[2]);

        int key = maxThousands * 1000 + maxHundreds * 100 + maxTens * 10 + maxUnits;

        return key;
    }

    public static void main(String[] args) {
        System.out.println(findKey(3521,2452,1352));
    }

}
