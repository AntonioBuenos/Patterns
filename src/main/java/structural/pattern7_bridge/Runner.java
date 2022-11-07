package structural.pattern7_bridge;

import structural.pattern7_bridge.devices.Device;
import structural.pattern7_bridge.devices.Radio;
import structural.pattern7_bridge.devices.Tv;
import structural.pattern7_bridge.remotes.AdvancedRemote;
import structural.pattern7_bridge.remotes.BasicRemote;

public class Runner {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
