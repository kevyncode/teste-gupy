package questao05;

/**
 * Classe principal para simular a lógica dos interruptores e lâmpadas.
 */
public class LampSwitch {
    public static void main(String[] args) {
        // Simular interruptores e lâmpadas
        Switch switch1 = new Switch();
        Switch switch2 = new Switch();
        Switch switch3 = new Switch();

        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Conectar interruptores às lâmpadas
        switch1.connectBulb(bulb1);
        switch2.connectBulb(bulb2);
        switch3.connectBulb(bulb3);

        // Passo 1: Ligar o primeiro interruptor por um tempo
        switch1.turnOn();
        wait(5);  // Esperar por 5 segundos (simulação)

        // Passo 2: Desligar o primeiro interruptor e ligar o segundo interruptor
        switch1.turnOff();
        switch2.turnOn();

        // Passo 3: Verificar o estado das lâmpadas
        System.out.println("Estados das lâmpadas:");
        checkBulbState(bulb1, "Lâmpada 1");
        checkBulbState(bulb2, "Lâmpada 2");
        checkBulbState(bulb3, "Lâmpada 3");
    }

    /**
     * Método para simular uma espera.
     * @param seconds Número de segundos para esperar.
     */
    private static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método para verificar o estado de uma lâmpada.
     * @param bulb A lâmpada a ser verificada.
     * @param name O nome da lâmpada para exibição.
     */
    private static void checkBulbState(Bulb bulb, String name) {
        if (bulb.isOn()) {
            System.out.println(name + " está acesa.");
        } else if (bulb.isWarm()) {
            System.out.println(name + " está apagada, mas quente.");
        } else {
            System.out.println(name + " está apagada e fria.");
        }
    }
}

/**
 * Classe simulada para representar um interruptor.
 */
class Switch {
    private Bulb bulb;

    /**
     * Conecta uma lâmpada ao interruptor.
     * @param bulb A lâmpada a ser conectada.
     */
    public void connectBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    /**
     * Liga o interruptor.
     */
    public void turnOn() {
        bulb.turnOn();
    }

    /**
     * Desliga o interruptor.
     */
    public void turnOff() {
        bulb.turnOff();
    }
}

/**
 * Classe simulada para representar uma lâmpada.
 */
class Bulb {
    private boolean on = false;
    private boolean warm = false;

    /**
     * Liga a lâmpada.
     */
    public void turnOn() {
        on = true;
        warm = true;
    }

    /**
     * Desliga a lâmpada.
     */
    public void turnOff() {
        on = false;
        warm = true; // A lâmpada permanece quente por um tempo
    }

    /**
     * Verifica se a lâmpada está acesa.
     * @return true se a lâmpada estiver acesa, false caso contrário.
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Verifica se a lâmpada está quente.
     * @return true se a lâmpada estiver quente, false caso contrário.
     */
    public boolean isWarm() {
        return warm;
    }
}