package learning1;
class Tester12 {
    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
	    String[] strarr = new str.split();
	   for (string s :n){
	       n=s.length();
	       for (int i=0;i<=(n/2);i++){
	           char c1 = s.charAt(i);
	           char c2 = s.charAt(n-1-i);
	           s.replace(c1,c2);
	       }
	   }String reverseString = String.join(strarr);
        return reverseString;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}