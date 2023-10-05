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
public class Propiedades {

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the avaluo
     */
    public Double getAvaluo() {
        return avaluo;
    }

    /**
     * @param avaluo the avaluo to set
     */
    public void setAvaluo(Double avaluo) {
        this.avaluo = avaluo;
    }

    protected String id;
    protected String propietario;
    protected Double avaluo;

}
