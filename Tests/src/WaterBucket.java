public class WaterBucket {

    private int gallonsofwater;
    private boolean empty;
    private int Waterbucket;
    private int capacity;
    private int amount;

    public WaterBucket(int capacity) {
        this.gallonsofwater = 0;
        this.empty = false;
        this.Waterbucket = capacity;
        this.amount = 0;
    }

    public boolean isEmpty() {
        return gallonsofwater == 0;
    }

    public boolean makeEmpty() {
        empty = true;
        gallonsofwater = 0;
        return true;
    }

    public int setAmount(int amount) {
        if (amount > capacity) {
            return -1;
        } else {
            this.amount = amount;
            return 0;
        }
    }

    public int getAmount() {
        return amount;
    }

    public int setCapacity(int capacity) {
        if (capacity < 0) {
            return -1;
        } else {
            this.capacity = capacity;
            return 0;
        }
    }

    public int addWater(int a) {
        if (a > capacity - gallonsofwater) {
            return 100;
        } else {
            gallonsofwater += a;
            return 0;
        }
    }

    public int greaterThan(WaterBucket b) {
        if (amount > b.amount) {
            return 1;
        } else if (amount < b.amount) {
            return -1;
        } else {
            return 0;
        }
    }
}