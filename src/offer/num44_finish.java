package offer;
//·­×ªµ¥´ÊË³ÐòÁÐ
public class num44_finish {
	public String ReverseSentence(String str) {
		if(str.length()==0||str==null)
            return str;
        else 
		{
			String []str1=str.split(" ");
            StringBuffer str2=new StringBuffer();
            if(str1.length==0)
                return str;
			for(int i=str1.length-1;i>-1;i--)
			{
				str2.append(str1[i]);
				str2.append(" ");
			}
			if(str2.length()>0)
				str2.deleteCharAt(str2.length()-1);
            return str2.toString();
		}
 }
} 
