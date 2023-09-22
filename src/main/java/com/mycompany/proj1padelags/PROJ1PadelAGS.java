
package com.mycompany.proj1padelags;

import Controllers.CourtController;
import Models.courtQueries;
import Models.Court;
import Views.insertForm;

public class PROJ1PadelAGS {

    public static void main(String[] args) {
        
        Court crt = new Court();
        courtQueries sqlModel = new courtQueries();
        insertForm iForm = new insertForm();
        
        CourtController cctr = new CourtController(crt, sqlModel, iForm);
        cctr.iniciar();
        iForm.setVisible(true);
    }
}
