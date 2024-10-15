package teachercode;

public class UniversalRemote implements RemoteControl{
    // 변수 부분
    private Tv pairedTV;

    // Tv와 리모컨을 페어링하는 메서드
    public void pairWith(Tv tv){
        // 이미 다른 Tv와 페어링 되어 있을 경우
        if(pairedTV != null && pairedTV != tv) {
            System.out.println(pairedTV.getTvName() + "'s pairing has been disconnected.");
            pairedTV.setPair(false);
        }

        pairedTV = tv;
        tv.setPair(true);
    }

    // 메서드 부분
    @Override
    public void setPower(boolean power) {
        // 페어링된 TV가 있고, 그 TV가 페어링된 상태일 때만 전원 설정 가능
        if(pairedTV != null && pairedTV.isPaired()){
            pairedTV.setPower(power);
        }else {
            System.out.println("No Tv is paired");
        }
    }

    @Override
    public void setChannel(int channel) {
        // 페어링된 TV가 있고, TV의 전원이 켜져 있을 때만 채널 변경 가능
        if(pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()){
            pairedTV.changeChannel(channel);
        }else if(pairedTV == null || !pairedTV.isPaired()){
            System.out.println("No Tv is paired.");
        }else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public void nextChannel() {
        // 페어링된 TV가 있고, TV의 전원이켜져 있을 때만 채널을 이전 또는 다음으로 변경 가능.

    }

    @Override
    public void previousChannel() {

    }
}
