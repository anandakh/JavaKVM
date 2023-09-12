package com;

public class Result implements Student, Sports {
	public void displayscore() {
		System.out.println("Student score is:"+Student.score);
	}

	@Override
	public void displaysportsscore() {
		System.out.println("Sports score is:"+Sports.score);
		
	}
}
