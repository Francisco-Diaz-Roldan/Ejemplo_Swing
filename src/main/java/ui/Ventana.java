package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton;
    private JLabel label;
    private JTextField textField1;

    public Ventana(){
        this.setSize(500,500);
        this.setTitle("Mi primera ventanita en Swing");
        this.setResizable(false); //Esto es para que no se pueda mover
        this.setContentPane(panel);
        //this.pack();//Ajusta la ventana al contenido independientemente de lo que haya pusto antes
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addActionListener((e)-> {cambiarTextto();});//Hace que al pulsar el boton se llane al metodo cambiarTexto para cambiar el texto
        /*
        //Esto es exactamente igual que lo de arriba
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarTextto();
            }
        });*/

    }

    private void cambiarTextto(){
        label.setText(textField1.getText());

    }

}
