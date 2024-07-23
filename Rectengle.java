package edu.ljmca.test;

public class Rectengle {
	public float w,l;

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Rectengle w=" + w + ", l=" + l + w*l;
	}
	
}
