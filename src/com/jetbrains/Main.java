package com.jetbrains;
public class Main {

    public static void main(String[] args) {
	    System.out.println("System Status\n");
        countdown();
        System.out.println("\n");
        System.out.println("Light status: "+"\n");
        ananda(8);
    }

    private static void countdown(){
        int i;

        for(i=10;i>=0;i--){

            System.out.println(i+"\t"+"Node functional");

            if (i == 0) {
                System.out.println("\n");
                System.out.println("System working");
            }
        }
    }

    private static double ananda(int a){
        double c;
        c = (a+2)%6;
        if(c<2){
            System.out.println("LightON");
        }
        else{
            System.out.println("LightOFF");
        }
        return(c);
    }
}
