package com.example.kotlinbtk_07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinbtk_07.databinding.FragmentBirinciBinding
import com.example.kotlinbtk_07.databinding.FragmentIkinciBinding


class IkinciFragment : Fragment() {

    private var _binding: FragmentIkinciBinding ?=null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIkinciBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // İşlemler buraya yazılır
        arguments?.let {
            val gelenAd = IkinciFragmentArgs.fromBundle(it).kullaniciAdi
            binding.textViewisim .text ="ad"+ gelenAd
            val gelenYas = IkinciFragmentArgs.fromBundle(it).kullaniciYasi
            binding.textViewYas.text = "yas"+gelenYas.toString()
            val gelenMeslek = IkinciFragmentArgs.fromBundle(it).kullaniciMeslek
            binding.textViewMeslek.text = "meslek"+gelenMeslek
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}