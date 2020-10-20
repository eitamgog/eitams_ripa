package example;
public class Hi{
    private int x;
    private int y;
    private int z;

    public Hi(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean eqls_two(Hi other, Hi other2) {
        if (other.equals(other2)) {
            return true;
        } else {
            return false;
        }
    }

    public String to_string(Hi other){
        String str_other = other.x + "/" + other.y + "/" + other.z;
        return str_other;
    }

    public boolean is_before(Hi other, Hi other2) {
        if (other.x < other2.x || other.y < other2.y || other.z < other2.z) {
            return true;
        } else {
            return false;
        }
    }
}