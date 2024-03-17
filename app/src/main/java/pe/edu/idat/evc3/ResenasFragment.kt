package pe.edu.idat.evc3
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.evc3.databinding.FragmentResenasBinding

class ResenasFragment : Fragment(), View.OnClickListener {
    private var _binding: FragmentResenasBinding? = null
    private val binding get() = _binding!!
    private val resenasList = ArrayList<tblResenas>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResenasBinding.inflate(inflater, container, false)
        val testResenas = generarResenas()
        binding.frrvResenas.layoutManager = LinearLayoutManager(requireContext())
        binding.frrvResenas.adapter = AdapterItem(testResenas)
        binding.frrvResenas.setOnClickListener(this)
        return binding.root
    }

    private fun generarResenas(): List<tblResenas> {
        val lista = ArrayList<tblResenas>()
        lista.add(tblResenas("Isabella", "Es el lugar al que acudir cuando necesitas un servicio confiable y de calidad"))
        lista.add(tblResenas("Diego", "Ofrece una experiencia de compra única, donde la elegancia se encuentra con la moda"))
        lista.add(tblResenas("Valentina", "Es la opción perfecta para aquellos que buscan emociones fuertes y experiencias inolvidables"))
        lista.add(tblResenas("Mateo", "Evalúa la personalidad y las necesidades inconscientes a través de la interpretación de imágenes"))
        lista.add(tblResenas("Camila", "Evalúa la personalidad y las emociones a través de la elección de colores y formas",))
        lista.add(tblResenas("Javier", "Evalúa la personalidad, el estado emocional y la autoestima a través del dibujo de una figura humana"))
        lista.add(tblResenas("Gabriela", "Evalúa la personalidad, las emociones y la autoestima a través del dibujo de un árbol"))
        lista.add(tblResenas("Ricardo", "Evalúa la personalidad, las emociones y las relaciones interpersonales a través del dibujo de una casa"))
        lista.add(tblResenas("Sofia", "Evalúa la percepción visual, la motricidad fina y la coordinación visomotora"))
        lista.add(tblResenas("Natalia", "Evalúa la inteligencia general y la capacidad de razonamiento abstracto"))
        lista.add(tblResenas("Carlos", "Evalúa la atención selectiva, la flexibilidad cognitiva y el control inhibitorio"))
        return lista
    }

    data class tblResenas(val titulo: String, val contenido: String)

    override fun onClick(v101: View?) {
        /**/
    }

}