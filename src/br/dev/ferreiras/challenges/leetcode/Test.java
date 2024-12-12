package br.dev.ferreiras.challenges.leetcode;

/*
'g', 'o' 'o' 'd' ' ' 'b' 'y' 'e' ' ' 'n' 'a' 'v' 'a' 'r'

reverse: navar bye good
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    private final static Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {

        char[] c = {'g', 'o', 'o', 'd',
            ' ',
            'b', 'y', 'e',
            ' ',
            'n', 'a', 'v', 'a', 'r'
        };
        String str = String.valueOf(c);
        logger.log(Level.INFO, str);
        String s = reverseCharacters(c);
        logger.log(Level.INFO, s);
    }

    public static String reverseCharacters(char[] ch) {
        String s = String.valueOf(ch);
        String regex = "\\s+";
        String[] aux = s.split(regex);
        int size = aux.length;
        StringBuilder sb = new StringBuilder();

        for (int i = size - 1; i >= 0; i--) {
            sb.append(aux[i]).append(" ");
        }

        return sb.toString();
    }
}
