package com.example.calc;

import static com.example.calc.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, buDot, buPlusMinus, buC, buPlus, buMinus, buEqual, buDivide, buPercent, buMultiply;
    Boolean isNew = true;
    String oldNumber;
    String operator = "";
    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        editText = findViewById(id.editText);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu4 = findViewById(R.id.bu4);
        bu5 = findViewById(R.id.bu5);
        bu6 = findViewById(R.id.bu6);
        bu7 = findViewById(R.id.bu7);
        bu8 = findViewById(R.id.bu8);
        bu9 = findViewById(R.id.bu9);
        bu0 = findViewById(R.id.bu0);
        buC = findViewById(R.id.buC);
        buDivide = findViewById(R.id.buDivide);
        buPlus = findViewById(R.id.buPlus);
        buMinus = findViewById(R.id.buMinus);
        buEqual = findViewById(R.id.buEqual);
        buPlusMinus = findViewById(R.id.buPlusMinus);
        buDot = findViewById(R.id.buDot);
        buPercent = findViewById(R.id.buPercent);
        buMultiply = findViewById(R.id.buMultiply);
        bu1.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "1");

        });
        bu2.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "2");
        });
        bu3.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "3");
        });
        bu4.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "4");
        });
        bu5.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "5");
        });
        bu6.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "6");
        });
        bu7.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "7");
        });
        bu8.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "8");
        });
        bu9.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "9");
        });
        bu0.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "0");
        });
        buDot.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + ".");
        });
//        buPlusMinus.setOnClickListener(view -> {
//            editText.setText(editText.getText().toString() + "-");
//        });
        buMinus.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "-");
        });
        buPlus.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "+");
        });
        buDivide.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "/");
        });
        buPercent.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "%");
        });
        buMultiply.setOnClickListener(view -> {
            editText.setText(editText.getText().toString() + "*");
        });
        buC.setOnClickListener(view -> {
           editText.setText("");
        });
        buEqual.setOnClickListener(view -> {
            try {
                String text = editText.getText().toString();
                Double result = eval(text);
                if (result.isNaN() || result.isInfinite()) {
                    Toast.makeText(this, "Деление на ноль невозможно", Toast.LENGTH_LONG).show();
                    editText.setText("На ноль делить нельзя");
                } else {
                    editText.setText(result.toString());
                }
            } catch (Exception exception) {Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show();}
        });

    }



////    public void getBuPlus() {
//        String newNumber = editText.getText().toString();
//        Double result = 0.0;
//        if (newNumber.equals("0") && operator == "/" || newNumber.equals("")) {  //тоаст и деление на ноль
//            Toast.makeText(MainActivity.this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
//            editText.setText("На ноль делить нельзя");
//        } else {
//            switch (operator) {
//                case "+":
//                    result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
//                    break;
//            }
//            editText.setText(result + "");
//        }
//    }
//    public Button getBuDivide() {
//        String newNumber = editText.getText().toString();
//        Double result = 0.0;
////        if (newNumber.equals("0") && operator == "/" || newNumber.equals("")) {  //тоаст и деление на ноль
////            Toast.makeText(MainActivity.this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
////            editText.setText("На ноль делить нельзя");
////        } else {
////            switch (operator) {
////                case "/":
////                    result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
////                    break;
////            }
////            editText.setText(result + "");
////        }
//        return null;
//    }

//    public Button getBuMinus() {
//        String newNumber = editText.getText().toString();
//        Double result = 0.0;
//        if (newNumber.equals("0") && operator == "/" || newNumber.equals("")) {  //тоаст и деление на ноль
//            Toast.makeText(MainActivity.this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
//            editText.setText("На ноль делить нельзя");
//        } else {
//            switch (operator) {
//                case "-":
//                    result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
//                    break;
//            }
//            editText.setText(result + "");
//        }
//        return null;
//    }

//    public Button getBuMultiply() {
//        String newNumber = editText.getText().toString();
//        Double result = 0.0;
//        if (newNumber.equals("0") && operator == "/" || newNumber.equals("")) {  //тоаст и деление на ноль
//            Toast.makeText(MainActivity.this, "На ноль делить нельзя", Toast.LENGTH_LONG).show();
//            editText.setText("На ноль делить нельзя");
//        } else {
//            switch (operator) {
//                case "*":
//                    result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
//                    break;
//            }
//            editText.setText(result + "");
//        }
//        return null;
//    }
    //    public void clickNumber(View view) {//числа
//        if (isNew)
//            editText.setText("");
//        isNew = false;
//
//        String number = editText.getText().toString();
//
//        switch (view.getId()) {
//            case bu1:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                 number = number + "1";break;
//            case id.bu2:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                 number = number + "2";break;
//            case id.bu3:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                 number = number + "3";break;
//            case id.bu4:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                 number = number + "4";break;
//            case id.bu5:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                 number = number + "5";break;
//            case id.bu6:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                number = number + "6";break;
//            case id.bu7:
//                 if(zeroIsFirst(number) && number.length() ==1) {
//                     number = number.substring(1);
//                 }
//                number = number + "7";break;
//            case id.bu8:
//                if(zeroIsFirst(number) && number.length() ==1) {
//                    number = number.substring(1);
//                }
//                number = number + "8";break;
//            case id.bu9:
//                if(zeroIsFirst(number) && number.length() ==1) {
//                    number = number.substring(1);
//                }
//                number = number + "9";
//                break;
//            case id.bu0:
//                if(zeroIsFirst(number) && number.length() == 1){
//                       number = "0";
//            }else{
//                number = number + "0";
//            }
//                break;
//
//
//            case id.buDot:
//                if (dotIsPresent(number)) {
//
//                } else {
//                    number = number + ",";
//                }
//                break;
//            case id.buPlusMinus:
//                if (numberIsZero(number)) {
//                } else {
//                    if (minusIsPresent(number)) {
//                        number = number.substring(1);
//                    } else {
//                        number = "-" + number;
//                    }
//                }
//                break;
//        }
//        editText.setText(number);
//    }

    public boolean zeroIsFirst(String number) {  //запрет нескольких нолей
        if(number.equals("")){
            return true;
        }
        if(number.charAt(0) == '0') {
            return true;
        }else{
            return false;
        }
    }

    public boolean numberIsZero(String number) {//проверка метода +/-
        if(number.equals("0") || number.equals("")){   //1
            return true;
        }else {
            return false;
        }
    }

    public boolean minusIsPresent(String number) {//минус перед процентом
        if(number.charAt(0) == '-'){
            return true;
        }else {
            return false;
        }
    }

    public Button getBuC() {
        editText.setText("0");
        isNew=true;
        return null;
    }

    public boolean dotIsPresent(String number){//запятая
        if(number.indexOf(",") == -1 ) {
            return false;
        } else{
            return true;
        }
    }

    public void clickPercent(View view) {//процент
        if(operator == ""){
            String number = editText.getText().toString();
            double temp = Double.parseDouble(number)/ 100;
            number = temp+"";
            editText.setText(number);
        }else {
            Double result = 0.0;
            String newNumber = editText.getText().toString();
            switch (operator){
                case "+": result = Double.parseDouble(oldNumber) + Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) / 100;
                break;
                case "-": result = Double.parseDouble(oldNumber) - Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) / 100;
                break;
                case "*": result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber)/ 100;
                break;
                case "/": result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber) * 100;
                break;
            }
            editText.setText(result+"");
            operator="";
        }
    }
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}

