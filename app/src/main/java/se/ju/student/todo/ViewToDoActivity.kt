package se.ju.student.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class ViewToDoActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TODO_ID = "TODO_ID"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        val toDoId = intent.getIntExtra(EXTRA_TODO_ID, -1)

        val updateButton = findViewById<Button>(R.id.updateButton)
        updateButton.setOnClickListener{
            val intent = Intent(this, EditToDoActivity::class.java)
            startActivity(intent)
        }

        val deleteButton = findViewById<Button>(R.id.deleteButton)
        deleteButton.setOnClickListener{
            AlertDialog.Builder(this)
                    .setTitle("Delete ToDo")
                    .setMessage("Do you really want to delete it?")
                    .setPositiveButton(
                            "Yes"
                    ) { dialog, whichButton ->
                        // Delete it.
                        val deleteBack = Intent(this, MainActivity::class.java)
                        startActivity(deleteBack)
                    }.setNegativeButton(
                            "No"
                    ) { dialog, whichButton ->
                        // Do not delete it.
                    }.show()
        }
    }
}