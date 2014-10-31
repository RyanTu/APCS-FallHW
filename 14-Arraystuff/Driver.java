public class Driver{
    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(150));
	System.out.println(as.maxVal());
	System.out.println(as.freq(3));
	int[] a = {1, 2, 3, 8, 9, 3, 2, 1};
	System.out.println(as.maxMirror(a));
    }
}
