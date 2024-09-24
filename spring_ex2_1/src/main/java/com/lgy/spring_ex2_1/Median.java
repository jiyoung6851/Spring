package com.lgy.spring_ex2_1;

public class Median {
	private int x,y,z;
	
	public void process() {
		if(x>y && x>z) {
			if(y>z) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+y );
			}else if(z>y) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+z );
			}
		}
		if(y>x && y>z) {
			if(x>z) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+x );
			}else if(z>x) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+z );
			}
		}
		if(z>x && z>y) {
			if(x>y) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+x );
			}else if(y>x) {
				System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+y );
			}
		}
	}
	public void process2() {
		int[] arr = {x,y,z};
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		if(x != max && x != min) {
			System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+x );
		}
		if(y != max && y != min) {
			System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+y );
		}
		if(z != max && z != min) {
			System.out.println("입력된 정수 "+x+"와 "+y+"와 "+z+"의 중간값은 "+z );
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
