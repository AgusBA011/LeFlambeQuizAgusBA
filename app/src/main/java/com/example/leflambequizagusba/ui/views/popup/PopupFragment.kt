package com.example.leflambequizagusba.ui.views.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.leflambequizagusba.R
import com.example.leflambequizagusba.databinding.FragmentPopupBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class PopupFragment : Fragment() {

    private var binding: FragmentPopupBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPopupBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.buttonPopup?.setOnClickListener {
            popupMusic()
        }
    }

    private fun popupMusic() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.popup_title)
            .setMessage(R.string.popup_subtitle)
            .setNegativeButton(R.string.popup_close, null)
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}