
not.java
import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        int mat,ingilizce,kimya,fizik,tarih,resim;
        Scanner tah = new Scanner(System.in);


        System.out.print("Matematik notunuz : " );
        mat = tah.nextInt();
        System.out.print("ingilizce notunuz : " );
        ingilizce = tah.nextInt();
        System.out.print("kimya notunuz : " );
        kimya = tah.nextInt();
        System.out.print("fizik notunuz : " );
        fizik = tah.nextInt();
        System.out.print("tarih notunuz : " );
        tarih = tah.nextInt();
        System.out.print("resim notunuz : " );
        resim = tah.nextInt();
        int  sonuc  = mat+ ingilizce + kimya + fizik + tarih + resim;
        int bit = sonuc / 6;            ;
        System.out.print("Ortalamanız : " + bit);
        int a = 59;
        boolean tar = a >= bit;

        String kalma=tar  ? "\n Kaldınız" : "\n Geçtiniz";
        System.out.println(kalma);


    }}