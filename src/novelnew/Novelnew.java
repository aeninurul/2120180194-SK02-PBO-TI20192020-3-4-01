/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novelnew;

/**
 *
 * @author ASUS
 */
public class Novelnew {
    public static void main(String[] args){
        //inisiasi class novel
         novel novel_a = new novel();
         //pemberitahuan nilai attribut
         novel_a.nama_penerbit="Nurul Aeni";
         novel_a.judul="Aku Merindukanmu";
         novel_a.tahun=2019;
         //menampilkan attribut
         System.out.println(novel_a.nama_penerbit);
         System.out.println(novel_a.judul);
         System.out.println(novel_a.tahun);
         //mengkases method
         novel_a.nama();
         novel_a.judul();
         novel_a.tahun();
    }
}
