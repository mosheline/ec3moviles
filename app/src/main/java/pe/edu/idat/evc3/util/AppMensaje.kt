package pe.edu.idat.evc3.util

import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import pe.edu.idat.evc3.R

object AppMensaje {
    fun noti(vista: View, mensaje: String, tipo: TipoMensaje){
        val snackbar = Snackbar.make(vista,mensaje, Snackbar.LENGTH_LONG)
        when(tipo){
            TipoMensaje.ERROR-> snackbar.setBackgroundTint(ContextCompat.getColor(MiApp.i, R.color.error))
            TipoMensaje.CORRECTO-> snackbar.setBackgroundTint(ContextCompat.getColor(MiApp.i, R.color.correcto))
            TipoMensaje.ADVERTENCIA-> snackbar.setBackgroundTint(ContextCompat.getColor(MiApp.i,R.color.advertencia))
            TipoMensaje.INFORMACION-> snackbar.setBackgroundTint(ContextCompat.getColor(MiApp.i,R.color.info))

        }
        snackbar.show()
    }
}