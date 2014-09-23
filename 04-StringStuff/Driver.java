// mixStart
public boolean mixStart(String str) {
  if (str.length() < 3) return false;
    
  String check = str.substring(1,3);
  return (check.equals("ix"));
}

// makeOutWord
public String makeOutWord(String out, String word) {
  String first = out.substring(0,2);
  String last = out.substring(2);
  return first + word + last;
}

// firstHalf
public String firstHalf(String str) {
  int length = str.length();
  length = length/2;
  return str.substring(0,length);
}
