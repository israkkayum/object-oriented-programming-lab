
package com.mycompany.calculator;


public class CalOperation {
    
    double x, y;
    
    public void sum(){
        System.out.println("Summation : "+(x+y));
    }
    
    public void sub(){
        System.out.println("Substract : "+(x-y));
    }
    
    public void div(){
        System.out.println("Division : "+(x/y));
    }
    
    public void multi(){
        System.out.println("Multiple : "+(x*y));
    }
    
    public void modu(){
        System.out.println("Modulus : "+(x%y));
    }
    
    public void root(){
        System.out.println("Root : "+(Math.sqrt(x)));
    }
    
    public void fact(){
        
        double fact = 1;
        
        int facIn = (int)x;
        
        while(x != 1)
        {
            fact = fact * ((x+1) - 1);
            
            x--;
        }
        
        System.out.println(facIn+ "! : "+(fact));
    }
    
    public void ln(){
        
        double result = (Math.log(1-x))/x;
        
        System.out.println("ln("+x+") : "+(result));
    }
    
    public void log(){
        System.out.println("log("+x+") : "+(Math.log(x)));
    }
    
    public void sin(){
        
        double result = Math.sin(x);
        
        System.out.println("sin("+x+") : "+(Math.round(result)));
    }
    
    public void cos(){
        
        double result = Math.cos(x);
        
        System.out.println("cos("+x+") : "+(Math.round(result)));
    }
    
    public void tan(){
        
        double result = Math.tan(x);
        
        System.out.println("tan("+x+") : "+(Math.round(result)));
    }
    
    public void sec(){
        
        double result = Math.round((Math.cos(x)));
        
        if (result == 0) {
            System.out.println("sec("+x+") : undefined");
        }
        else{
            System.out.println("sec("+x+") : "+(1 / Math.round(result)));
        }
        
    }
    
    public void cosec(){
        
        double result = Math.round((Math.sin(x)));
        
        if (result == 0) {
            System.out.println("cosec("+x+") : undefined");
        }
        else{
            System.out.println("cosec("+x+") : "+(1 / Math.round(result)));
        }
    }
    
    public void cot(){
        
       double result = Math.round((Math.tan(x)));
        
        if (result == 0) {
            System.out.println("tan("+x+") : undefined");
        }
        else{
            System.out.println("tan("+x+") : "+(1 / Math.round(result)));
        }
    }
    
    
}
