package com.example.alquran.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alquran.R
import com.example.alquran.model.ModelAyat

class AyatAdapter(private val mContext: Context,
                  private val items: List<ModelAyat>) : RecyclerView.Adapter<AyatAdapter.ViewHolder>() {

    //Dipanggil ketika RecyclerView membutuhkan tipe baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_ayat, parent, false)
        return ViewHolder(v)
    }

    // Dipanggil oleh RecyclerView untuk menampilkan data pada posisi yang ditentukan.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = items[position]
        holder.tvNomorAyat.text = data.nomor
        holder.tvArabic.text = data.arab
        holder.tvTerjemahan.text = data.indo
    }

    //Mengembalikan jumlah total item dalam kumpulan data yang dipegang oleh adaptor.
    override fun getItemCount(): Int {
        return items.size
    }

    //Class Holder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNomorAyat: TextView
        var tvArabic: TextView
        var tvTerjemahan: TextView

        init {
            tvNomorAyat = itemView.findViewById(R.id.tvNomorAyat)
            tvArabic = itemView.findViewById(R.id.tvArabic)
            tvTerjemahan = itemView.findViewById(R.id.tvTerjemahan)
        }
    }
}