
package Controllers;

import Models.Court;
import Models.courtQueries;
import Views.insertForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourtController implements ActionListener {
    
    private final Court model;
    private final courtQueries sqlModel;
    private final insertForm insertForm;
    
    public CourtController(Court model, courtQueries sqlModel, insertForm insertForm) {
        
        this.model = model;
        this.sqlModel = sqlModel;
        this.insertForm = insertForm;
        this.insertForm.btnInsertCourtForm.addActionListener(this);
        
    }

    public void iniciar() {
        insertForm.setTitle("Registrar");
        insertForm.setLocationRelativeTo(null);
        insertForm.txtNameInsertCourtForm.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setName(insertForm.txtNameInsertCourtForm.getText());
        model.setUbication(insertForm.txtUbicationInsertCourtForm.getText());
        sqlModel.insert(model);
    }
    
}
