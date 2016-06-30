/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.cids.custom.tostringconverter.tutorial;

import de.cismet.cids.tools.CustomToStringConverter;

/**
 *
 * @author thorsten
 */
public class GcGeocacheToStringConverter extends CustomToStringConverter{

    @Override
    public String createString() {
        return String.valueOf(cidsBean.getProperty("name"))+" ("+ String.valueOf(cidsBean.getProperty("schluessel"))+")";
    }
    
}
