package utilities;

public class FrameRate {

    private String frameRate;
    private long lastTime;
    private long delta;
    private int frameCount;

    public FrameRate() {
        lastTime = System.currentTimeMillis();
        frameRate = "FPS 0";
    }

    public void calculate() {
        long current = System.currentTimeMillis();
        delta += current - lastTime;
        lastTime = current;
        frameCount++;
        if (delta > 1000) {
            delta -= 1000;
            frameRate = "FPS " + frameCount;
            frameCount = 0;
        }
    }

    public String getFrameRate() {
        return frameRate;
    }

}
