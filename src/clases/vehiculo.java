/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Andric
 */
public class vehiculo extends Propiedades implements Impuesto {

    /**
     * @return the modelo
     */
    public Double getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Double modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipoCombustion
     */
    public String getTipoCombustion() {
        return tipoCombustion;
    }

    /**
     * @param tipoCombustion the tipoCombustion to set
     */
    public void setTipoCombustion(String tipoCombustion) {
        this.tipoCombustion = tipoCombustion;
    }

    private Double modelo;
    private String tipoCombustion;

    @Override
    public double liquidarImpuesto() {
        double impuesto = avaluo * 0.85; // 85% del avalúo comercial

        return impuesto;
    }

}
