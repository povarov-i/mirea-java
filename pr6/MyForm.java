import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm {
    private Double firstOperand;
    private Double secondOperand;
    private Operation calcOperation;

    private JTextField results;
    private JButton ACButton;
    private JButton signButton;
    private JButton divideButton;
    private JButton sevenButton;
    private JButton fourButton;
    private JButton oneButton;
    private JButton zeroButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton multiplyButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton minusButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton plusButton;
    private JButton dotButton;
    private JButton equalsButton;
    private JPanel calculator;

    public MyForm() {
        oneButton.addActionListener(new NumberClicked(oneButton.getText()));
        twoButton.addActionListener(new NumberClicked(twoButton.getText()));
        threeButton.addActionListener(new NumberClicked(threeButton.getText()));
        fourButton.addActionListener(new NumberClicked(fourButton.getText()));
        fiveButton.addActionListener(new NumberClicked(fiveButton.getText()));
        sixButton.addActionListener(new NumberClicked(sixButton.getText()));
        sevenButton.addActionListener(new NumberClicked(sevenButton.getText()));
        eightButton.addActionListener(new NumberClicked(eightButton.getText()));
        nineButton.addActionListener(new NumberClicked(nineButton.getText()));
        zeroButton.addActionListener(new NumberClicked(zeroButton.getText()));

        multiplyButton.addActionListener(new OperationClicked(Operation.MULTIPLICATION));
        divideButton.addActionListener(new OperationClicked(Operation.DIVISION));
        plusButton.addActionListener(new OperationClicked(Operation.ADDITION));
        minusButton.addActionListener(new OperationClicked(Operation.SUBTRACTION));
        equalsButton.addActionListener(new EqualsClicked());
        ACButton.addActionListener(new ACClicked());
        signButton.addActionListener(new SignClicked());
        dotButton.addActionListener(new DotClicked());
    }

        private class NumberClicked implements ActionListener {
            private String value;
            public NumberClicked(String value) {
                this.value = value;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if(firstOperand == null || firstOperand == 0.0) {
                    System.out.println(firstOperand);
                    value = results.getText() + value;
                }else{
                    secondOperand = Double.valueOf(value);
                }
                results.setText(value);
            }
        }

        private class OperationClicked implements ActionListener {
            private Operation operation;

            public OperationClicked(Operation operation) {
                this.operation = operation;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                calcOperation = operation;
                firstOperand = Double.valueOf(results.getText());
            }
        }

        private class ACClicked implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("");
                firstOperand = 0.0;
                secondOperand = 0.0;
            }
        }

        private class DotClicked implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText());
            }
        }

        private class EqualsClicked implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double rslt = calcOperation.getOperator().applyAsDouble(firstOperand, secondOperand);
                results.setText((rslt % 1 == 0 ? String.valueOf(rslt.intValue()) : String.valueOf(rslt)));
                firstOperand = 0.0;
                secondOperand = 0.0;
            }
        }

        private class SignClicked implements  ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("-" + results.getText());
            }
        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new MyForm().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


