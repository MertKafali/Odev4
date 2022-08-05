package com.example.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim: FragmentOyunEkraniBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false)


        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.SonucEkraninaGecis)
        }
        return tasarim.root

    }
}