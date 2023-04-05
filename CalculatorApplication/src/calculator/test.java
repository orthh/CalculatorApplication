package calculator;

import java.util.ArrayList;
import java.util.Stack;

public class test {
	
	public static void main(String[] args) {
		System.out.println(getCalculate("1+2*3/4"));
		
	}
	
	
	static String getCalculate(String str) {
		char operation[] = {'+', '-', '*', '/', '%'};
		
		ArrayList<String> postfix = new ArrayList<>();
		Stack<Character> opStack = new Stack<>();
		Stack<String> calStack = new Stack<>();
		String num = "";
		
		// -로 시작하는 경우 예외 처리
		if(str.charAt(0) == '-') {
			str = "0" + str;
		}
		
		// 후위 연산자로 변경
		for(int i = 0; i < str.length(); i++) {
			boolean checkOp = false;
			for(int j = 0; j < operation.length; j++) {
				if(str.charAt(i) == operation[j]) {
					
					checkOp = true;
					
					if(!num.equals("")) {
						postfix.add(num);
						num = "";
					}
					
					if(operation[j] == '(') { // '(' 이면 무조건 push
						opStack.push(operation[j]);
					}else if(operation[j] == ')') { 
						// '(' 나오기 전까지 
						while(opStack.peek() != '(' && !opStack.isEmpty()) {
							postfix.add(opStack.pop().toString());
						}
						// '(' pop
						opStack.pop();
					}else {
						if(opStack.isEmpty()) {
							opStack.push(operation[j]);
						}else {
							if(opOrder(opStack.peek()) < opOrder(operation[j])) {
								opStack.push(operation[j]);
							}else {
								postfix.add(opStack.pop().toString());
								opStack.push(operation[j]);
							}
						}
					}
				}
			}
			
			if(!checkOp) {
				num += str.charAt(i);
			}
			
		}
		
		// 남은 숫자 처리
		if(!num.equals("")) {
			postfix.add(num);
		}
		
		// 남은 연산자 처리
		while(!opStack.isEmpty()) {
			postfix.add(opStack.pop().toString());
		}
		
		// 후위 연산자를 이용해 최종 결과 구하기
		for(int i = 0; i < postfix.size(); i++) {
			calStack.push(postfix.get(i));
			for(int j = 0; j < operation.length; j++) {
				if(postfix.get(i).charAt(0) == operation[j]) {
					calStack.pop();
					Double n2 = Double.parseDouble(calStack.pop());
					String re = "";
					
					if(operation[j] == '%') {
						re = Double.toString(n2 * 0.01);
					}else {
						Double n1 = Double.parseDouble(calStack.pop());
						if(operation[j] == '+') {
							re = Double.toString(n1 + n2);
						}else if(operation[j] == '-') {
							re = Double.toString(n1 - n2);
						}else if(operation[j] == '*') {
							re = Double.toString(n1 * n2);
						}else if(operation[j] == '/') {
							re = Double.toString(n1 / n2);
						}
					}
			
					calStack.push(re);
				}
			}
		}
		
		Double result = Double.parseDouble(calStack.pop());
		String calResult[] = Double.toString(result).split("\\.");

		if(Double.parseDouble(calResult[1]) == 0) {  
			if(3 <= calResult[1].length() && calResult[1].substring(0, 2).equals("0E")) {
				return Double.toString(result);
			}else { // 정수 일때, 
				return calResult[0];
			}
		}else { //실수일때
			return String.format("%.10f", result);
		}
	}
	
	//연산자 우선순위
	// % > X == / > + == - > 나머지
	static int opOrder(char op) {
		switch(op) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '%':
				return 3;
			default:
				return -1;
		}
	}
}
	


