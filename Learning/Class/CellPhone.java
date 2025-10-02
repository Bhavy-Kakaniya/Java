class Phone {
    public void ringing() {
        System.out.println("The phone is ringing");
    }

    public void vibrating() {
        System.out.println("The phone is vibrating");
    }

    public void callFriend() {
        System.out.println("Calling friend");
    }
}

public class cellphone {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.ringing();
        iphone.vibrating();
        iphone.callFriend();
    }
}
