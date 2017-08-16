package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class JanelaTexto extends JFrame {

    private final JLabel etiqueta;
    private final JLabel etiqueta2;
    private final JTextField texto;

    public JanelaTexto() throws HeadlessException {

        super("Inversão de texto");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        etiqueta = new JLabel("Digite o texto: ");
        texto = new JTextField("Escreva aqui", 30);

        add(etiqueta);
        add(texto);

        etiqueta2 = new JLabel("");
        add(etiqueta2);

        texto.addActionListener(new inverteTexto());

    }

    private class inverteTexto implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuffer sb = new StringBuffer (texto.getText());
            sb.reverse();
            String impressao = sb.toString();
            etiqueta2.setText(impressao);
        }
    }

}
