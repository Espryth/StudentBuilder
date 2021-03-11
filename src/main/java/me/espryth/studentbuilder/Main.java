package me.espryth.studentbuilder;

import me.espryth.studentbuilder.module.Module;
import me.espryth.studentbuilder.module.MainModule;
public class Main {

    public static void main(String... args) {
        Module module = new MainModule();
        module.send();
    }
}
