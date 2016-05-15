package nullPointerExceptionExample;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str=null;
		try{
		if(str.equals("Test"))
		{
			System.out.println(str);
		}
		else{
			System.out.println("Not Match");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString()+"\t\t String Value Not Be Null");
		}
		
	}

}


