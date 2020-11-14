package hsj.shahram.todolist

class TodoRepo {




    fun insertTodo(todo : ToDo)
    {

        AppDatabase.create().getTodoDao().insert(todo)

    }
}