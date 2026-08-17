package org.tnsif.acc.c2tc.Methodoverriding_super_this_Instanceof;

class Notification 
{
	String message="Default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification from whatsapp";
	
	void showNotification()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
}

public class SuperOverriding {

	public static void main(String[] args) {
		PushNotification obj=new PushNotification();
		obj.showNotification();
	}

}