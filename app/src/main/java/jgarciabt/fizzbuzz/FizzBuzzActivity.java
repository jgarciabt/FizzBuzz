package jgarciabt.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;

public class FizzBuzzActivity extends AppCompatActivity {

    private Button fizzBuzzButton;
    private Button rockPaperButton;
    private EditText inputEditText;
    private TextView fizzBuzzResultTextView;
    private Spinner playerOneSpinner;
    private Spinner playerTwoSpinner;
    private TextView rockPaperResultTextView;

    private GameController gameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);

        // FizzBuzz Views
        fizzBuzzButton = (Button) findViewById(R.id.fizz_buzz_button);
        inputEditText = (EditText) findViewById(R.id.number_input);
        fizzBuzzResultTextView = (TextView) findViewById(R.id.fizz_buzz_output);

        // Rock-Paper-Scissors-Lizard-Spock Views
        rockPaperButton = (Button) findViewById(R.id.rock_paper_button);
        playerOneSpinner = (Spinner) findViewById(R.id.player_1);
        playerTwoSpinner = (Spinner) findViewById(R.id.player_2);
        rockPaperResultTextView = (TextView) findViewById(R.id.rock_paper_output);

        initialiseController();

        fizzBuzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numberInput = inputEditText.getText().toString();

                if(numberInput.isEmpty()) {
                    fizzBuzzResultTextView.setText("No number!");
                } else {

                    int numberValue = Integer.parseInt(numberInput);
                    String result = gameController.getFizzBuzz(numberValue);
                    fizzBuzzResultTextView.setText(result);
                }

                inputEditText.setText("");
            }
        });

        rockPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] options = getResources().getStringArray(R.array.rock_paper_options);

                DrawType playerOneOption = DrawType.valueOf(options[playerOneSpinner.getSelectedItemPosition()]);
                DrawType playerTwoOption = DrawType.valueOf(options[playerTwoSpinner.getSelectedItemPosition()]);

                String result = gameController.whoWins(playerOneOption, playerTwoOption);
                rockPaperResultTextView.setText(result);
            }
        });
    }

    private void initialiseController() {

        FizzBuzzHelper fizzBuzzHelper = new FizzBuzzHelper();
        RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper = new RockPaperScissorsLizardSpockHelper();

        gameController = new GameController(fizzBuzzHelper, rockPaperScissorsLizardSpockHelper);
    }
}
