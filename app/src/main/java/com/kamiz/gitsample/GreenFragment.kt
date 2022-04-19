package com.kamiz.gitsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kamiz.gitsample.databinding.FragmentGreenBinding

class GreenFragment:Fragment() {
    private lateinit var binding: FragmentGreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGreenBinding.inflate(layoutInflater)
        return binding.root
    }

}