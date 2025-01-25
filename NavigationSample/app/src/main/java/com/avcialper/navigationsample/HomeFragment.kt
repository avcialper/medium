package com.avcialper.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.avcialper.navigationsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnProfile.setOnClickListener {

            val intVal = 100
            val stringVal = "Medium"
            val booleanVal = true
            val user = User("Kuklacı")

            val direction =
                HomeFragmentDirections.actionHomeToProfile(user, intVal, stringVal, booleanVal)
            val navController = findNavController()

            navController.navigate(direction)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}