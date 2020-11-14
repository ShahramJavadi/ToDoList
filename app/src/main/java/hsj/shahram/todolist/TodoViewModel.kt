package hsj.shahram.todolist

import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    private val todoRepo : TodoRepo = TodoRepo()


    fun addTodo(toDo: ToDo)
    {

        todoRepo.insertTodo(toDo)


    }

}