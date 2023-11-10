/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author insimplifiable
 */
public class exercisemain {
    public static void main(String arg[]) {
        String cName1, cName2, cName3;
        String cReg1, cReg2, cReg3;
        int cPop1, cPop2, cPop3;
        /* Populations are from https://seijiyama.jp/lgov/lgov-ranking/r02-city/ */
        
        cName1 = "Chiba-shi";
        cReg1 = "Kantō";
        cPop1 = 975000;
        
        cName2 = "Hamamatsu-shi";
        cReg2 = "Chūbu";
        cPop2 = 791000;
        
        cName3 = "Kanazawa-shi";
        cReg3 = "Chūbu";
        cPop3 = 463000;
        
        System.out.println("The combined population of all three cities is " + (cPop1 + cPop2 + cPop3) + ".");
        System.out.println(cName2 + " and " + cName3 + " are in the same region. (" + (cReg2.equals(cReg3)) + ")");
        System.out.println(cName1 + " is " + (Math.round(((float)cPop1/cPop3)*100)/Math.pow(10,2)) + " times more populous than " + cName3 + ".");
    }
}
