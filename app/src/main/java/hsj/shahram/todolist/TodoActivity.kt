package hsj.shahram.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import hsj.shahram.todolist.databinding.ActivityTodoBinding
import hsj.shahram.todolist.databinding.TodoItemBinding
import java.util.*

class TodoActivity : AppCompatActivity() {
    private lateinit var todoViewModel: TodoViewModel
    private lateinit var binding : ActivityTodoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewModel()
        binding = ActivityTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun setupViewModel()
    {

        todoViewModel = ViewModelProvider(this).get(TodoViewModel::class.java)

    }


   private fun init()
    {

        clickListener()

    }

    fun clickListener()
    {

        binding.btnAddOrEdit.setOnClickListener{ addTodo()  }

    }



    private fun addTodo()
    {
        val id = UUID.randomUUID().toString()
        val text : String = binding.etTodo.text.toString()
        if(text.isEmpty())
        {
            show(getString(R.string.text_cant_be_null))
            return
        }
        val toDo  = ToDo(id , text
            , System.currentTimeMillis() , "")

        todoViewModel.addTodo(toDo)

        finish()

    }
}