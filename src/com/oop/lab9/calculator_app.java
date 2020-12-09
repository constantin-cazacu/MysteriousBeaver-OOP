package com.oop.lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.InputMethodListener;

public class calculator_app{
    private JPanel CalculatorPanel;
    private JTextField textField1;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton additionButton;
    private JButton multiplicationButton;
    private JButton subtractionButton;
    private JButton divisionButton;
    private JButton Btn1;
    private JButton Btn2;
    private JButton Btn3;
    private JButton Btn6;
    private JButton Btn5;
    private JButton Btn4;
    private JButton Btn7;
    private JButton Btn8;
    private JButton Btn9;
    private JButton Btn0;
    private JButton BtnDecPoint;
    private JButton equalButton;
    private JLabel label1;
    private JButton negativeButton;
    private JLabel errorMsg;

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operator;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new calculator_app().CalculatorPanel );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void checkDivisor(double number) throws UnluckyException, DivideBy0{
        if(number == 13){
            throw new UnluckyException();
        }
        else if(number == 0){
            throw new DivideBy0();
        }
    }

    private void getOperator(String BtnText){
        operator = BtnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public calculator_app() {

        Btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        Btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        Btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        Btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        Btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        Btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        Btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        Btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        Btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        Btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                int number = textField1.getText().length() - 1;
                String store;
                if(length > 0){
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textField1.setText(store);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
                label1.setText("");
                errorMsg.setText("");
            }
        });
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = additionButton.getText();
                getOperator(btnText);
                label1.setText(total1 + "+");
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = subtractionButton.getText();
                getOperator(btnText);
                label1.setText(total1 + "-");
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = divisionButton.getText();
                getOperator(btnText);
                label1.setText(total1 + "/");
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = multiplicationButton.getText();
                getOperator(btnText);
                label1.setText(total1 + "*");
            }
        });
        BtnDecPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    BtnDecPoint.setEnabled(false);
                }
                else {
                    String BtnDecPointText = textField1.getText() + BtnDecPoint.getText();
                    textField1.setText(BtnDecPointText);
                }
                BtnDecPoint.setEnabled(true);
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        label1.setText("");
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        label1.setText("");
                        break;
                    case '/':
                        try {
                            checkDivisor(Double.parseDouble(textField1.getText()));
                        } catch (UnluckyException err) {
                            errorMsg.setText("Unlucky! divided by 13");
                            break;
                        } catch (DivideBy0 err) {
                            errorMsg.setText("Division by 0? That is illegal!");
                            break;
                        }
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        label1.setText("");
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        label1.setText("");
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + operator);
                }
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        negativeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp = Double.parseDouble(textField1.getText());
                temp *= -1;
                textField1.setText(String.valueOf(temp));
            }
        });
    }
}
