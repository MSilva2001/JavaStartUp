package week1commit;

public class lamp {

        // stores the value for light
        // true if light is on
        // false if light is off
        boolean isOn;

        // method to turn on the light
        public void turnOn() {
            isOn = true;
            System.out.println("Light on? " + isOn);

        }

        public static void main(String[] args) {

            // create an object of Lamp
            lamp led = new lamp();

            // access method using object
            led.turnOn();
        }

        public void turnOff() {
        }
    }

