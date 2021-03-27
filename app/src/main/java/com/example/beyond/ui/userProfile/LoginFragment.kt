package com.example.beyond.ui.userProfile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.beyond.R
import com.example.beyond.data.db.entity.User
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.android.synthetic.main.user_fragment.*

class LoginFragment : Fragment() {
    private val TAG = "LoginProfileFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login?.setOnClickListener {  }
    }
}