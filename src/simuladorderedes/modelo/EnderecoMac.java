package simuladorderedes.modelo;


/**
 *
 * @author Filipe
 */
public class EnderecoMac {

    private StringBuilder mac;
    /**
     * Construtor que faz uma string com 4 valores hexadecimais
     */
    public EnderecoMac() {
        this.mac = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            this.mac.append(Long.toHexString(randInt(0, 255)));
            this.mac.append("-");
        }
        mac.deleteCharAt(mac.length()- 1);
    }
    
    public EnderecoMac(EnumBroadcast tipo ) {
            this.mac = new StringBuilder("ff-ff-ff-ff");
    }
    /**
     * 
     * Gera numero inteiro randomico
     * 
     * @param minimo
     * @param maximo
     * @return Retorna um valor inteiro entre o numero minimo e numero maximo
     */
    public static int randInt(int minimo, int maximo) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((maximo - minimo) + 1) + minimo;
        return randomNum;
    }

    /**
     * Transforma a StringBuilder mac em uma String
     * @return uma String
     */
    @Override
    public String toString() {
        return mac.toString();
    }

}
