package Lexicos;

import javax.swing.*;
import javax.xml.transform.Source;

public class Principal {
    public static void main(String[] args) {
        String caminho = "";
        JFileChooser fc = new JFileChooser();
        int retorno = fc.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = fc.getSelectedFile().getAbsolutePath();
            System.out.println(caminho);
        }
        Analizador ent = new Analizador(caminho);
        Token t = null;

        while ((t = ent.proximoToken())!=null){
            System.out.println(t);
        }
    }
}
