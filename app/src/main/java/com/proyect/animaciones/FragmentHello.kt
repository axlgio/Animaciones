package com.proyect.animaciones


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyect.animaciones.databinding.FragmentHelloBinding

class FragmentHello : Fragment() {
    private lateinit var binding: FragmentHelloBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHelloBinding.inflate(inflater, container, false)
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
                    .replace(R.id.nav_host_fragment_activity_main, FragmentGift())
                    .addToBackStack("animation")
                    .commit()
            }
        }
        return binding.root
    }
}