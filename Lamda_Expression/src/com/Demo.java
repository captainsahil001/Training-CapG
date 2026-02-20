package com;

@FunctionalInterface
public interface Demo {
	
//	void sample(int number,int numbers);
	
//	void test();  error as FI allows only 1 NS method
	
//	static void test(); error as static is complete method
	int sample(int number, int numbers);
	static void test() {
		
	}

}
