package com.revature.eval.java.core;

public class ScrabbleLauncher {
	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
		int result = es.getScrabbleScore("OxyphenButazone");
		System.out.println(result);
	}

}
