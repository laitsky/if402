/*
LATIHAN PEMWEB 28 FEBRUARI 2020 (OOP Kelas C)
LIANA - 00000027963
VINCENT DIAMOND - 00000027047
 */

package latihan.id.ac.umn;

public class Main {
    public static void main(String[] args) {
        PegawaiA pegawaiA = new PegawaiA(2000000, 21);
        PegawaiB pegawaiB = new PegawaiB(2000000, 14);

        System.out.println("Gaji Pegawai A:" + pegawaiA.getGajiPegawaiA());
        System.out.println("Gaji Pegawai B:" + pegawaiB.getGajiPegawaiB());
    }
}
