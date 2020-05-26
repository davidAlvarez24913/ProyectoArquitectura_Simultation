package cuarto.david;
import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        Ventana  ventana = new Ventana();
    }
}

class Ventana extends JFrame{
    Ventana(){
        // Caracteristicas de la ventana
        setTitle("SIMULACION MÁQUINA IAS");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);

        // Agregamos las capas en su respectiva posicion del BorderLayout
        // add(new CapaNorth(), BorderLayout.NORTH);    Se habilitara cuando se necesite esa capa
        add(new CapaSouth(), BorderLayout.SOUTH);
        add(new CapaWest(), BorderLayout.WEST);
        // add(new CapaEast(), BorderLayout.EAST); Se habilitara cuando se necesite esa capa
        add(new CapaCenter(), BorderLayout.CENTER);
    }
}
/*
class CapaNorth extends JPanel{

}
*/
class CapaSouth extends JPanel{
    CapaSouth(){
        JButton btnSumar        = new JButton();
        JButton btnRestar       = new JButton();
        JButton btnMultiplicar  = new JButton();
        JButton btnDividir      = new JButton();

        btnSumar.setText("Simulacion sumar");
        btnRestar .setText("Simulacion restar");
        btnMultiplicar.setText("Simulacion multiplicar");
        btnDividir.setText("Simulacion dividir");

        add(btnSumar);
        add(btnRestar );
        add(btnMultiplicar);
        add(btnDividir);
    }
}

class CapaWest extends JPanel{
    CapaWest(){
        JTextArea areaTexto = new JTextArea( "MEMORY" +
                "\n1. LOAD M(X) 500, ADD M(X) 501" +
                "\n2. STOR M(X)500" +
                "\n INSTRUCCIONS" +
                "\n 500. 3" +
                "\n 501. 4");

        add(areaTexto);
    }
}
/*
class CapaEast extends JPanel{

}
*/
class CapaCenter extends JPanel{
    CapaCenter(){
        // Array bidimensional de objetos con los datos de la tabla
        String[][] data = {{"PC",new String(String.valueOf("1"))},
                {"MAR",new String(String.valueOf(500))}, {"MBR",new String(String.valueOf(3))},{"IR",new String(String.valueOf("LOAD M(X)"))},{"IBR",new String(String.valueOf("ADD M(X)  501"))}
                ,{"AC",new String(String.valueOf(3))}};
        String[] columnNames = {"SECCION ALU","INSTRUCCION"};

        final JTable table = new JTable( data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 80));
        JScrollPane scrollpane = new JScrollPane(table);

        // add(jtx);
        add(scrollpane, BorderLayout.CENTER);
    }
}