package com.decimalab.easynews.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.decimalab.easynews.R
import com.decimalab.easynews.ui.NewsActivity
import com.decimalab.easynews.ui.NewsViewModel

/**
 * Created by Shakil Ahmed Shaj on 02,September,2020.
 * shakilahmedshaj@gmail.com
 */
class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}