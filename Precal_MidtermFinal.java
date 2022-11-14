/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.precal_midterm;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Precal_MidtermFinal {
    public static void main(String[]args){
    double c1, c2, c3, c4, c5, c6, c7, c8, c9;

        c1 = 137.402;
        c2 = 4.60437;
        c3 = 0.061652;
        c4 = -1.118157;
        c5 = -0.001525;
        c6 = -0.0109119;
        c7 = -0.00040148;
        c8 = -0.00026682;
        c9 = 0.000003873;

        double d1, d2, d3, d4, d5, d6, d7, d8, d9;

        d1 = 1.00618;
        d2 = -0.893222;
        d3 = -0.01426;
        d4 = 0.870024;
        d5 = -0.0063397;
        d6 = 0.033889;
        d7 = -0.00023875;
        d8 = -0.00014746;
        d9 = 0.0000067962;

        double te;

        te = 10;

        Scanner tcScanner = new Scanner(System.in);
        System.out.print("Enter the tc: \n");
        double tc = tcScanner.nextDouble();

        System.out.print("===============================================\n"
                + "Cycle \t qe \t P \t qc \t tc \t Error\n");

        double qe;

        double p;

        double qc;

        double F = 9.39;
        double tamb = 35;
        double previoustc = 0;

        double diff;

        int cycle = 0;
        while (F == 9.39) {

            cycle++;

            qe = c1 + (c2 * te) + (c3 * (te * te)) + (c4 * tc)
                    + (c5 * (tc * tc)) + (c6 * te * tc) + (c7 * (te * te) * tc)
                    + (c8 * te * (tc * tc)) + (c9 * (te * te) * (tc * tc));

            p = d1 + (d2 * te) + (d3 * (te * te)) + (d4 * tc)
                    + (d5 * (tc * tc)) + (d6 * te * tc) + (d7 * (te * te) * tc)
                    + (d8 * te * (tc * tc)) + (d9 * (te * te) * (tc * tc));

            qc = qe + p;

            tc = ((F * tamb) - (-qc)) / F;

            diff = tc - previoustc;

            previoustc = tc;

            if (diff < 0) {
                diff *= -1;
            }

            System.out.printf(cycle + "\t" + String.format("%.2f", qe)
                    + "\t" + String.format("%.2f", p) + "\t" + String.format("%.2f", qc)
                    + "\t" + String.format("%.2f", tc) + "\t" + String.format("%.2f", diff) + "\n");

            //System.out.printf(cycle + "\t" + (float)qe + 
            //"\t" + (float)p + "\t" +  (float)qc + 
            //"\t" + (float)tc + "\t" +  (float)diff + "\n");
//System.out.print("qe: ");
            //System.out.println(qe);
            //System.out.print("p: ");
            //System.out.println(p);
            //System.out.print("qc: ");
            //System.out.println(qc);
            //System.out.print("tc: ");
            //System.out.println((float)tc);
            if (diff < 0.01) {
                break;
            }
        }

    }

}
    

