package com;

@FunctionalInterface
public interface Demo {
	
	void sample();
	
//	void test();  error as FI allows only 1 NS method
	
//	static void test(); error as static is complete method
	static void test() {
		
	}

}
