package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment() {

private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.buttonBasla.setOnClickListener {

           Navigation.findNavController(it).navigate(R.id.oyunEkraninaGecis)
        }

        tasarim.buttonGitB.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sayfaxFragment)
        }

        return tasarim.root
    }



}