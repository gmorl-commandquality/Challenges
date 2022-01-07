package Calculator;

// importing necessary libraries
import java.awt.*;
import java.awt.event.*;

// Our class extends Frame class and implements ActionListener interface

public  class calculatorFrame extends Frame implements ActionListener {

    // creating instances of TextField and Button class
    String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "."};
    String operatorButtonText[] = {"/", "sqrt", "*", "%", "-", "+", "="};
    String specialButtonText[] = {"Backspc", "CE", "-"};


    int FRAME_WIDTH = 350, FRAME_HEIGHT = 350;
    final int HEIGHT = 30, WIDTH = 30, H_SPACE = 10, V_SPACE = 10;
    final int TOPX = 30, TOPY = 50;
    double num1, num2, result, check;
    TextField displayLabel = new TextField();
    Button digit[] = new Button[11];
    Button operator[] = new Button[7];
    Button specialOperator[] = new Button[3];


    // instantiating using constructor
    calculatorFrame() {
        int tempX, y;

        displayLabel.setBounds(TOPX, TOPY, 240, HEIGHT);
        displayLabel.setBackground(Color.PINK);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.addActionListener(this);
        add(displayLabel);

        //set Co-ordinates for Special Buttons

        tempX = TOPX + 1 * (WIDTH + H_SPACE);
        y = TOPY + 1 * (HEIGHT + V_SPACE);
        for (int i = 0; i < specialButtonText.length; i++) {
            specialOperator[i] = new Button(specialButtonText[i]);
            specialOperator[i].setBounds(tempX, y, WIDTH * 2, HEIGHT);
            specialOperator[i].addActionListener(this);
            add(specialOperator[i]);
            specialOperator[i].setForeground(Color.RED);
            tempX = tempX + 2 * WIDTH + H_SPACE;
        }

        //set Co-ordinates for Digit Buttons

        int digitX = TOPX + WIDTH + H_SPACE;
        int digitY = TOPY + 2 * (HEIGHT + V_SPACE);
        tempX = digitX;
        y = digitY;

        for (int i = 0; i < digitButtonText.length; i++) {
            digit[i] = new Button(digitButtonText[i]);
            digit[i].setBounds(tempX, y, WIDTH, HEIGHT);
            digit[i].addActionListener(this);
            add(digit[i]);

            tempX += WIDTH + H_SPACE;
            if ((i + 1) % 3 == 0) {
                tempX = digitX;
                y += HEIGHT + V_SPACE;
            }

        }

        //set Co-ordinates for Operator Buttons

        int opsX = digitX + 3 * (WIDTH + H_SPACE) + H_SPACE;
        int opsY = digitY;
        tempX = opsX;
        y = opsY;
        for (int i = 0; i < operatorButtonText.length; i++) {
            operator[i] = new Button(operatorButtonText[i]);
            operator[i].setBounds(tempX, y, WIDTH, HEIGHT);
            operator[i].setForeground(Color.RED);
            operator[i].addActionListener(this);
            add(operator[i]);
            tempX += WIDTH + H_SPACE;

            if ((i + 1) % 2 == 0) {
                tempX = opsX;
                y += HEIGHT + V_SPACE;
            }
        }

        setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String z, zt;
        //NUMBER BUTTON
        if (e.getSource() == digit[0]) {
            zt = displayLabel.getText();
            z = zt + "7";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[1]) {
            zt = displayLabel.getText();
            z = zt + "8";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[2]) {
            zt = displayLabel.getText();
            z = zt + "9";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[3]) {
            zt = displayLabel.getText();
            z = zt + "4";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[4]) {
            zt = displayLabel.getText();
            ;
            z = zt + "5";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[5]) {
            zt = displayLabel.getText();
            z = zt + "6";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[6]) {
            zt = displayLabel.getText();
            z = zt + "1";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[7]) {
            zt = displayLabel.getText();
            z = zt + "2";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[8]) {
            zt = displayLabel.getText();
            z = zt + "3";
            displayLabel.setText(z);
        }
        if (e.getSource() == digit[9]) {
            zt = displayLabel.getText();
            z = zt + "0";
            displayLabel.setText(z);
        }

        if (e.getSource() == digit[10]) { //ADD DECIMAL PTS
            zt = displayLabel.getText();
            z = zt + ".";
            displayLabel.setText(z);
        }


        if (e.getSource() == specialOperator[2]) { //FOR NEGATIVE
            zt = displayLabel.getText();
            z = zt + "-";
            displayLabel.setText(z);
        }
        if (e.getSource() == specialOperator[1]) { //FOR clear
            z = " ";
            displayLabel.setText(z);
        }

        if (e.getSource() == specialOperator[0]) {  // FOR  BACKSPACE
            zt = displayLabel.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            } catch (StringIndexOutOfBoundsException f) {
                return;
            }
            displayLabel.setText(z);
        }

        //AIRTHMETIC BUTTON
        if (e.getSource() == operator[5]) {                     //FOR ADDITION
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }
            z = "";
            displayLabel.setText(z);
            check = 1;
        }

        if (e.getSource() == operator[4]) {                     //FOR SUBTRACTION
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }
            z = "";
            displayLabel.setText(z);
            check = 2;
        }

        if (e.getSource() == operator[1]) {                     //FOR square root
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }

            z = Double.toString(Math.sqrt(num1));
            displayLabel.setText(z);

        }

        if (e.getSource() == operator[2]) {                     //FOR MULTIPLE
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }
            z = "";
            displayLabel.setText(z);
            check = 3;
        }
        if (e.getSource() == operator[0]) {                     //FOR DIVISION
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }
            z = "";
            displayLabel.setText(z);
            check = 4;
        }

        if (e.getSource() == operator[3]) {                     //FOR MOD
            try {
                num1 = Double.parseDouble(displayLabel.getText());
            } catch (NumberFormatException f) {
                displayLabel.setText("Invalid Format");
                return;
            }
            z = "";
            displayLabel.setText(z);
            check = 5;
        }

        //RESULT BUTTON
        if (e.getSource() == operator[6]) {
            try {
                num2 = Double.parseDouble(displayLabel.getText());
            } catch (Exception f) {
                displayLabel.setText("ENTER NUMBER FIRST ");
                return;
            }
            if(check==1) {
                result = num1 + num2;
            }

            if(check==2) {

                result = num1 - num2;
                displayLabel.setText(String.valueOf(result));
                if(num1<num2){
                    displayLabel.setText(String.valueOf(result));
                }
            }

            if(check==3) {
                result = num1 * num2;
                displayLabel.setText(String.valueOf(result));
            }



            if(check==4) {
                result = num1 / num2;
                displayLabel.setText(String.valueOf(result));
            }

            if(check==5) {
                result = num1 % num2;
                displayLabel.setText(String.valueOf(result));
            }



        }
    }
    public static void main(String args[]) {

        new calculatorFrame();
    }
}