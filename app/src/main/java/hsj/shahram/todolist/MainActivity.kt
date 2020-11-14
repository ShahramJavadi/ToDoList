package hsj.shahram.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hsj.shahram.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding;
    private lateinit var recyclerView :RecyclerView
    private lateinit var todoListAdapter: TodoListAdapter

    companion object {
        private val IS_EDIT_MODE = "is_edit_mode"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewModel()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }


    private fun setupViewModel() {

        viewModel = ViewModelProvider(this).get(MainViewModel().javaClass)

    }

    private fun init() {

        clickListener()
        setupRecyclerView()
        todoListObserver()


    }


    private fun todoListObserver()
    {

        viewModel.todoLiveData?.observe(this , { todoListAdapter.submitList(it)})


    }
    private fun setupRecyclerView()
    {

        recyclerView = binding.rvTodo
        recyclerView.layoutManager = LinearLayoutManager(this)
        todoListAdapter = TodoListAdapter()
        recyclerView.adapter = todoListAdapter
    }
    private fun clickListener() {

        binding.fabAddTodo.setOnClickListener { navigateToTodoActivity(false)}
    }


    private fun navigateToTodoActivity(isEditMode: Boolean) {

        val intent = Intent(this, TodoActivity::class.java)
        intent.putExtra(IS_EDIT_MODE, isEditMode)
        startActivity(intent)

    }
}