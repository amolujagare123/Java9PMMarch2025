package Inheritance;

class Showroom {
    void channels() {
        System.out.println("Displaying channels...");
    }

    void volumecontrol() {
        System.out.println("Controlling volume...");
    }

    void settings() {
        System.out.println("Opening settings...");
    }
}

// Derived class Onida
class Onida extends Showroom {
    void channels() {
        System.out.println("Onida channels feature");
    }

    void volumecontrol() {
        System.out.println("Onida volume control");
    }

    void settings() {
        System.out.println("Onida settings");
    }
}

// Derived class Samsang
class Samsang extends Showroom {
    void channels() {
        System.out.println("Samsang channels feature");
    }

    void volumecontrol() {
        System.out.println("Samsang volume control");
    }

    void settings() {
        System.out.println("Samsang settings");
    }
}

// Derived class LG
class LG extends Showroom {
    void channels() {
        System.out.println("LG channels feature");
    }

    void volumecontrol() {
        System.out.println("LG volume control");
    }

    void settings() {
        System.out.println("LG settings");
    }
}

public class TestOverriding {

    public static void main(String[] args) {

        LG ob = new LG();

        Showroom showroom = (Showroom) ob;
        showroom.channels();

        Showroom showroom1 = new Samsang();
        showroom1.channels();
    }
}
