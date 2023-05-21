package Calculadora;

import Aula1805.CapturaEventoBotao;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceCalculadora implements ActionListener {
    private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaoPonto, botaoIgual, botaoMais, botaoMenos, botaoMult, botaoDiv, botao0;
    private JTextField display;
    JTextField textField = new JTextField();
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    double num, result;
    int calculation;

    public void janelaCalculadora() {

        frame.setSize(500, 608);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        textField.setBounds(17, 11, 470, 110);
        textField.setFont(new Font("Arial", Font.BOLD, 40));
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);


        botao0 = new JButton("0");
        botao0.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao0.setBounds(17, 487, 110,110);
        frame.add(botao0);
        botao0.addActionListener(this);

        botao1 = new JButton("1");
        botao1.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao1.setBounds(17,368, 110, 110);
        frame.add(botao1);

        botao2 = new JButton("2");
        botao2.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao2.setBounds(137,368, 110, 110);
        frame.add(botao2);

        botao3 = new JButton("3");
        botao3.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao3.setBounds(257,368, 110, 110);
        frame.add(botao3);

        botao4 = new JButton("4");
        botao4.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao4.setBounds(17, 249, 110,110);
        frame.add(botao4);

        botao5 = new JButton("5");
        botao5.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao5.setBounds(137, 249, 110,110);
        frame.add(botao5);

        botao6 = new JButton("6");
        botao6.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao6.setBounds(257, 249, 110,110);
        frame.add(botao6);

        botao7 = new JButton("7");
        botao7.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao7.setBounds(17, 130, 110,110);
        frame.add(botao7);

        botao8 = new JButton("8");
        botao8.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao8.setBounds(137, 130, 110,110);
        frame.add(botao8);

        botao9 = new JButton("9");
        botao9.setFont(new Font("SansSerif", Font.BOLD, 20));
        botao9.setBounds(257, 130, 110,110);
        frame.add(botao9);


        botaoPonto = new JButton(".");
        botaoPonto.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoPonto.setBounds(137, 487, 110, 110);
        frame.add(botaoPonto);

        botaoIgual = new JButton("=");
        botaoIgual.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoIgual.setBounds(257, 487, 110, 110);
        frame.add(botaoIgual);

        botaoMais = new JButton("+");
        botaoMais.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoMais.setBounds(377, 487, 110, 110);
        frame.add(botaoMais);

        botaoMenos = new JButton("-");
        botaoMenos.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoMenos.setBounds(377, 368, 110, 110);
        frame.add(botaoMenos);

        botaoMult = new JButton("*");
        botaoMult.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoMult.setBounds(377, 249, 110, 110);
        frame.add(botaoMult);

        botaoDiv = new JButton("/");
        botaoDiv.setFont(new Font("SansSerif", Font.BOLD, 20));
        botaoDiv.setBounds(377, 130, 110, 110);
        frame.add(botaoDiv);

        frame.setVisible(true);
    }
    InterfaceCalculadora(){
        janelaCalculadora();
        addActionEvent();
    }

    public void addActionEvent(){
        botao0.addActionListener(this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botaoMult.addActionListener(this);
        botaoMais.addActionListener(this);
        botaoMenos.addActionListener(this);
        botaoDiv.addActionListener(this);
        botaoIgual.addActionListener(this);
        botaoPonto.addActionListener(this);



    }
    public static void main(String[] args){
        InterfaceCalculadora calculadora = new InterfaceCalculadora();
        calculadora.janelaCalculadora();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source ==botao0){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText() + "0");
            }
        }else if(source ==botao1){
            textField.setText(textField.getText() + "1");
        }else if(source ==botao2){
            textField.setText(textField.getText() + "2");
        }else if(source ==botao3){
            textField.setText(textField.getText() + "3");
        }else if(source ==botao4){
            textField.setText(textField.getText() + "4");
        }else if(source ==botao5){
            textField.setText(textField.getText() + "5");
        }else if(source ==botao6){
            textField.setText(textField.getText() + "6");
        }else if(source ==botao7){
            textField.setText(textField.getText() + "7");
        }else if(source ==botao8){
            textField.setText(textField.getText() + "8");
        }else if(source ==botao9){
            textField.setText(textField.getText() + "9");
        }else if(source ==botaoPonto){
            if(textField.getText().contains(".")){
                return;
            }else{
                textField.setText(textField.getText() + ".");
            }
        }else if(source == botaoMais){
            String str = textField.getText();
            num = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        }else if(source ==botaoMenos){
            String str = textField.getText();
            num = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        }else if(source ==botaoMult){
            String str = textField.getText();
            num = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "*");
        }else if(source ==botaoDiv){
            String str = textField.getText();
            num = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if(source == botaoIgual){
            switch (calculation){
                case 1:
                    result = num + Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;

                case 2:
                    result = num - Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;

                case 3:
                    result = num * Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;

                case 4:
                    result = num / Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;
            }
        }


    }
}
