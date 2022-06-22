
package com.mycompany.stringfunc;

import java.util.Scanner;


/**
 *
 * @author israkkayumchowdhury
 */
public class StringFuncOperation {
    String word, str;
    int x, p;
    
    Scanner s = new Scanner(System.in);
    
    public void getIndex(){
        
          System.out.print("Enter Index number : ");
                    
          x = s.nextInt();
    }
    
    public void getNumber(){
        
          System.out.print("Enter any number : ");
                    
          p = s.nextInt();
    }
    
    public void getString(){
        
          System.out.print("Enter any another word : ");
          
          str = s.nextLine();
    }
    
    public void len(){
        
        System.out.println("Length : "+(word.length()));
        
        
    }
    
    public void charat(){
        
        System.out.println("CharAt : "+(word.charAt(x)));
        
    }
    
    public void chars(){
        
        System.out.println("Chars : "+(word.chars()));
        
    }
    
    public void codepointat(){
        
        System.out.println("CodePointAt : "+(word.codePointAt(x)));
        
    }
    
    public void codepointbefore(){
        
        System.out.println("CodePointBefore : "+(word.codePointBefore(x)));
        
    
    }
    public void concat(){
        
        System.out.println("Concat : "+(word.concat(" ").concat(str)));
        
    }
    
    public void indent(){
        
        System.out.println("Indent : "+(word.indent(x)));
        
    }
    
    public void intern(){
        
        System.out.println("Intern : "+(word.intern()));
        
    }
    
    public void repeat(){
        
        System.out.println("Repeat : "+(word.repeat(p)));
        
    }
    
    public void replace(){
        
        System.out.println("Replace : "+(word.replace(word, str)));
        
    }
    
    public void strip(){
        
        System.out.println("Strip : "+(word.strip()));
        
    }
    
    public void stripIndent(){
        
        System.out.println("Strip Indent : "+(word.stripIndent()));
        
    }
    public void stripLeading(){
        
        System.out.println("Strip Leading : "+(word.stripLeading()));
        
    }
    public void stripTrailing(){
        
        System.out.println("Strip Trailing : "+(word.stripTrailing()));
        
    }
    public void subString(){
        
        System.out.println("Sub String : "+(word.substring(x)));
        
    }
    public void toLowerCase(){
        
        System.out.println("toLowerCase : "+(word.toLowerCase()));
        
    }
    public void tostring(){
        
        System.out.println("toString : "+(word.toString()));
        
    }
    public void toUpperCase(){
        
        System.out.println("toUpperCase : "+(word.toUpperCase()));
        
    }
    public void translateEscapes(){
        
        System.out.println("translateEscapes : "+(word.translateEscapes()));
        
    }
    public void trim(){
        
        System.out.println("Trim : "+(word.trim()));
        
    }
    public void codePointCount(){
        
        System.out.println("Code Point Count : "+(word.codePointCount(x, p)));
        
    }
    public void codePoints(){
        
        System.out.println("Code Point : "+(word.codePoints()));
        
    }
    public void compareTo(){
        
        System.out.println("Compare To : "+(word.compareTo(str)));
        
    }
    public void indexOf(){
        
        System.out.println("IndexOf : "+(word.indexOf(str)));
        
    }
    public void split(){
        
        System.out.println("Split : "+(word.split(str)));
        
    }
    public void toCharArray(){
        
        System.out.println("toCharArray : "+(word.toCharArray()));
        
    }
    
    
}
