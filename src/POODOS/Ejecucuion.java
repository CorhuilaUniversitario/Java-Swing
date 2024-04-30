package POODOS;

import javax.swing.*;
public class Ejecucuion {
    public static void main(String[] args) {

        Programa prog = new Programa();
        String opcion = "";
        String cad= "";

        do {
            opcion=JOptionPane.showInputDialog(null,
                    "A) Registar Computador\n" +
                            "B) Mostrar datos del computador\n" +
                            "C) Salir");

            switch (opcion.charAt(0)){
                case 'a':
                case 'A':
                    prog.setMarca(JOptionPane.showInputDialog(null,
                            "Digite la marca del PC"));
                    prog.setDico(Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Digite el valor del disco")));
                    prog.setGrafica(Boolean.parseBoolean(JOptionPane.showInputDialog(null,
                            "Digite true si tiene grafica y false si no la posee")));
                    prog.setMemoria(Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Digite si el valor de la memoria ram")));
                    prog.setModelo(JOptionPane.showInputDialog(null,
                            "Digite el modelo del PC"));
                    prog.setSistema(JOptionPane.showInputDialog(null,
                            "Digite el nombre del sistema operativo"));
                break;

                case 'b':
                case 'B':
                    cad+="La marca del Pc es: "+" "+prog.getMarca()+"\n"+
                    "El modelo del PC es: "+" "+prog.getModelo()+"\n"+
                    "La memoria Ram es: "+" "+prog.getMemoria()+"\n"+
                    "El tamaño del disco duro es: "+" "+prog.getDico()+"\n"+
                    "El sistema operativo es:"+" "+prog.getSistema()+"\n"+
                    "y la tarjeta grafica :"+" "+prog.isGrafica();

                    JOptionPane.showMessageDialog(null,cad);
                break;

                case 'c':
                case 'C':
                    JOptionPane.showMessageDialog(null,"Saliendoo");
                break;

                default:
                    JOptionPane.showMessageDialog(null,"Error","Error la cagaste",JOptionPane.ERROR_MESSAGE);
                break;
            }
        }while (!opcion.equalsIgnoreCase("c"));

    }
}
