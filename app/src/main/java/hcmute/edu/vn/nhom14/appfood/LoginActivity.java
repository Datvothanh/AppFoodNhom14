package hcmute.edu.vn.nhom14.appfood;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private EditText emailedit,passedit;
    private Button btnlogin, btnregis;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn=findViewById(R.id.textViewSignUp);
        mAuth=FirebaseAuth.getInstance();
        emailedit=findViewById(R.id.inputEmail);
        passedit=findViewById(R.id.inputPassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnregis = findViewById(R.id.btnRegister);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login()  { String email, pass;
    email = emailedit.getText().toString();
    pass = passedit.getText().toString();
            if (TextUtils.isEmpty(email)) {
        Toast.makeText(this, "Please enter email!", Toast.LENGTH_SHORT).show();
        return;
    }   if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Please enter pass!", Toast.LENGTH_SHORT).show();
            return;
    }
            mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                 if(task.isSuccessful()){
                     Toast.makeText(getApplicationContext() , "Logged in successfully !", Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                     startActivity(intent);
                 }else{
                     Toast.makeText(getApplicationContext() , "Logged unsuccessfully !", Toast.LENGTH_SHORT).show();
                 }
                }
            });
    }
}
