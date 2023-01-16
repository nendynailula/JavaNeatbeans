/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nendyna;
import java.util.Scanner;
/**
 *
 * @author NENDY NAILUL AUTOR
 */
public class SOAL01_PBO_M03_5210411117 {
    public static void main(String[] args) {
              int Day = 1;
        String DayString;
        DayString = switch (Day) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jum'at";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "Invalid Day";
        };
        System.out.println(DayString);
    }
}
