package org;

public class Convert
{
	Currency gbp;
	Currency usd;
	
	public Convert() {
		super();
		this.gbp = new Gbp();
		this.usd = new Usd();
	}
}
