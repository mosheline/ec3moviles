package pe.edu.idat.evc3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.evc3.databinding.ActivityMainBinding
import pe.edu.idat.evc3.util.AppMensaje
import pe.edu.idat.evc3.util.TipoMensaje

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIngresar.setOnClickListener {
            val user = binding.edtCorreo.text.toString()
            val password = binding.edtPassword.text.toString()
            if(user.isNotEmpty() && password.isNotEmpty()){
                if(verificarDatos(user, password)){
                    startActivity(Intent(applicationContext, FormularioActivity::class.java))

                }else{
                    AppMensaje.noti(binding.root, "Usuario o Contraseña incorrectos...", TipoMensaje.ERROR)
                }
            }else{
                AppMensaje.noti(binding.root, "Llene todos los campos!!", TipoMensaje.INFORMACION)
            }
        }
    }

    private fun verificarDatos(user: String, password: String): Boolean {
        val usuarios = mapOf(
            "grupo" to "SYS123",
            "Grupo" to "SYS123",
            "GRUPO" to "SYS123"
        )
        return usuarios[user] == password
    }
}