package br.lawtrel.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class calcView extends JFrame{
    private JTextField n1 = new JTextField(10);
    private  JLabel addLabel = new JLabel("+");
    private JTextField n2 = new JTextField(10);
    private JButton calcButton = new JButton("Calcular");
    private JTextField calcSolution = new JTextField(10);

    public calcView() {
        JPanel calcPanel = new JPanel();
        this.setTitle("Calculadora");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(n1);
        calcPanel.add(addLabel);
        calcPanel.add(n2);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }
    public int getn1() {
        return  Integer.parseInt(n1.getText());
    }
    public int getn2() {
        return  Integer.parseInt(n2.getText());
    }
    public int getcalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    public void addCalcListener(ActionListener listenForCalcButton) {
        calcButton.addActionListener(listenForCalcButton);
    }
    public void displayError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
