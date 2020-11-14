package hsj.shahram.todolist

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*


fun convertDateToString(timeStamp : Long?) :String?
{

    try {
        if(timeStamp == null)
            return  null

        val sd = SimpleDateFormat("yyyy-MM-dd")
        val date = Date(timeStamp)
        return sd.format(date)

    }
    catch (e : Exception)
    {

        return null

    }





}

