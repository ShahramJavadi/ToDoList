package hsj.shahram.todolist

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface TodoDao {



    @Insert
    fun insertAll(todoDaoList: Array<ToDo>)

    @Insert
    fun insert(todoDao: ToDo)

    @Query("Select * From ToDo")
    fun getAll() : LiveData<List<ToDo>>?

    @Query("Select * From ToDo Where id =:id")
    fun getById(id : String) : LiveData<ToDo>?

    @Update
    fun update(todoDao: ToDo)

    @Query("Delete From ToDo")
    fun deleteAll()

    @Query("Delete From ToDo Where id =:id")
    fun deleteById(id : String)

}