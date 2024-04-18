package br.lawtrel.Controller;
import br.lawtrel.Model.calcModel;
import br.lawtrel.View.calcView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class calcController {
    private calcView theView;
    private calcModel theModel;

    public calcController(calcView theView, calcModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalcListener(new calcListener());
    }
    class calcListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int n1, n2 = 0;
            try {
                n1 = theView.getn1();
                n2 = theView.getn2();

                theModel.addnumeros(n1,n2);
                theView.setCalcSolution(theModel.getCalcValor());
            }
            catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayError("Voce precisa entrar com 2 inteiros");
            }
        }
    }
}
