
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class soalmatrix1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Kolom Matriks");
        int kolom = input.nextInt();
        System.out.println("Masukkan Jumlah Baris Matriks");
        int baris = input.nextInt();
        
        int Matriks[][] = new int[baris][kolom];
        
        for(int i = 0; i < Matriks.length; i++){
            for(int j = 0; j < Matriks[i].length; j++){
                System.out.print("Masukkan Nilai Matriks Baris ke "+(i+1)+"kolom ke "+(j+1)+":");
                Matriks[i][j] = input.nextInt();
            }
        }
        for(int a = 0; a < Matriks.length; a++){
            for(int b = 0; b < Matriks[a].length; b++){
                System.out.print(Matriks[a][b] + ", ");
            }
            System.out.println();
        }
    }
}
