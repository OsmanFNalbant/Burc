import java.util.Scanner;

public class Burc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Hangi gunde:");
        a = sc.nextInt();
        System.out.println("Kacinci ayda:");
        b = sc.nextInt();
        if(b==1)
        {
            if(a<=21){System.out.println("Oglak burcusunuz.");}
            else{System.out.println("Kova burcusunuz."); }
        }
        if(b==2)
        {
            if(a<=19){System.out.println("Kova burcusunuz.");}
            else{System.out.println("Balık burcusunuz.");}
        }
        if(b==3)
        {
            if(a<=20){System.out.println("Balık burcusunuz.");}
            else{System.out.println("Koc burcusunuz.");}
        }
        if(b==4)
        {
            if(a<=20){System.out.println("Koc burcusunuz.");}
            else{System.out.println("Boga burcusunuz.");}
        }
        if(b==5)
        {
            if(a<=21){System.out.println("Boga burcusunuz.");}
            else{System.out.println("Ikizler burcusunuz.");}
        }
        if(b==6)
        {
            if(a<=22){System.out.println("Ikizler burcusunuz.");}
            else{System.out.println("Yengec burcusunuz.");}
        }
        if(b==7)
        {
            if(a<=22){System.out.println("Yengec burcusunuz.");}
            else{System.out.println("Aslan burcusunuz.");}
        }
        if(b==8)
        {
            if(a<=22){System.out.println("Aslan burcusunuz.");}
            else{System.out.println("Basak burcusunuz.");}
        }
        if(b==9)
        {
            if(a<=22){System.out.println("Basak burcusnuz.");}
            else{System.out.println("Terazi burcusunuz.");}
        }
        if(b==10)
        {
            if(a<=22){System.out.println("Terazi burcusunuz.");}
            else{System.out.println("Akrep burcusunuz.");}
        }
        if(b==11)
        {
            if(a<=21){System.out.println("Akrep burcusunuz");}
            else{System.out.println("Yay burcusunuz.");}
        }
        if(b==12)
        {
            if(a<=21){System.out.println("Yay burcusunuz.");}
            else{System.out.println("Oglak burcusunuz.");}
        }
    }
}