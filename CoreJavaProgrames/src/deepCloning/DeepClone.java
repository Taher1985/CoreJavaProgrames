package deepCloning;

import java.util.Arrays;

class Ex {
    
    private int[] data;
 
    public Ex(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }
 
    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}

public class DeepClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        Ex e = new Ex(vals);
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e.showData(); // prints out [3, 7, 9]
    }

}
