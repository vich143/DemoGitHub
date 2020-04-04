
import demogithub.function.MyCalc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vich
 */
public class DemoGitHub {

    /**
     * @param args the command line
     * arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello World");
        System.out.println(MyCalc.add(1, 2));
        System.out.println(MyCalc.multi(1, 2));
        System.out.println(MyCalc.div(1, 2));
        System.out.println(MyCalc.minus(1, 2));
        System.out.println("finish test");
    }

}
