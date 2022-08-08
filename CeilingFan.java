public class CeilingFan {

    private int MAX_SPEED = 3;      // Constant for max speed
    private int presentSpeed;
    private boolean reverse;

    public CeilingFan() {
        this.presentSpeed = 0;       // Default off
        this.reverse = false;
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public int getPresentSpeed() {
        return presentSpeed;
    }

    public void setPresentSpeed(int presentSpeed) {
        this.presentSpeed = presentSpeed;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public void changeSpeed() {
        if (isReverse()) {
            if (getPresentSpeed() == 0) {
                setPresentSpeed(getMAX_SPEED());
            }
            else {
                setPresentSpeed(getPresentSpeed() - 1);
            }
        }
        else {
            if (getPresentSpeed() == getMAX_SPEED()) {
                setPresentSpeed(0);
            }
            else {
                setPresentSpeed(getPresentSpeed() + 1);
            }
        }
    }

    public void changeSetting () {
        setReverse(!isReverse());
    }
}
