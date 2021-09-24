/**
 * 
 * программа просит ввести строку и выводит задом наперед
 * 
 * 
 */
package jktv20_perevertush;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20_Perevertush {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String user_str = scanner.nextLine();
        System.out.println(" user_str = "+user_str);
        char[] charStr = user_str.toCharArray();
        System.out.println("charStr = "+Arrays.toString(charStr));
        char[] newCharStr = new char[charStr.length];
        System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        for (int i = 0; i < charStr.length; i++) {
            newCharStr[(charStr.length-1)-i]=charStr[i];
        }
        System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        String str2 = new String(newCharStr);
        System.out.println("Строка наоборот = "+str2);
        System.out.println("---------------------------");
        StringBuilder sb = new StringBuilder(user_str);
        System.out.println("Строка наоборот = "+ sb.reverse().toString());
    }
    
}
