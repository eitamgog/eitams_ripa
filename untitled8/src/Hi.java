package example;
public class Hi{
    private int x;
    private int y;
    private int z;

    public Hi(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return (x,y,z);
    }

    public boolean eqls_two(Hi other, Hi other2) {
        if (other == other2) {
            return true;
        } else {
            return false;
        }
    }

    public String to_string(Hi other){
        String str_other = other[0] + "/" + other[1] + "/" + other[2];
        return str_other;
    }

    public boolean is_before(Hi other, Hi other2) {
        if (other[0] < other2[0] || other[1] < other2[1] || other[2] < other2[2]) {
            return true;
        } else {
            return false;
        }
    }
}