public class PhoneLauncher {
    /**
     * Application entry point
     * @param args Arguments for application
     */
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    /**
     * Create phone instances
     */
    public void launch() {
        OldPhone oldPhone = new OldPhone("Motorola");
        System.out.println("Brand: " + oldPhone.getBrand());
        oldPhone.call("07000000000");

        MobilePhone mobilePhone = new MobilePhone("Nokia");
        System.out.println("Brand: " + mobilePhone.getBrand());
        mobilePhone.printLastNumbers();
        mobilePhone.call("07111111111");
        mobilePhone.call("07222222222");
        mobilePhone.call("07333333333");
        mobilePhone.printLastNumbers();
        mobilePhone.call("07444444444");
        mobilePhone.call("07555555555");
        mobilePhone.call("07666666666");
        mobilePhone.call("07777777777");
        mobilePhone.call("07888888888");
        mobilePhone.call("07999999999");
        mobilePhone.call("07000000000");
        mobilePhone.call("07121212121");
        mobilePhone.printLastNumbers();
        mobilePhone.ringAlarm("Siren");
        mobilePhone.playGame("Snake");

        SmartPhone smartPhone = new SmartPhone("Samsung");
        System.out.println("Brand: " + smartPhone.getBrand());
        smartPhone.ringAlarm("BeepBeep");
        smartPhone.browseWeb("http://google.com/");
        System.out.println("Phone position: " + smartPhone.findPosition());
        smartPhone.call("07111111111");
        smartPhone.call("07222222222");
        smartPhone.call("07333333333");
        smartPhone.printLastNumbers();
        smartPhone.call("07444444444");
        smartPhone.call("07555555555");
        smartPhone.call("07666666666");
        smartPhone.call("07777777777");
        smartPhone.call("07888888888");
        smartPhone.call("07999999999");
        smartPhone.call("07000000000");
        smartPhone.call("00123456789");
        smartPhone.call("07121212121");
        smartPhone.printLastNumbers();
    }
}