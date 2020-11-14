package hsj.shahram.todolist

import android.app.Application

class MyApplication : Application() {

    companion object{

        private  lateinit var instance:MyApplication
        fun create() : MyApplication{




            return instance;


        }

    }


    override fun onCreate() {
        super.onCreate()
        instance = this;
    }

}