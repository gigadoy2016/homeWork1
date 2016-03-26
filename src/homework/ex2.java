package homework;
import java.util.*;

public class ex2 {
	
	public static void main(String[] args) {
            ex2 obj1 = new ex2();
            permuteString obj2 = new permuteString();
                    
            int ans1 = obj1.walk("NNEESNESENNENWW");
		
            //Answer 1.1
            System.out.println("Answer1 : "+ ans1);
               
           //Answer 1.2
            new permuteString("ABCD").print();
            
            //Answer 1.3
            System.out.println("Answer3 : "+ obj1.search(new String[]{"us", "gb", "jp"}, "jp"));
            
            //Answer 1.4
            System.out.println("Answer4 : "+ obj2.anagram("largely", "gallery"));
            
            //Answer 1.5
            System.out.println("Answer5 : "+ obj2.isPalindrome("racecar"));
            
	}
        int walk(String p){
		int x = 0;
		int y = 0;
		double c = 0;

		char[] ch1 = p.toCharArray();
		for(int i=0; i<ch1.length;i++){
			if (ch1[i] =='N' ){
				++x;
			}else if(ch1[i] =='E' ){
				++y;
			}else if(ch1[i] =='S' ){
				--x;
			}else if(ch1[i] =='W' ){
				--y;
			}
		}
		//System.out.println("x : "+ x);
		//System.out.println("y : "+ y);
		c = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
		
		return (int)c ;
	}
        
        void permute(String beginningString, String endingString) {
            if (endingString.length() <= 1)
                System.out.println(beginningString + endingString);
            else
            for (int i = 0; i < endingString.length(); i++) {
                String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                permute(beginningString + endingString.charAt(i), newString);
            }
        }

        boolean search(String[] w,String c){
            for(int i =0;i < w.length; i++){
                if(w[i].equals(c)){
                    return true;
                }
            }
            return false;
        }
}
class permuteString{
    public String text;
    public List<String> word = new ArrayList<String>();
    
    public permuteString(){}
    public permuteString(String w){
        getPermute(w);
    }
    
    void permute(String beginningString, String endingString) {
        if(endingString != null){
            if (endingString.length() <= 1){
                this.word.add(beginningString + endingString);
            }else{
                for (int i = 0; i < endingString.length(); i++) {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    permute(beginningString + endingString.charAt(i), newString);
                }
            }
        }
    }
     public String getPermute(String word){
         permute("",word);
         return word.toString();
     }
     public void print(){
         permute("",this.text);
         System.out.println(word.toString());
     }
     
     boolean anagram(String text, String text2){
         permute("",text);
         for(int i =0;i < this.word.size();i++){
             if(this.word.get(i).equals(text2)){
                 return true;
             }
         }
         return false;
     }
     
     boolean isPalindrome(String t){
         boolean palindrom = false;
         char[] wort = t.toCharArray();
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}
