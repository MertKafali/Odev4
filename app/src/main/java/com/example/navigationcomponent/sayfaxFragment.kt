package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponent.databinding.FragmentSayfaxBinding
import com.google.android.material.snackbar.Snackbar


class sayfaxFragment : Fragment() {

private lateinit var tasarim:FragmentSayfaxBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfaxBinding.inflate(inflater, container, false)

        tasarim.buttonGoy.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.SayfaXGecis)
        }

        return tasarim.root
    }



}