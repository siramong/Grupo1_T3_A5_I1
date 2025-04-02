/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

//importamos los action event y listener, ademas de todas las vistas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import proyecto.vistas.AcercaDe;
import proyecto.vistas.MenuPrincipal;
import proyecto.vistas.CrearVector;
import proyecto.vistas.IngresarDatos;
import proyecto.vistas.Instructivo;
import proyecto.vistas.MostrarListado;
import proyecto.vistas.MostrarMayor;

public class Controlador implements ActionListener {
    //definimos cada vista con su propia variable
    MenuPrincipal vistaPrincipal;
    Modelo modeloMain;
    AcercaDe vistaAcercaDe;
    CrearVector vistaCrearVector;
    IngresarDatos vistaIngresarDatos;
    Instructivo vistaInstructivo;
    MostrarListado vistaMostrarListado;
    MostrarMayor vistaMostrarMayor;

    public Controlador(MenuPrincipal vistaPrincipal, Modelo modeloMain) {
        this.vistaPrincipal = vistaPrincipal;
        this.modeloMain = modeloMain;

        this.vistaPrincipal.btnSalir.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaAcercaDe = new AcercaDe();
        vistaPrincipal.btnAcercaDe.addActionListener(this);
        vistaAcercaDe.btnCerrarAcercaDe.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaCrearVector = new CrearVector();
        vistaPrincipal.btnCrearVector.addActionListener(this);
        vistaCrearVector.btnCerrarCrearVector.addActionListener(this);
        vistaCrearVector.btnEnviarVector.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaIngresarDatos = new IngresarDatos();
        vistaPrincipal.btnIngresarDatos.addActionListener(this);
        vistaIngresarDatos.btnCerrarIngresarDatos.addActionListener(this);
        vistaIngresarDatos.btnEnviarDatosVector.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaInstructivo = new Instructivo();
        vistaPrincipal.btnInstructivo.addActionListener(this);
        vistaInstructivo.btnCerrarInstructivo.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaMostrarListado = new MostrarListado();
        vistaPrincipal.btnMostrarListado.addActionListener(this);
        vistaMostrarListado.btnCerrarMostrarListado.addActionListener(this);
        //hacer que los botones puedan ser "escuchados" o que manden una señal al ser precionados
        this.vistaMostrarMayor = new MostrarMayor();
        vistaPrincipal.btnMostrarMayor.addActionListener(this);
        vistaMostrarMayor.btnCerrarMostrarMayor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object buttonPressed = ae.getSource();
        //Mostrar las demas vistas si se ah precionado el boton respectivo, con el setVisible(true)
        if (buttonPressed == vistaPrincipal.btnAcercaDe) {
            vistaAcercaDe.setVisible(true);
        } else if (buttonPressed == vistaPrincipal.btnCrearVector) {
            vistaCrearVector.setVisible(true);
        } else if (buttonPressed == vistaPrincipal.btnIngresarDatos) {
            vistaIngresarDatos.setVisible(true);
        } else if (buttonPressed == vistaPrincipal.btnInstructivo) {
            vistaInstructivo.setVisible(true);
        } else if (buttonPressed == vistaPrincipal.btnMostrarListado) {
            vistaMostrarListado.setVisible(true);
            //poner los datos en la lista
            DefaultListModel<String> modeloLista = new DefaultListModel<>();
            for (int i = 0; i < modeloMain.getArrayNumbers().length; i++) {//for para r colocando los datos
                modeloLista.addElement(i + ": " + modeloMain.getData(i));//mostrar los datos
            }
            vistaMostrarListado.lstPanelListado.setModel(modeloLista);
        } else if (buttonPressed == vistaPrincipal.btnMostrarMayor) {
            vistaMostrarMayor.setVisible(true);
            int mayor = modeloMain.getData(0);//definimos datos para encontrar el mayor
            int posicion = 0;//definimos dato para la pocicion

            for (int i = 1; i < modeloMain.getArrayNumbers().length; i++) {//metodo for para poder encontrar el numero mayor
                if (modeloMain.getData(i) > mayor) {
                    mayor = modeloMain.getData(i);//cambio por si el numero anterior era inferior al de la pocicion actual
                    posicion = i;//pocicion del numero mayor
                }
            }
            vistaMostrarMayor.lblNumeroMayor.setText(Integer.toString(mayor));//mostrar en vista
            vistaMostrarMayor.lblPosicionNumeroMayor.setText(Integer.toString(posicion));//mostrar en vista
            
            //cerrar las vistas
        } else if (buttonPressed == vistaAcercaDe.btnCerrarAcercaDe) {
            vistaAcercaDe.setVisible(false);
        } else if (buttonPressed == vistaCrearVector.btnCerrarCrearVector) {
            vistaCrearVector.setVisible(false);
        } else if (buttonPressed == vistaIngresarDatos.btnCerrarIngresarDatos) {
            vistaIngresarDatos.setVisible(false);
        } else if (buttonPressed == vistaInstructivo.btnCerrarInstructivo) {
            vistaInstructivo.setVisible(false);
        } else if (buttonPressed == vistaMostrarListado.btnCerrarMostrarListado) {
            vistaMostrarListado.setVisible(false);
        } else if (buttonPressed == vistaMostrarMayor.btnCerrarMostrarMayor) {
            vistaMostrarMayor.setVisible(false);
        } else if (buttonPressed == vistaPrincipal.btnSalir) {
            vistaPrincipal.setVisible(false);//cerrar completamente el programa
            vistaPrincipal.dispose();
            //crear el vector
        } else if (buttonPressed == vistaCrearVector.btnEnviarVector) {
            modeloMain.setLenghtArray(Integer.parseInt(vistaCrearVector.txtEnviarVector.getText()));//definir el largo del vector
            modeloMain.createArray();//crear el vector
            vistaCrearVector.lblCrearVector.setText("Vector Creado. Tamaño: " + modeloMain.getLenghtArray());//mostrar en vista
            vistaPrincipal.btnIngresarDatos.setEnabled(true);//habilitar las otras vistas
            vistaPrincipal.btnMostrarMayor.setEnabled(true);//habilitar las otras vistas
            vistaPrincipal.btnMostrarListado.setEnabled(true);//habilitar las otras vistas
            //Recibir los datos y cambiarlos en el vector
        } else if (buttonPressed == vistaIngresarDatos.btnEnviarDatosVector) {
            int posData = Integer.parseInt(vistaIngresarDatos.txtIngresarPosicion.getText());//obtenemos dato pocicion
            int valData = Integer.parseInt(vistaIngresarDatos.txtIngresarVariable.getText());//obtenemos dato "variable"
            vistaIngresarDatos.lblPosicionVector.setText("" + posData);//mostramos el dato
            vistaIngresarDatos.lblVariableIngreso.setText("" + valData);//mostramos el dato
            modeloMain.loadData(posData, valData);//mandamos los datos al modelo "LoadData"
        }
    }
}
