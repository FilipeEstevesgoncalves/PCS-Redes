package simuladorderedes.modelo;


import java.io.Serializable;
import java.util.ArrayList;
import simuladorderedes.modelo.equipamento.DesktopModelo;
import simuladorderedes.modelo.equipamento.EquipamentoModelo;
import simuladorderedes.modelo.equipamento.HubModelo;
import simuladorderedes.modelo.equipamento.RoteadorModelo;
import simuladorderedes.modelo.equipamento.SwitchModelo;
import simuladorderedes.visao.TelaPrincipal;

public class RedeModelo implements Serializable{

    private static ArrayList<EquipamentoModelo> equipamentos = new ArrayList<>();
    private static int TAMANHO_TOTAL_EQUIPAMENTOS = 20;
    private static String[] nomes = new String[TAMANHO_TOTAL_EQUIPAMENTOS];
    private static int numeroEquipamentosTotal = 0;
    private static int numeroDesktops = 0;
    private static int numeroHubs = 0;
    private static int numeroRoteadores = 0;
    private static int numeroSwithcs = 0;

    public RedeModelo() {
    }

    public static int getTAMANHO_TOTAL_EQUIPAMENTOS() {
        return TAMANHO_TOTAL_EQUIPAMENTOS;
    }

    public static int getNumeroDesktops() {
        return numeroDesktops;
    }

    public static int getNumeroHubs() {
        return numeroHubs;
    }

    public static int getNumeroRoteadores() {
        return numeroRoteadores;
    }

    public static int getNumeroSwithcs() {
        return numeroSwithcs;
    }
    
    
    public static void setEquipamentos(ArrayList<EquipamentoModelo> equipamentos) {
        RedeModelo.equipamentos = equipamentos;
    }

    public static void setTAMANHO_TOTAL_EQUIPAMENTOS(int TAMANHO_TOTAL_EQUIPAMENTOS) {
        RedeModelo.TAMANHO_TOTAL_EQUIPAMENTOS = TAMANHO_TOTAL_EQUIPAMENTOS;
    }

    public static void setNumeroEquipamentosTotal(int numeroEquipamentosTotal) {
        RedeModelo.numeroEquipamentosTotal = numeroEquipamentosTotal;
    }

    public static void setNumeroDesktops(int numeroDesktops) {
        RedeModelo.numeroDesktops = numeroDesktops;
    }

    public static void setNumeroHubs(int numeroHubs) {
        RedeModelo.numeroHubs = numeroHubs;
    }

    public static void setNumeroRoteadores(int numeroRoteadores) {
        RedeModelo.numeroRoteadores = numeroRoteadores;
    }

    public static void setNumeroSwithcs(int numeroSwithcs) {
        RedeModelo.numeroSwithcs = numeroSwithcs;
    }

    
    public DesktopModelo criarDesktop() {
        StringBuilder sb = new StringBuilder("Desktop ");
        numeroDesktops++;
        sb.append(numeroDesktops);
        DesktopModelo desktop = new DesktopModelo(sb.toString());
        equipamentos.add(desktop);
        nomes[numeroEquipamentosTotal] = desktop.getNome();
        numeroEquipamentosTotal++;
        return desktop;
    }

    public SwitchModelo criarSwitch() {
        StringBuilder sb = new StringBuilder("Switch ");
        numeroSwithcs++;
        sb.append(numeroSwithcs);
        SwitchModelo sw = new SwitchModelo(sb.toString());
        equipamentos.add(sw);
        nomes[numeroEquipamentosTotal] = sw.getNome();
        numeroEquipamentosTotal++;
        return sw;
    }

    public HubModelo criarHub() {
        StringBuilder sb = new StringBuilder("Hub ");
        numeroHubs++;
        sb.append(numeroHubs);
        HubModelo hub = new HubModelo(sb.toString());
        equipamentos.add(hub);
        nomes[numeroEquipamentosTotal] = hub.getNome();
        numeroEquipamentosTotal++;
        return hub;
    }

    public RoteadorModelo criarRoteador() {
        StringBuilder sb = new StringBuilder("Roteador ");
        numeroRoteadores++;
        sb.append(numeroRoteadores);
        RoteadorModelo roteador = new RoteadorModelo(sb.toString());
        equipamentos.add(roteador);
        nomes[numeroEquipamentosTotal] = roteador.getNome();
        numeroEquipamentosTotal++;
        return roteador;
    }

    public void editaDesktop(DesktopModelo desktop, Ip ip) {
        desktop.setIp(ip);
        TelaPrincipal.escreveNoLog(desktop.getNome() + "alterado");

    }

    public void editaRoteador(RoteadorModelo roteador, Ip ip) {
        roteador.setIpPrivado(ip);

    }

    public static boolean botaoSalvarDesktop(DesktopModelo desktop, String nome, Ip ip) {
        String nomeAntigo = desktop.getNome();
        if (desktop.getNome() == nome && desktop.getIp() == ip) {
            return false;
        } else {
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i] == nomeAntigo) {
                    nomes[i] = nome;
                }
            }
            desktop.setNome(nome);
            desktop.setIp(ip);
            return true;
        }
    }

    public static boolean botaoSalvarRoteador(RoteadorModelo roteador, String nome, Ip ip) {
        String nomeAntigo = roteador.getNome();
        if (roteador.getNome() == nome && roteador.getIp() == ip) {
            return false;
        } else {
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i] == nomeAntigo) {
                    nomes[i] = nome;
                }
            }
            roteador.setNome(nome);
            roteador.setIpPrivado(ip);
            return true;
        }
    }

    public static ArrayList<EquipamentoModelo> getEquipamentos() {
        return equipamentos;
    }
    

    public static void setNomes(String[] nomes) {
        RedeModelo.nomes = nomes;
    }

    public static String[] getNomes() {
        return nomes;
    }

    public void transmissãoPacote(String equipamentoEmissor, String equipamentoReceptor) {
        for (int i = 0; i < equipamentos.size(); i++) {
            if (equipamentos.get(i).getNome() == equipamentoEmissor) {
                EquipamentoModelo emissor = equipamentos.get(i);
            } else if (equipamentos.get(i).getNome() == equipamentoReceptor) {
                EquipamentoModelo receptor = equipamentos.get(i);
            }
        }

    }

    public static String adicionaEquipamento(EquipamentoModelo equipamentoEmissor, String equipamentoString) {

        for (EquipamentoModelo equipamento : equipamentos) {
            if (equipamento.getNome() == equipamentoString) {
                equipamentoEmissor.adicionaMac(equipamento.getMac());
                return equipamento.getMac().toString();
            }
        }
        return "Não encontrado";

    }

    public static void enviarMensagem(String emissor, String receptor) {
        EquipamentoModelo equipamentoEmissor = null;
        EquipamentoModelo equipamentoReceptor = null;
        for (EquipamentoModelo equipamento : equipamentos) {
            if (equipamento.getNome() == emissor) {
                equipamentoEmissor = equipamento;
            } else if (equipamento.getNome() == receptor) {
                equipamentoReceptor = equipamento;
            }
        }
        if (saoEquipamentosFinais(equipamentoEmissor, equipamentoReceptor)) {
            if (equipamentoEmissor.TemIpArmazenado(equipamentoReceptor.getIp())) {
                
                TelaPrincipal.escreveNoLog("\nMensagem enviada");
            } else if (equipamentoEmissor.temMac(equipamentoReceptor.getMac())) {
                
                if (equipamentoEmissor.TemIpArmazenado(equipamentoReceptor.getIp())) {
                    
                    TelaPrincipal.escreveNoLog("\nMensagem enviada");
                } else {
                    TelaPrincipal.escreveNoLog("\nIp " + equipamentoReceptor.getIp()
                            + " não encontrado \nFazendo broadcast\nQuem tem IP " + equipamentoReceptor.getIp() + "?");
                    equipamentoEmissor.adicionaTabelaArp(equipamentoReceptor.getIp(), equipamentoReceptor.getMac());
                    equipamentoReceptor.adicionaTabelaArp(equipamentoEmissor.getIp(), equipamentoEmissor.getMac());
                    TelaPrincipal.escreveNoLog("\nEquipamento " + equipamentoReceptor.getTipo() + "\nIp: " + equipamentoReceptor.getIp()
                            + "\n mac: " + equipamentoReceptor.getMac() + "\nadicionado a tabela arp de " + equipamentoEmissor.getNome());
                    TelaPrincipal.escreveNoLog("\nMensagem enviada");
                }

            }

        }

    }

    private static boolean saoEquipamentosFinais(EquipamentoModelo equipamentoEmissor, EquipamentoModelo equipamentoReceptor) {
        return equipamentoEmissor.temIp() && equipamentoReceptor.temIp();
    }

    public static int getNumeroEquipamentosTotal() {
        return numeroEquipamentosTotal;
    }
    public static EquipamentoModelo getEquipamentoUnico(String nome){
        for (EquipamentoModelo equipamento : equipamentos) {
            if (equipamento.getNome() == nome) {
                return equipamento;
            }
        }
        return null;
    }   
    
    
}
