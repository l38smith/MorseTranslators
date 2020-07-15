package davis.l;
import java.util.Scanner;
public class MorseTranslators {

	private String original;
	private String mcode;
	

	
	
	
	MorseTranslators(String m) {
	original = m;
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	MorseTranslators message = null;
	System.out.printf("Welcome to Translator!%n");
	
	
	boolean keepAsking = true;
	while (keepAsking) {   
		
		
	System.out.printf("Enter a text to translate (-1 to exit)\n ");
	String original  = sc.nextLine();  	
		
	    
	  
    if ("-1".equals(original)) {
    keepAsking = false;
    System.out.println("Good Bye!!");
    continue; }
    
   
	
       
     char c = original.charAt(0);
     if (Character.isLetterOrDigit(c)) {
     System.out.printf("Language detected: English\n");
     message = new MorseTranslators(original);
     System.out.println( message.getMorseCode());}
     
	
      
     c = original.charAt(0);      
     if  (!Character.isLetterOrDigit(c))   {    
     System.out.printf("Language detected: Morse Code\n");            
     message = new MorseTranslators(original);
     System.out.println( message.getString (original));}	}  }
	
    	 
   
    
    
	
	public String toMorse(char ch) {
	switch (ch) {
	case ' ':
	return "   ";
	case '0':
	return "-----";
	case '1':
	return ".----";
	case '2':
	return "..---";
	case '3':
	return "...--";
	case '4':
	return "....-";
	case '5':
	return ".....";
	case '6':
	return "-....";
	case '7':
	return "--...";
	case '8':
	return "---..";
	case '9':
	return "----.";
	case 'A':
	return ".-";
	case 'B':
	return "-...";
	case 'C':
	return "-.-.";
	case 'D':
	return "-..";
	case 'E':
	return ".";
	case 'F':
	return "..-.";
	case 'G':
	return "--.";
	case 'H':
	return "....";
	case 'I':
	return "..";
	case 'J':
	return ".---";
	case 'K':
	return "-.-";
	case 'L':
	return ".-..";
	case 'M':
	return "--";
	case 'N':
	return "-.";
	case 'O':
	return "---";
	case 'P':
	return ".--.";
	case 'Q':
	return "--.-";
	case 'R':
	return ".-.";
	case 'S':
	return "...";
	case 'T':
	return "-";
	case 'U':
	return "..-";
	case 'V':
	return "...-";
	case 'W':
	return ".--";
	case 'X':
	return "-..-";
	case 'Y':
	return "-.--";
	case 'Z':
	return "--..";
	
	}
	return "?";
	}
    
	
	//Converts the original string, into its equivalent morsecode, and returns.
	public String getMorseCode() {
	mcode = "";
	for (int j = 0; j < original.length(); j++) {
	mcode += toMorse(Character.toUpperCase(original.charAt(j))) + " ";
	}
	return mcode;
	}
	

	
	public String getOriginal() {
	return original;
	}
	public String morseToString(String morse)
	{
	   String str = " ";
	if(morse.equals("   "))
	str=" ";
	else if(morse.equals("-----"))
	str="0";
	else if(morse.equals(".----"))
	str="1";
	else if(morse.equals(".----"))
	str="2";
	else if(morse.equals("..---"))
	str="3";
	else if(morse.equals("....-"))
	str="4";
	else if(morse.equals("....."))
	str="5";
	else if(morse.equals("-...."))
	str="6";
	else if(morse.equals("--..."))
	str="7";
	else if(morse.equals("---.."))
	str="8";
	else if(morse.equals("----."))
	str="9";
	else if(morse.equals(".-"))
	str="A";
	else if(morse.equals("-..."))
	str="B";
	else if(morse.equals("-.-."))
	str="C";
	else if(morse.equals("-.."))
	str="D";
	else if(morse.equals("."))
	str="E";
	else if(morse.equals("..-."))
	str="F";
	else if(morse.equals("--."))
	str="G";
	else if(morse.equals("...."))
	str="H";
	else if(morse.equals(".."))
	str="I";
	else if(morse.equals(".---"))
	str="J";
	else if(morse.equals("-.-"))
	str="K";
	else if(morse.equals(".-.."))
	str="L";
	else if(morse.equals("--"))
	str="M";
	else if(morse.equals("-."))
	str="N";
	else if(morse.equals("---"))
	str="O";
	else if(morse.equals(".--."))
	str="P";
	else if(morse.equals("--.-"))
	str="Q";
	else if(morse.equals(".-."))
	str="R";
	else if(morse.equals("..."))
	str="S";
	else if(morse.equals("-"))
	str="T";
	else if(morse.equals("..-"))
	str="U";
	else if(morse.equals("...-"))
	str="V";
	else if(morse.equals(".--"))
	str="W";
	else if(morse.equals("-..-"))
	str="X";
	else if(morse.equals("-.--"))
	str="Y";
	else if(morse.equals("--.."))
	str="Z";
	else return
	"   ?   ";	
	return str.toLowerCase();
	
	
	
	}
	public String getString(String morse)
	{
		
		 String str=" ";
	   String args[]=morse.split(" ");
	   for(int i=0;i<args.length;i++)
	   {
	       str+=morseToString(args[i]);
	   }
	   return str;

	
	   
	
	}


	

}

	



















