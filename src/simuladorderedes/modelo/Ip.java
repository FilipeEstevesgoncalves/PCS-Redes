package simuladorderedes.modelo;

public class Ip {

    private StringBuilder ip;
    private int[] octetos = new int[4];

    /**
     * Construtor Transforma 4 numeros entre 255 e 0 em hexadecimal e passa para
     * uma StringBuilder
     */
    public Ip() {

        this.ip = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            octetos[i] = randInt(0, 255);
            this.ip.append(octetos[i]);
            this.ip.append(".");
        }
        ip.deleteCharAt(ip.length() - 1);
    }

    public Ip(int octeto1, int octeto2, int octeto3, int octeto4) {
        this.ip = new StringBuilder();

        this.ip.append(octeto1);
        this.ip.append(".");
        this.ip.append(octeto2);
        this.ip.append(".");
        this.ip.append(octeto3);
        this.ip.append(".");
        this.ip.append(octeto3);
        
        octetos[0]= octeto1;
        octetos[1]= octeto2;
        octetos[2]= octeto3;
        octetos[3]= octeto4;
    }
        
    public Ip(String octeto1, String octeto2, String octeto3, String octeto4) {
        this.ip = new StringBuilder();

        this.ip.append(octeto1);
        this.ip.append(".");
        this.ip.append(octeto2);
        this.ip.append(".");
        this.ip.append(octeto3);
        this.ip.append(".");
        this.ip.append(octeto4);
        
        
        octetos[0]= Integer.parseInt(octeto1);
        octetos[1]= Integer.parseInt(octeto2);
        octetos[2]= Integer.parseInt(octeto3);
        octetos[3]= Integer.parseInt(octeto4);
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

    public String getOctetoNaPosicao(int i) {
        return Integer.toString(octetos[i]);
    }
    
    
}
