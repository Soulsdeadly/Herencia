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
public class Vivienda extends Propiedades implements Impuesto {

    /**
     * @return the areaConstruida
     */
    public Double getAreaConstruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(Double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    private Double areaConstruida;

    @Override
    public double liquidarImpuesto() {
        double impuesto = avaluo * 3.0 + areaConstruida * 10.0;

        return impuesto;
    }

}
