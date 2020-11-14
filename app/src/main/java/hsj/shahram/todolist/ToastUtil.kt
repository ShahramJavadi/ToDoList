package hsj.shahram.todolist

import android.widget.Toast


fun show(message : String){


    Toast.makeText( MyApplication.create(),message, Toast.LENGTH_SHORT).show()

}