/*NIM		: 13020210050
Nama		: Miftahul Jannah
Hari/Tanggal: Rabu, 08 Maret 2021*/

import java.util.Scanner;

public 0050 KiloMill {
    public static void main(String[] args) {
        final double KmPerMil = 1.609;
        final int MeterPerKilometer = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mil: ");
        double mil = scanner.nextDouble();

        double Km = mil * KmPerMil;
        double meter = Km * MeterPerKilometer;

        System.out.println(mil + " mil = " + meter + " meter.");
    }
}