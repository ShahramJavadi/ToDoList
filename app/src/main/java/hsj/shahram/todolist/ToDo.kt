package hsj.shahram.todolist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
 data class ToDo( @PrimaryKey var id:String
                 ,var text:String?
                 ,var dateTime :Long?
                 ,var fileUri :String?) {
}