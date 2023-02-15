import org.omg.PortableInterceptor.AdapterManagerIdHelper;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boss Adam = new Boss();
        Adam.setDamage(80);
        Adam.setHealth(700);
        Adam.setProtection("magic");
        System.out.println(Adam.getDamage());
        System.out.println(Adam.getHealth());
        System.out.println(Adam.getProtection());



    }
}