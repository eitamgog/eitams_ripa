public class Hi {
    private int x;
    private int y;
    private int z;

    public Hi(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Hi other) {
        if (other.x == this.x) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.x + "/" + this.y + "/" + this.z;
    }

    public boolean is_before(Hi other, Hi other2) {
        if (other.x < other2.x || other.y < other2.y || other.z < other2.z) {
            return true;
        } else {
            return false;
        }
    }
}