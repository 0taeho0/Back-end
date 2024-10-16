package teachercode;

public class SamsungTv implements Tv {
    // 변수 부분
    private int currentChannel = 1;
    private boolean powerOn = false;
    private boolean paired= false;
    private int volume= 0;

    // 메서드 부분
    @Override
    public void setPower(boolean power) {
        // 리모컨과 페어링된 경우에만 전원을 켜거나 끌 수 있음.
        if(paired) {
            powerOn = power;
            if(power) {
                System.out.println("Samsung Tv is now ON.");
            } else {
                System.out.println("samsung Tv is now OFF.");
            }
        }else{
            System.out.println("Samsung Tv is not paired.");
        }
    }

    @Override
    public void changeChannel(int channel) {
        // 리모컨과 페어링이되고, Tv의 전원이 켜져 있는 상태에만 체널 변경 가능
        if(paired && powerOn){
            this.currentChannel= channel;
            System.out.println("Samsung Tv Channel to channel " + channel);
        } else if (!paired) {
            System.out.println("Samsung Tv is not paired");
        }else{
            System.out.println("Samsung Tv is OFF. Cannot change channel.");
        }
    }

    @Override
    public int getCurrentChannel() {
        return currentChannel;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public boolean isPaired() {
        return paired;
    }

    @Override
    public void setPair(boolean pair) {
        paired = pair;
        if(pair) {
            System.out.println("Samsung Tv paired with remote.");
        }else {
            System.out.println("Samsung Tv unpaired from remote.");
        }
    }

    @Override
    public String getTvName() {
        return "Samsung Tv";
    }

    @Override
    public void adjustVolume(int level) {
        // 리모컨과 페어링이되고, Tv의 전원이 켜져 있는 상태에만 체널 변경 가능
        if(powerOn){
            this.volume = level;
            System.out.println("Samsung Tv volume : " + volume);
        }else {
            System.out.println("Samsung Tv is OFF.");
        }
    }

    // 고유 가능(메서드) Samsung : NETFLIX 스트리밍 가능
    public void watchNetflix(){
        // Tv의 전원이 켜져 있을 때만 넷플릭스 시청할 수 있음.
        if (powerOn) {
            System.out.println("Samsung Tv : Now streaming Netflix");
        }else {
            System.out.println("Samsung Tv is OFF. Cannot stream Netflix.");
        }
    }
}
