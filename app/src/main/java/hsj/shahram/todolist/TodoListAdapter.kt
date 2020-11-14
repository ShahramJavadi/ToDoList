package hsj.shahram.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hsj.shahram.todolist.databinding.TodoItemBinding

class TodoListAdapter : RecyclerView.Adapter<TodoListAdapter.TodoViewHolder>() {

    private lateinit var todoList: List<ToDo>

    init {
        todoList = ArrayList()
    }

    fun submitList(todoList: List<ToDo>) {

        this.todoList = todoList;
        notifyDataSetChanged();

    }


    class TodoViewHolder(val binding: TodoItemBinding) : RecyclerView.ViewHolder(binding.root) {


        fun bindTo(toDo: ToDo) {


            binding.txtTodo.text = toDo.text
            binding.txtDateTime.text = convertDateToString(toDo.dateTime)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        var binding: TodoItemBinding = TodoItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {


        holder.bindTo(todoList.get(position))


    }

    override fun getItemCount(): Int {

        return todoList.size

    }
}