package pe.edu.idat.evc3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.evc3.databinding.ItemResenasBinding

class AdapterItem(private var lista: List<ResenasFragment.tblResenas>) : RecyclerView.Adapter<AdapterItem.ViewHolder>() {

    inner class ViewHolder(val binding: ItemResenasBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemResenasBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val test = lista[position]
        holder.binding.cvtvNombre.text = test.titulo
        holder.binding.cvtvResena.text = test.contenido

    }



}