package pl.edu.ur.main;


import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zad 3");
        
        Scanner we = new Scanner(System.in);
        
        double Tab[] = new double[10];
        int i;
        for (i=0; i<10; i++){
            
            Tab[i]=we.nextDouble();
                       
    }
        
        System.out.println("a)");
        for ( i=0; i<10; i++){
            
            System.out.println(Tab[i]);
                       
    }
        
        
        
        System.out.println("b)");
        for ( i=9; i>0; i--){
            
            System.out.println(Tab[i]);                   
    }
        
        System.out.println("c)");
        for ( i=1; i<10; i=i+2){
            
            System.out.println(Tab[i]);
                       
    }
        
        System.out.println("d)");
        for (i=0; i<10; i=i+2){
            
            System.out.println(Tab[i]);
                       
    }
        
        
        
        System.out.println("Zad 4");
        
        double suma=0;
        double iloczyn=1;
        double srednia=0;
        double min=Tab[0];
        double max=Tab[0];
        
        for (i=0; i<10; i++){
        suma+=Tab[i];    
        iloczyn*=Tab[i];
        if(min>Tab[i]){
            min=Tab[i];
        }
        if(max<Tab[i]){
            max=Tab[i];
        }
                               
    }        
        srednia=suma/10;
        
        System.out.println("Suma="+suma+ "Iloczyn="+iloczyn+ " Średnia="+srednia+" Warość minimalna="+min+" Wartość maksymalna="+max);
        
        
        System.out.println("Zad 6");
        
        int x=1;
        
               
        while(x>0){
        x=we.nextInt();                            
        }
        
        System.out.println("Zad 7");
        System.out.println("Podaj z ilu liczb ma sie składać tablica");
        int n=we.nextInt();
        System.out.println("\n");
        int Tab2[]=new int[n];
        
        for(i=0;i<n;i++){
            Tab2[i]=we.nextInt();
        }
        int y;
        for(int j=0;j<n-1;j++){
            for(i=0;i<n-1;i++){
                if(Tab2[i]>Tab2[i+1]){
                  y=Tab2[i];
                  Tab2[i]=Tab2[i+1];
                  Tab2[i+1]=y;
                }
            } 
        }
        
        
        System.out.println("Tablica "+n+"-elementowa po przesortowaniu:");
        
        for(i=0;i<n;i++){
            System.out.println(Tab2[i]);
        }
        
    
}
}