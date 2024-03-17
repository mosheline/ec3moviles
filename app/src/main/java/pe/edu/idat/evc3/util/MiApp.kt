package pe.edu.idat.evc3.util

import android.app.Application

class MiApp : Application() {
    companion object{
        lateinit var i : MiApp
    }

    override fun onCreate() {
        super.onCreate()
        i = this
    }
}