/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.VistaLote;
import vistas.VistaVehiculo;
import vistas.VistaVivienda;
import vistas.vistaBienvenida;

/**
 *
 * @author Andric
 */
public class Controlador implements ActionListener {

    //def classes & views
    Impuesto Impuestos;

    //Objets
    Lote objlote;
    Propiedades objpropiedades;
    vehiculo objvehiculo;
    Vivienda objvivienda;

    //views
    vistaBienvenida vistabv;
    VistaVivienda vistaviv;
    VistaLote vistalote;
    VistaVehiculo vistavehi;

    public Controlador() {

        //Classes
        objlote = new Lote();
        objpropiedades = new Propiedades();
        objvehiculo = new vehiculo();
        objvivienda = new Vivienda();
        //Views
        vistabv = new vistaBienvenida();
        vistaviv = new VistaVivienda();
        vistalote = new VistaLote();
        vistavehi = new VistaVehiculo();
        //Active buttons on wview
        vistabv.getLiqLotebtn().addActionListener(this);
        vistabv.getLiqvehibtn().addActionListener(this);
        vistabv.getLiqvivbtn().addActionListener(this);
        vistalote.getLiqbtn().addActionListener(this);
        vistaviv.getLiqbtn().addActionListener(this);
        vistavehi.getLiqbtn().addActionListener(this);
        vistalote.getRegresarbtn().addActionListener(this);
        vistavehi.getRegresarbtn().addActionListener(this);
        vistaviv.getRegresarbtn().addActionListener(this);

    }

    // Start program on wview 
    public void Run() {
        vistabv.setResizable(true);
        vistabv.setLocationRelativeTo(null);
        vistabv.setTitle("INICIO");
        vistabv.setVisible(true);

    }

    //Active views
    public void activarLote() {

        vistalote.setResizable(true);
        vistalote.setLocationRelativeTo(null);
        vistalote.setTitle("Lote");
        vistalote.setVisible(true);

    }

    public void activarVivienda() {

        vistaviv.setResizable(true);
        vistaviv.setLocationRelativeTo(null);
        vistaviv.setTitle("Vivienda");
        vistaviv.setVisible(true);

    }

    public void activarVehiculo() {

        vistavehi.setResizable(true);
        vistavehi.setLocationRelativeTo(null);
        vistavehi.setTitle("Vehiculo");
        vistavehi.setVisible(true);

    }

    //Create objets
    private Lote crearLote() {

        objlote.setId(vistalote.getIdlotetxt().getText());
        objlote.setPropietario(vistalote.getProplotetxt().getText());
        objlote.setAvaluo(Double.parseDouble(vistalote.getAvaltxt().getText()));
        objlote.setArea(Double.parseDouble(vistalote.getAreatxt().getText()));

        return objlote;
    }

    private Vivienda crearVivienda() {

        objvivienda.setId(vistaviv.getIdvivtxt().getText());
        objvivienda.setPropietario(vistaviv.getPropvivtxt().getText());
        objvivienda.setAvaluo(Double.parseDouble(vistaviv.getAvalvivtxt().getText()));
        objvivienda.setAreaConstruida(Double.parseDouble(vistaviv.getAreavivtxt().getText()));

        return objvivienda;
    }

    private vehiculo crearVehiculo() {

        objvehiculo.setId(vistavehi.getIdvehitxt().getText());
        objvehiculo.setPropietario(vistavehi.getPropvehitxt().getText());
        objvehiculo.setAvaluo(Double.parseDouble(vistavehi.getAvaltxt().getText()));
        objvehiculo.setModelo(Double.parseDouble(vistavehi.getModeltxt().getText()));
        objvehiculo.setTipoCombustion(vistavehi.getCombustiontxt().getText());

        return objvehiculo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //view conditionals
        if (e.getSource() == vistabv.getLiqLotebtn()) {
            activarLote();
            vistabv.setVisible(false);
        }
        if (e.getSource() == vistabv.getLiqvehibtn()) {
            activarVehiculo();
            vistabv.setVisible(false);
        }
        if (e.getSource() == vistabv.getLiqvivbtn()) {
            activarVivienda();
            vistabv.setVisible(false);
        }

        //liquidaciones buttons conditionals
        if (e.getSource() == vistalote.getLiqbtn()) {
            crearLote();
            vistalote.getLiqlotetxt().setText("" + crearLote().liquidarImpuesto());
        }
        if (e.getSource() == vistavehi.getLiqbtn()) {
            crearVehiculo();
            vistavehi.getLiqtxt().setText("" + crearVehiculo().liquidarImpuesto());
        }
        if (e.getSource() == vistaviv.getLiqbtn()) {
            crearVivienda();
            vistaviv.getLiqvivtxt().setText("" + crearVivienda().liquidarImpuesto());
        }

        //regresar buttons
        if (e.getSource() == vistalote.getRegresarbtn()) {
            vistalote.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("INICIO");
            vistabv.setVisible(true);

        }
        if (e.getSource() == vistavehi.getRegresarbtn()) {

            vistavehi.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("INICIO");
            vistabv.setVisible(true);

        }
        if (e.getSource() == vistaviv.getRegresarbtn()) {

            vistaviv.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("INICIO");
            vistabv.setVisible(true);

        }
    }

}
