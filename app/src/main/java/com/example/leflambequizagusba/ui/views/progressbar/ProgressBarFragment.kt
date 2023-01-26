package com.example.leflambequizagusba.ui.views.progressbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.leflambequizagusba.databinding.FragmentProgressbarBinding

class ProgressBarFragment : Fragment() {

    private var binding: FragmentProgressbarBinding? = null

    private val viewModel: ProgressBarViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProgressbarBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(viewLifecycleOwner) {
            binding?.textProgressbar?.text = it
        }

        viewModel.isLoading.observe(viewLifecycleOwner) {
            binding?.progressBar?.isVisible = it
            binding?.textProgressbar?.isVisible = !it
        }

        binding?.viewContainer?.setOnClickListener { viewModel.toggleProgressBarState() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}