/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspolymorpism;

/**
 *
 * @author user
 */
public class UASPolymorpism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MataPelajaran MP = new MataPelajaran();
    Matematika MTK = new Matematika();
    Sejarah SJ = new Sejarah();
    Ekonomi EK = new Ekonomi();
    B_Indonesia IDN = new B_Indonesia();
    Sosiologi SLG = new Sosiologi();
    
    MP.tampiltugas();
    MTK.tampiltugas();
    SJ.tampiltugas();
    EK.tampiltugas();
    IDN.tampiltugas();
    SLG.tampiltugas();
    }
    
}
