package hsj.shahram.todolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val mainRepo : MainRepo = MainRepo()
    val todoLiveData : LiveData<List<ToDo>>?
        get() = mainRepo.todoLiveData





}