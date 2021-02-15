package se.ju.student.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    //@SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)
        listView.adapter = ArrayAdapter<ToDo>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                toDoRepository.getAllToDos()
        )
        listView.setOnItemClickListener { _, view, position, id ->
            var listId = listView.adapter.getItem(position) as ToDo
            val x = Intent(this, ViewToDoActivity::class.java).putExtra(ViewToDoActivity.EXTRA_TODO_ID, listId.id)
            startActivity(x)

        }
        val createButton = findViewById<Button>(R.id.main_button)
        createButton.setOnClickListener{
            val intent = Intent(this, CreateToDoActivity::class.java)
            startActivity(intent)
        }
    }
}


