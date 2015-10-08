package id.hewiya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvscoreteamA;
    private TextView tvscoreteamB;
    private Button btn3A;
    private Button btn2A;
    private Button btn1A;
    private Button btn3B;
    private Button btn2B;
    private Button btn1B;
    private Button btnreset;
    private int scoreteamA;
    private int scoreteamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
    private void  init()
    {
        tvscoreteamA = (TextView) findViewById(R.id.tv_score_team_A);
        tvscoreteamB = (TextView) findViewById(R.id.tv_score_team_B);
        btn3A = (Button) findViewById(R.id.btn_3_a);
        btn3B = (Button) findViewById(R.id.btn_3_b);
        btn2A = (Button) findViewById(R.id.btn_2_a);
        btn2B = (Button) findViewById(R.id.btn_2_b);
        btn1A = (Button) findViewById(R.id.btn_1_a);
        btn1B = (Button) findViewById(R.id.btn_1_b);
        btnreset = (Button) findViewById(R.id.btn_reset);
        scoreteamA = 0;
        scoreteamB = 0;


        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(2);
            }
        });
        btn1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(1);
            }
        });
        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btn1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
    }
    private void addPointToTeamA(int i) {
        scoreteamA += i;
        tvscoreteamA.setText(scoreteamA);
    }
    private void addPointToTeamB(int i) {
        scoreteamB += i;
        tvscoreteamB.setText(scoreteamB);
    }
}
