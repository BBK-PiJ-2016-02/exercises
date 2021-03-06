public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.run();
    }

    public void run() {
        SmartPhone phone = new SmartPhone("Apple");

        /*
            `MobilePhone phone = new SmartPhone("Apple");`

            2.2 The above won't work as the MobilePhone class does not implement
            the browseWeb or findPosition methods, a potential solution is to
            either introduce those methods to that class, remove calls to those
            methods or switch the type hint to SmartPhone.
         */

        phone.call("01234 567890");
        phone.browseWeb("https://www.google.com/");
        phone.findPosition();

        this.testPhone(phone);

        MobilePhone backupPhone = new MobilePhone("Nokia");
        this.testPhone(backupPhone);
    }

    public void testPhone(Phone phone) {
        /*
            2.3 The only methods we can call here is the `call` methods, is that
            is the only method featured in the Phone interface
         */
        phone.call("01234 567890");
    }

    /*
        2.4 & 2.5 We get an error (incompatible types): changing the signature
        of the testPhone method to hint at SmartPhone, we lose the ability to
        pass any of the previously inherited classes, however in return we get
        the benefit of the additional methods available on SmartPhone.

    public void testPhone(SmartPhone phone) {
        phone.call("01234 567890");
        phone.browseWeb("https://www.google.com/");
        phone.findPosition();
    }
     */
}