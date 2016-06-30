package simuladorderedes.modelo;

import java.io.Serializable;


public class EnderecoMac implements Serializable{

    private StringBuilder mac;

    
    public EnderecoMac(String a) {
        this.mac = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            this.mac.append(Long.toHexString(randInt(0, 255)));
            this.mac.append(":");
        }
        mac.deleteCharAt(mac.length()- 1);
    }
    

    public StringBuilder getMac() {
        return mac;
    }

    public void setMac(StringBuilder mac) {
        this.mac = mac;
    }

    
    public static int randInt(int minimo, int maximo) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((maximo - minimo) + 1) + minimo;
        return randomNum;
    }

    public EnderecoMac(int i) {
        mac = new StringBuilder("0:0:0:0");
    }

    @Override
    public String toString() {
        return mac.toString();
    }

    
    
    

    /**
     * Transforma a StringBuilder mac em uma String
     * @return uma String
     */

}
