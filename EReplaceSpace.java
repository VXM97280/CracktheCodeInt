package CrackTheCode;

import java.util.Scanner;

import junit.framework.Test;

public class EReplaceSpace {
	public static void main(String[] args){
//		Scanner str = new Scanner(System.in);
//		String str1 = str.nextLine();
//		System.out.println(replaceSpace(str,7));
		
		Test tst = new Test();
        char[] ch = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
        int length = 6;
        tst.replaceSpace(ch, length);  
		
	}
	public static void replaceSpace(char[] str, int length){
		int SpaceCount = 0,newLength =0,i=0;
		//char[] str = str1.toCharArray();
		
		for (i =0;i<length;i++){
			if(str[i]==' ');
			SpaceCount++;
				
		}
	    newLength = length + (SpaceCount * 2);
        str[newLength] = '\0';
        for(i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str);
    }
		
		
	}


