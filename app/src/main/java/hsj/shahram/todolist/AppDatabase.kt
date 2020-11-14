package hsj.shahram.todolist

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ToDo::class], version = 1 ,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {


    abstract fun getTodoDao() : TodoDao





    companion object{



        private  var instance : AppDatabase? = null

        fun create() : AppDatabase =

           instance ?: synchronized(this){

              instance ?: buildDatabase().also { instance = it }

           }



      private  fun buildDatabase()  = Room.databaseBuilder(MyApplication.create()
            , AppDatabase::class.java , "TodoDb").allowMainThreadQueries().build()

    }


}