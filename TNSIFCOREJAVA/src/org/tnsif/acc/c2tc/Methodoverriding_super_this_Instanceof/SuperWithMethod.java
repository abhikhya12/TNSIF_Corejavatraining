package org.tnsif.acc.c2tc.Methodoverriding_super_this_Instanceof;

class Payment1{
	void process()
	{
		System.out.println("payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("processing payment via google pay");
	}
	void completeTransaction()
	{
		super.process();
		process();
	}
}

public class SuperWithMethod {
	public static void main(String[] args) {
		GPay obj = new GPay();
		obj.completeTransaction();
	}

}