package com.example.capston_spotyup.SportyUp.feature.Signin

import com.example.capston_spotyup.SportyUp.feature.Main.MainActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.capston_spotyup.databinding.SigninBinding


class SigninActivity : AppCompatActivity() {

    private lateinit var binding: SigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 로그인 버튼 클릭 시 fragment_home으로 이동
        binding.loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addToBackStack(nothing: Nothing?) {
        TODO("Not yet implemented")
    }
}
