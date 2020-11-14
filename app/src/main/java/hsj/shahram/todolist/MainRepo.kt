package hsj.shahram.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations

class MainRepo {


      var todoLiveData : LiveData<List<ToDo>>? = AppDatabase.create().getTodoDao().getAll()






}