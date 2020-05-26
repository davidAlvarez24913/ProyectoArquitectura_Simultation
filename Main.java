package cuarto.david;
import javax.swing.*;
import java.awt.*;

public class Main extends  JFrame {

    public  Main(){
        super("SIMULACION MÁQUINA IAS");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Main  ventana = new Main();
        ventana.setVisible(true);
        JButton boton1= new JButton();
        JButton boton2= new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();

        boton1.setText("Simulacion sumar");
        boton2.setText("simulacion restar");
        boton3.setText("Simulacion multiplicar");
        boton4.setText("Simulacion dividir");
        JTextArea jtx = new JTextArea( "MEMORY" +
                "\n1. LOAD M(X) 500, ADD M(X) 501" +
                "\n2. STOR M(X)500" +
                "\n INSTRUCCIONS" +
                "\n 500. 3" +
                "\n 501. 4");
        jtx.setVisible(true);
        boton1.setVisible(true);
        boton2.setVisible(true);
        boton3.setVisible(true);
        boton4.setVisible(true);
        //Array bidimensional de objetos con los datos de la tabla
        String[][] data = {{"PC",new String(String.valueOf("1"))},
        {"MAR",new String(String.valueOf(500))}, {"MBR",new String(String.valueOf(3))},{"IR",new String(String.valueOf("LOAD M(X)"))},{"IBR",new String(String.valueOf("ADD M(X)  501"))}
        ,{"AC",new String(String.valueOf(3))}};
        String[] columnNames = {"SECCION ALU","INSTRUCCION"};

        final JTable table = new JTable( data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 80));
        JScrollPane scrollpane = new JScrollPane(table);
        ventana.add(jtx);
        ventana.add(scrollpane, BorderLayout.CENTER);

        ventana.getContentPane().setLayout(new FlowLayout());
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(boton4);


    }
}
