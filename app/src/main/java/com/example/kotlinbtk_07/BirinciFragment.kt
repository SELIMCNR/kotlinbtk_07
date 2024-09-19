package com.example.kotlinbtk_07

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.kotlinbtk_07.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private var _binding:FragmentBirinciBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBirinciBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // İşlemler buraya yazılır
        binding.editTextMsj.setText("")
        binding.button.setOnClickListener {
           sonraki(it)
        }

        // context -> requireContext()
        Toast.makeText(requireContext(),"Hoşgeldinizi",Toast.LENGTH_SHORT).show()
    }

    fun sonraki(view: View){
        val kullaniciAdi = binding.editTextMsj.text.toString()
        val kullaniciYasi = binding.editTextYas.text.toString()
        val kullaniciMeslek = binding.editTextmeslek .text.toString()
        val action = BirinciFragmentDirections.actionBirinciFragmentToIkinciFragment(kullaniciAdi,kullaniciYasi.toInt(),kullaniciMeslek)
        Navigation.findNavController(view).navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}