package com.mycompany.stringfunc;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class StringFunc {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        StringFuncOperation fun = new StringFuncOperation();

        while (true) {

            System.out.println("");

            System.out.println("--------------------------------------------------- String ---------------------------------------------------------");

            System.out.println("");

            System.out.println("1. Length\t\t 2. CharAt\t\t 3. Chars\t\t 4. CodePointAt\t\t 5. CodePointBefore");

            System.out.println("");

            System.out.println("6. Concat\t\t 7. Indent\t\t 8. Intern\t\t 9. Repeat\t\t 10. Replace");

            System.out.println("");

            System.out.println("11. Strip\t\t 12. StripIndent\t 13. StripLeading\t 14. StripTrailing\t 15. SubString");

            System.out.println("");

            System.out.println("16. toLowerCase\t\t 17. toString\t\t 18. toUpperCase\t 19. translateEscapes\t 20. Trim");

            System.out.println("");

            System.out.println("21. codePointCount\t 22. codePoints\t\t 23. compareTo\t\t 24. indexOf\t\t 25. Split");

            System.out.println("");

            System.out.println("26. toCharArray\t\t 27. Exit");

            System.out.println("");

            System.out.print("Choice your suitable option: ");

            int n = s.nextInt();

            while (n != 27) {
                System.out.print("Enter a word : ");

                s.nextLine();

                fun.word = s.nextLine();
            }

            switch (n) {

                case 1 -> {
                    fun.len();
                }
                case 2 -> {

                    fun.getIndex();

                    fun.charat();
                }
                case 3 -> {
                    fun.chars();
                }
                case 4 -> {

                    fun.getIndex();

                    fun.codepointat();
                }
                case 5 -> {

                    fun.getIndex();

                    fun.codepointbefore();
                }
                case 6 -> {

                    fun.getString();

                    fun.concat();
                }
                case 7 -> {

                    fun.getNumber();

                    fun.indent();
                }
                case 8 -> {

                    fun.intern();
                }
                case 9 -> {

                    fun.getNumber();

                    fun.repeat();
                }
                case 10 -> {

                    fun.getString();

                    fun.replace();
                }
                case 11 -> {

                    fun.strip();
                }
                case 12 -> {

                    fun.stripIndent();
                }
                case 13 -> {

                    fun.stripLeading();
                }
                case 14 -> {

                    fun.stripTrailing();
                }
                case 15 -> {

                    fun.getIndex();

                    fun.subString();
                }
                case 16 -> {

                    fun.toLowerCase();
                }
                case 17 -> {

                    fun.tostring();
                }
                case 18 -> {

                    fun.toUpperCase();
                }
                case 19 -> {

                    fun.translateEscapes();
                }
                case 20 -> {

                    fun.trim();
                }
                case 21 -> {

                    fun.getIndex();

                    fun.getNumber();

                    fun.codePointCount();
                }
                case 22 -> {

                    fun.codePoints();
                }
                case 23 -> {

                    fun.getString();

                    fun.compareTo();
                }
                case 24 -> {

                    fun.getString();

                    fun.indexOf();
                }
                case 25 -> {

                    fun.getString();

                    fun.split();
                }
                case 26 -> {

                    fun.toCharArray();
                }

                case 27 -> {
                    System.exit(0);
                }

                default -> {
                    System.out.print("Input Valid Number!!!");
                    break;

                }

            }

        }

    }
}
