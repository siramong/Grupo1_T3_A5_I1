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

public class Controlador implements ActionListener {
    
    MenuPrincipal vistaPrincipal;
    Modelo modeloMain;
    
    public Controlador(MenuPrincipal vistaPrincipal, Modelo modeloMain) {
        this.vistaPrincipal = vistaPrincipal;
        this.modeloMain = modeloMain;
        
        vistaPrincipal.btnAcercaDe.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object buttonPressed = ae.getSource();
        if (buttonPressed == vistaPrincipal.btnAcercaDe) {
            System.out.println("Showed acerca de");
            AcercaDe vistaAcercaDe = new AcercaDe();
            vistaAcercaDe.setVisible(true);
        }
    }
}
