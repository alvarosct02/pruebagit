package com.kamiz.gitsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kamiz.gitsample.databinding.ActivityMainBinding
import com.kamiz.gitsample.databinding.FragmentBlankBinding
import com.kamiz.gitsample.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    fun setupViews() {
        binding.dummy.text = "Hola Maryam"
        binding.btNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_detailFragment_to_greenFragment)
        }
    }



}