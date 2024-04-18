package br.lawtrel;

import br.lawtrel.View.calcView;
import br.lawtrel.Model.calcModel;
import br.lawtrel.Controller.calcController;
public class Main {
    public static void main(String[] args) {
        calcView theView = new calcView();
        calcModel theModel = new calcModel();
        calcController theController = new calcController(theView,theModel);
        theView.setVisible(true);
    }
}