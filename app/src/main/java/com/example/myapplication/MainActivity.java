// Лабораторная "Камень-ножницы-бумага", Волкова Екатерина, 22207.
package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.text.BreakIterator;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public Button button2;
    public Button button3;
    public TextView textView;
    int count1, count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // объекты для дизайна
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        // если выбрали камень
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 0) {
                    textView.setText("Ничья!"+"\n"+"Компьютер выбрал камень: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 1) {
                    count1++;
                    textView.setText("Ура, победа!"+"\n"+"Компьютер выбрал ножницы: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 2) {
                    count2++;
                    textView.setText("Поражение!"+"\n"+ "Компьютер выбрал бумагу: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if(count1 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты победил, поздравляю!" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;

                }
                if(count2 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты потерпел поражение:с" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;
                }
            }
        });
        // если выбрали ножницы
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 1) {
                    textView.setText("Ничья!" + "\n" + "Компьютер выбрал ножницы: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 0) {
                    count2++;
                    textView.setText("Поражение!" + "\n"+ "Компьютер выбрал камень: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 2) {
                    count1++;
                    textView.setText("Ура, победа!" + "\n"+ "Компьютер выбрал бумагу: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if(count1 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты победил, поздравляю!" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;
                }
                if(count2 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты потерпел поражение:с" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;
                }
            }
        });
        // если выбрали бумагу
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int i = random.nextInt(3);
                if (i == 2) {
                    textView.setText("Ничья!" + "\n" + "Компьютер выбрал бумагу: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 1) {
                    count2++;
                    textView.setText("Поражение!" + "\n" + "Компьютер выбрал ножницы: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if (i == 0) {
                    count1++;
                    textView.setText("Ура, победа!" + "\n" + "Компьютер выбрал камень: " + "\n" + "Игрок: " + count1 + "\n" + "Компьютер: " + count2);
                }
                if(count1 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты победил, поздравляю!" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;
                }
                if(count2 == 7) {
                    textView.setText("Игра окончена!" + "\n" + "Ты потерпел поражение:с" + "\n");
                    count1 = 0;
                    count2 = 0;
                    return;
                }
            }
        });
    }

    // если хотим начать игру сначала
    public void rest(View view) {
        count1 = 0;
        count2 = 0;
        textView.setText("Игрок: " + count1 + "\n" + "Компьютер: " + count2);
    }
}