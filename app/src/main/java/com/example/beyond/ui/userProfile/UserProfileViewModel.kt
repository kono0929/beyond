package com.example.beyond.ui.userProfile
import androidx.lifecycle.*
import com.example.beyond.data.db.entity.User
import com.example.beyond.data.network.UserFB
import com.example.beyond.data.repository.UserRepository
import kotlinx.coroutines.launch

class UserProfileViewModel (
    savedStateHandle: SavedStateHandle,
    userRepository: UserRepository
) : ViewModel() {
    val userId : String = savedStateHandle["uid"] ?:
    throw IllegalArgumentException("missing user id")
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

//    init {
//        viewModelScope.launch {
//            _user.value = userRepository.getUser(userId)
//        }
//    }


}