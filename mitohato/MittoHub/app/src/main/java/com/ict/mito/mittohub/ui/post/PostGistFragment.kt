package com.ict.mito.mittohub.ui.post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ict.mito.mittohub.databinding.FragmentPostGistBinding

/**
 * Created by mito on 2018/10/13.
 */
class PostGistFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPostGistBinding.inflate(
                inflater,
                container,
                false
        )
        return binding.root
    }
}