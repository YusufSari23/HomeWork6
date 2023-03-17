import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma =3.67, domates = 1.11, muz = 0.95, patlican = 5;

        System.out.print("Armut Kaç Kilo : ");
        double ar = input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        double el = input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        double dom = input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        double mu = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        double pa = input.nextDouble();

        double toplamtutar = (ar * armut) + (el * elma) + (dom * domates) + (mu * muz) + (pa * patlican);

        System.out.println("Toplam Tutar : " + toplamtutar);
    }
}