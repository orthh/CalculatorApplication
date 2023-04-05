package calculator;


public class test {
	//static String record = "<html><p>첫번째 줄</p><p>두번째 줄</p></html>";
	static String record = "<html></html>";
	public static void main(String[] args) {
		System.out.println(test.record);
		String newStr = addString(test.record, "추가줄");
		
		System.out.println(newStr);
		// 결과
		
	}
	
	public static String addString(String str, String addStr) {
		String result = str;
		result = str.substring(0, str.length() - 7);
		result += "<p>";
		result += addStr; 
		result += "</p></html>";
		
		return result;
	}
	
	
}
	


