/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto.vistas.AcercaDe;
import proyecto.vistas.MenuPrincipal;
import proyecto.vistas.CrearVector;
import proyecto.vistas.IngresarDatos;
import proyecto.vistas.Instructivo;
import proyecto.vistas.MostrarListado;
import proyecto.vistas.MostrarMayor;

public class Controlador implements ActionListener {

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

        this.vistaAcercaDe = new AcercaDe();
        vistaPrincipal.btnAcercaDe.addActionListener(this);
        vistaAcercaDe.btnCerrarAcercaDe.addActionListener(this);

        this.vistaCrearVector = new CrearVector();
        vistaPrincipal.btnCrearVector.addActionListener(this);
        vistaCrearVector.btnCerrarCrearVector.addActionListener(this);
        vistaCrearVector.btnEnviarVector.addActionListener(this);

        this.vistaIngresarDatos = new IngresarDatos();
        vistaPrincipal.btnIngresarDatos.addActionListener(this);
        vistaIngresarDatos.btnCerrarIngresarDatos.addActionListener(this);
        vistaIngresarDatos.btnEnviarDatosVector.addActionListener(this);

        this.vistaInstructivo = new Instructivo();
        vistaPrincipal.btnInstructivo.addActionListener(this);
        vistaInstructivo.btnCerrarInstructivo.addActionListener(this);

        this.vistaMostrarListado = new MostrarListado();
        vistaPrincipal.btnMostrarListado.addActionListener(this);
        vistaMostrarListado.btnCerrarMostrarListado.addActionListener(this);

        this.vistaMostrarMayor = new MostrarMayor();
        vistaPrincipal.btnMostrarMayor.addActionListener(this);
        vistaMostrarMayor.btnCerrarMostrarMayor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object buttonPressed = ae.getSource();
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
            String arrayPrint = "";
            for (int i = 0; modeloMain.getArrayNumbers().length > i; i++) {
                arrayPrint = arrayPrint + (i + ": " + modeloMain.getData(i)+"\n");
            }
            vistaMostrarListado.txtPaneListado.setText(arrayPrint);
        } else if (buttonPressed == vistaPrincipal.btnMostrarMayor) {
            vistaMostrarMayor.setVisible(true);
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
            vistaPrincipal.setVisible(false);
        } else if (buttonPressed == vistaCrearVector.btnEnviarVector) {
            modeloMain.setLenghtArray(Integer.parseInt(vistaCrearVector.txtEnviarVector.getText()));
            int returnCodeCreate = modeloMain.createArray();
            if (returnCodeCreate == 400) {
                vistaCrearVector.lblCrearVector.setText("Vector Creado. Tamaño: " + modeloMain.getLenghtArray());
            } else if (returnCodeCreate == 200) {
                vistaCrearVector.lblCrearVector.setText("Vector Ya Creado");
            }
        } else if (buttonPressed == vistaIngresarDatos.btnEnviarDatosVector) {
            int posData = Integer.parseInt(vistaIngresarDatos.txtIngresarPosicion.getText());
            int valData = Integer.parseInt(vistaIngresarDatos.txtIngresarVariable.getText());
            vistaIngresarDatos.lblPosicionVector.setText("" + posData);
            vistaIngresarDatos.lblVariableIngreso.setText("" + valData);
            modeloMain.loadData(posData, valData);
            for (int i = 0; modeloMain.getArrayNumbers().length > i; i++) {
                System.out.println("Pos: " + i + " Val: " + modeloMain.getData(i));
            }
        }
    }
}
