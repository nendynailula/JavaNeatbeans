package pbo_m14_5210411117;

public class NoPegawaiHarus10DigitException extends Exception{
    
    @Override
    public String getMessage(){
        return "no pegawai yang diinputkan harus 10 digit";
    }
}
