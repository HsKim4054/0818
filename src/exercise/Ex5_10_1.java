package exercise;

public class Ex5_10_1 {
	//강사님 풀이
	public static void main(String[] args) {
		char[] abcCode =
			 { '`','~','!','@','#','$','%','^','&','*',
			 '(',')','-','_','+','=','|','[',']','{',
			 '}',';',':',',','.','/'};
			 // 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String result = "!$&qup";
		String src = "";
		
		for(int i=0; i<result.length(); i++) {
			char ch = result.charAt(i);
			int idx = -1;
			
			if(ch>='a' && ch<='z') {
				for(int j=0; j<numCode.length; j++) {
					if(ch == numCode[j]) {
						idx = j;
						break;
					}
				}
				if(idx!= -1) src += (char)('0'+idx); 
			}
			else {
				for(int j=0; j<abcCode.length; j++) {
					if(ch==abcCode[j]) {
						idx = j;
						break;
					}
				}
				if(idx!= -1) src += (char)('a'+idx);
			}
		}
		System.out.println("result:"+result);
		System.out.println("src:"+src);
	}

}
