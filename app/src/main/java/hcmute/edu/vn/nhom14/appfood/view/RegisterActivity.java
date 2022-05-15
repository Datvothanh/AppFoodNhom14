package hcmute.edu.vn.nhom14.appfood.view;

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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import hcmute.edu.vn.nhom14.appfood.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText emailedit,passedit,conformpassedit  ;
    private Button btnregis;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView btn=findViewById(R.id.alreadyHaveAccount);
        mAuth=FirebaseAuth.getInstance();
        emailedit=findViewById(R.id.inputEmail);
        passedit=findViewById(R.id.inputPassword);
        btnregis = findViewById(R.id.btnRegister);
        conformpassedit = findViewById(R.id.inputConformPassword);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {String email, pass , conformpass;
        email = emailedit.getText().toString();
        pass = passedit.getText().toString();
        conformpass = conformpassedit.getText().toString();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email!", Toast.LENGTH_SHORT).show();
            return;
        }   if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Please enter pass!", Toast.LENGTH_SHORT).show();
            return;
        } if(!conformpass.equals(pass)){
            Toast.makeText(this, "Re-entered password is incorrect!", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Sign Up Success!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(RegisterActivity.this, "Registration failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
