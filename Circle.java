package edu.ljmca.geometry;

public class Circle {
	public float pi,r;

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle pi=" + pi + ", r=" + r + " = "+ pi*r*r ;
	}
	
}
