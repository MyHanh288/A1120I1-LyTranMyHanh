package _b4_oop_java.bai_tap.StopWatch;

public class StopWatch {
    private long starTime, endTime;
    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.starTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.starTime;
    }
}
