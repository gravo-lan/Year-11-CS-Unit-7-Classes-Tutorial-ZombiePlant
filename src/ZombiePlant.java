public class ZombiePlant {

    private final int maxPotency;
    private int req;

    public ZombiePlant(int potency, int req) {
        this.maxPotency = potency;
        this.req = req;
    }

    public boolean isDangerous() {
        return req>0;
    }

    public int treatmentsNeeded() {
        return req;
    }

    public int getPotencyRequired() {
        return maxPotency;
    }

    public void treat(int potency) {
        if(potency<= maxPotency && potency>0 && req>0) req--;
        else if(potency>maxPotency) req++;
    }

}
