package com.example.oasistask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            buttonadd,buttonsub,buttonmul,buttondiv,buttonequal,buttonc;

    EditText editText;

    float ValueOne,ValueTwo;

    boolean Addition,Subtract,Multiplication,Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        buttonadd=(Button) findViewById(R.id.buttonadd);
        buttonsub=(Button) findViewById(R.id.buttonsub);
        buttonmul=(Button) findViewById(R.id.buttonmul);
        buttondiv=(Button) findViewById(R.id.buttondiv);
        buttonequal=(Button) findViewById(R.id.buttoneql);
        buttonc=(Button) findViewById(R.id.buttonC);

        editText=(EditText) findViewById(R.id.edt1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        }); button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        }); button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else
                {
                    ValueOne=Float.parseFloat(editText.getText()+"");
                    Addition=true;
                    editText.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else
                {
                    ValueOne=Float.parseFloat(editText.getText()+"");
                    Subtract=true;
                    editText.setText(null);
                }
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else
                {
                    ValueOne=Float.parseFloat(editText.getText()+"");
                    Multiplication=true;
                    editText.setText(null);
                }
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null)
                {
                    editText.setText("");
                }
                else
                {
                    ValueOne=Float.parseFloat(editText.getText()+"");
                    Division=true;
                    editText.setText(null);
                }
            }
        });

        buttonequal.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueTwo=Float.parseFloat(editText.getText()+"");
                if(Addition==true)
                {
                    editText.setText(ValueOne+ValueTwo+"");
                    Addition=false;
                }
                if(Subtract==true)
                {
                    editText.setText(ValueOne-ValueTwo+"");
                    Subtract=false;
                }
                if(Multiplication==true)
                {
                    editText.setText(ValueOne*ValueTwo+"");
                    Multiplication=false;
                }
                if(Division==true)
                {
                    editText.setText(ValueOne/ValueTwo+"");
                    Division=false;
                }
            }
        }));

        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
      });


    }
}