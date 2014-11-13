
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aron
 */
public class Pratica42 {
        public static void main(String[] args) {
        Elipse ep = new Elipse(2, 3);
        Circulo c = new Circulo(3);
        
        System.out.println(ep.getArea());
        System.out.println(ep.getPerimetro());
        System.out.println(c.getArea());
        System.out.println(c.getPerimetro());        
    }
}
