package pbo_m13_5210411117;

public class NimHarusPositifException extends Exception{

    @Override
    public String getMessage() {
        return "Inputan Nim harus bilangan positif"; 
    }
    
}