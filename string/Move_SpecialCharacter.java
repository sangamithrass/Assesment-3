package string;

class Move_SpecialCharacter{
	 public static String moveSpecialCharacters(String str){
		 
		 int len=str.length();
		 String reg="[^a-zA-Z0-9]";
		 String res1="",res2="";
		 for(int i=0;i<str.length();i++)
	        {
	        	char c=str.charAt(i);
	        	if(String.valueOf(c).matches(reg))
	        	{
	        		res2=res2+c;
	        	}
	        	else
	        	{
	        		res1=res1+c;
	        	}
	        }
	 return res1+res2;
	}
	public static void main(String args[]){
	 String str = "He@#$llo!*&";
	 System.out.println(moveSpecialCharacters(str));
	 
	} 
	}
