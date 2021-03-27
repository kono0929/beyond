package com.example.beyond.ui.userProfile
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.beyond.R
import com.example.beyond.data.db.entity.User
import kotlinx.android.synthetic.main.user_fragment.*
import com.google.firebase.firestore.FirebaseFirestore


class UserProfileFragment : Fragment() {
    // To use the viewModels() extension function, include
    // "androidx.fragment:fragment-ktx:latest-version" in your app
    // module's build.gradle file.
    private val viewModel: UserProfileViewModel by viewModels()
    private val TAG = "UserProfileFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.user_fragment, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.user.observe(viewLifecycleOwner) {
//            // update UI
//        }
        write?.setOnClickListener {
            val user = User(
                "Kaori", "password", "1", "1", "gmail", "1",
                "2020-02-01", "24"
            )
        }
    }
}