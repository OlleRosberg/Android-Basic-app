package se.ju.student.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)



    val saveButton = findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener{
            val intent = Intent(this, ViewToDoActivity::class.java)
            startActivity(intent)


            val title = findViewById<EditText>(
                    R.id.textField
            ).editableText.toString()
        }

    }
}