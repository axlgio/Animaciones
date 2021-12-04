package com.proyect.animaciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyect.animaciones.databinding.FragmentGiftBinding
import com.proyect.animaciones.databinding.FragmentHelloBinding


class FragmentGift : Fragment() {
    private lateinit var binding: FragmentGiftBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGiftBinding.inflate(inflater, container, false)
        binding.btn2.setOnClickListener {
            activity?.let {
                it.supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .replace(R.id.nav_host_fragment_activity_main, nuevo())
                    .addToBackStack("animation")
                    .commit()
            }
        }
        return binding.root
    }
}