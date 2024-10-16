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
        if(pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()){
            int currentChannel = pairedTV.getCurrentChannel();
            if(currentChannel == 999) {
                pairedTV.changeChannel(0);
            }else {
                pairedTV.changeChannel(currentChannel + 1);
            }
        }else if(pairedTV == null || pairedTV.isPaired()){
            System.out.println("No Tv is paired.");
        }else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public void previousChannel() {
        // 페어링된 TV가 있고, TV의 전원이켜져 있을 때만 채널을 이전 또는 다음으로 변경 가능.
        if(pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()){
            int currentChannel = pairedTV.getCurrentChannel();
            if(currentChannel == 0) {
                pairedTV.changeChannel(999);
            }else {
                pairedTV.changeChannel(currentChannel - 1);
            }
        }else if(pairedTV == null || pairedTV.isPaired()){
            System.out.println("No Tv is paired.");
        }else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    @Override
    public void adjustVolume(int level) {
        // Tv 전원과 연결이 되어야 작동 가능
        if(pairedTV != null && pairedTV.isPaired() && pairedTV.isPowerOn()) {
            pairedTV.adjustVolume(level);
        }else if(pairedTV == null || pairedTV.isPaired()){
            System.out.println("No Tv is paired.");
        }else {
            System.out.println("The TV is OFF. Cannot change channel.");
        }
    }

    public void watchStreaming(){
        // 페어링된 Tv가 SamsungTv일 경우 넷플릿스 시청
        if(pairedTV instanceof SamsungTv){
            ((SamsungTv) pairedTV).watchNetflix();
        }else if(pairedTV instanceof LgTv){
            ((LgTv) pairedTV).watchYoutube();
        }else if(pairedTV instanceof AppleTv){
            ((AppleTv) pairedTV).watchWavve();
        }else {
            System.out.println("No streaming available for this Tv");
        }
    }
}
