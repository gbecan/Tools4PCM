package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;

public class Header extends AbstractCell implements Serializable {
	
	public Header(int x, int y, String value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}

		public Header() {
		}
	
	
}
