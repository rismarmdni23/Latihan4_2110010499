
package penilaian;

public class NilaiAkhir extends Mahasiswa{
    int uts;
    int uas;
    int tugas;
    
    @Override
    public void uts (int Uts){
        uts=Uts;
        System.out.println("Nomor Rumah = " +Uts);
    }
    
    @Override
    public void uas (int Uas){
        uas=Uas;
        System.out.println("Nomor Rumah = " +Uas);
    }
    
     @Override
    public void tugas (int Tugas){
        tugas=Tugas;
        System.out.println("Nomor Rumah = " +Tugas);
    }
}