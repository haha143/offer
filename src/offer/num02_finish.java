package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Ìæ»»¿Õ¸ñ
public class num02_finish {
    public static String replaceSpace(StringBuffer str) {
    	List<Integer>list=new ArrayList<Integer>();
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i)==' ')
    			list.add(i);
    	}
    	for(int i=0;i<list.size();i++)
    	{
    		if(i==0)
    		{
    			str.delete(list.get(i), list.get(i)+1);
    			str.insert(list.get(i), "%20");
    		}
    		else 
    		{
    			int offset=list.get(i)+2*i;
    			str.delete(offset, offset+1);
    			str.insert(offset, "%20");
    		}
    	}
    	return str.toString();
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer=stringBuffer.append(str);
		System.out.println(replaceSpace(stringBuffer));
		
	}
}
