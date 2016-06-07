package simuladorderedes.modelo;

/**
 *
 * @author Filipe
 */

public class Ip {
    
    private StringBuilder ip;
    private boolean privado;
//    private boolean Estatico;

    /**
     * Construtor
     * Transforma 4 numeros entre 255 e 0 em hexadecimal e passa para uma StringBuilder 
     */
    public Ip() {
        this.ip = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int numero = randInt(0, 255);
            this.ip.append(numero);
            this.ip.append(".");
        }
        ip.deleteCharAt(ip.length()- 1);
    }
    public Ip(String Iptexto){
        //Provisorio
        this.ip = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int numero = randInt(0, 255);
            this.ip.append(numero);
            this.ip.append(".");
        }
        ip.deleteCharAt(ip.length()- 1);
        
    }

    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    @Override
    public String toString() {
        return ip.toString();
    }
}
