package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponent.databinding.FragmentSayfayBinding
import com.google.android.material.snackbar.Snackbar


class sayfayFragment : Fragment() {

private lateinit var tasarim:FragmentSayfayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSayfayBinding.inflate(inflater, container, false)

        tasarim.buttonGoMain.setOnClickListener {


           Navigation.findNavController(it).navigate(R.id.AnaSayfayaGecis)
        }



        return tasarim.root
    }



}