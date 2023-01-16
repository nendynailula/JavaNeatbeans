package pbo_m13_5210411117;

public class SemesterHarusValid extends Exception{
     
    @Override
    public String getMessage(){
        return "Inputan semester di luar range masa studi";
    }
}