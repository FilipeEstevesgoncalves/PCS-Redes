package simuladorderedes.controle;

import javax.swing.JTextArea;
import simuladorderedes.modelo.Dao.LogDao;

public class LogControle {
    
    public void salvarLog(String log){
        LogDao dao = new LogDao(log);
    }
}
