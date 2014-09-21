public class Driver{
    public static void main(String args[]){
	String s = new String("mike zamansky");
	s.indexOf(" ");

	String first = new String(s.substring(0,s.indexOf(" ")));

	String last = new String(s.substring(s.indexOf(" ")+1,s.length()));
    }
}
