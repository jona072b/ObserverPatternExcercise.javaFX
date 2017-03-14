public class Test {
    public static void main(String[] args) {
        //Opretter et ElectronicDevice objekt, uden nogle parametre
        ElectronicDevice ed1 = new ElectronicDevice();

        //Opretter 3 DiodeLight og 1 Power usage objekt
        DiodeLight dl1 = new DiodeLight("Diode 1", ed1);
        DiodeLight dl2 = new DiodeLight("Diode 2", ed1);
        DiodeLight dl3 = new DiodeLight("Diode 3", ed1);
        PowerUsage pu1 = new PowerUsage("Strøm 1", ed1);

        //Skrifter lidt rund i de forskellige tilstande som vores ElectronicDevice har
        ed1.setState("off");
        System.out.println("");
        ed1.setState("on");
        System.out.println("");
        ed1.setState("hibernate");
        System.out.println("");

        //De sidste to skift har den nye Diode på
        //ed1.setState("OFF");
        //ed1.removeObserver(dl2);

        // Så er diode 2 fjernet fra listen.
        //System.out.println();
        //ed1.setState("HIBERNATE");
    }
}