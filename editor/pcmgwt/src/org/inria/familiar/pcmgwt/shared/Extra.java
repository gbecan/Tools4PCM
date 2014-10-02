package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;

public class Extra extends AbstractCell implements Serializable{
	public Extra() {
	}
	public Extra(int x, int y, String value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}
}
