public class Driver{
    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(150));
	System.out.println(as.maxVal());
	System.out.println(as.freq(3));
	int[] a = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 };
	System.out.println(as.maxMirror(a));
    }
}
