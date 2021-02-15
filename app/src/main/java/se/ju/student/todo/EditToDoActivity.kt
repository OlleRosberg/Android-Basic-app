package se.ju.student.todo

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class EditToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_to_to)



        val saveButton = findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener{
            val intent = Intent(this, ViewToDoActivity::class.java)
            startActivity(intent)
        }
    }
}