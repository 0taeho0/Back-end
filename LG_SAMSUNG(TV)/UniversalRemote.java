package _0918_resetTv_Lg_and_Samsung;

public class UniversalRemote {
    boolean pairing = false;
    boolean power = false;

    boolean tv_onoff(){
        power = !power;
        return power;
    }

}
