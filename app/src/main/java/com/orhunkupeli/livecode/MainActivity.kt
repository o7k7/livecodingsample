package com.orhunkupeli.livecode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.orhunkupeli.livecode.databinding.ActivityMainBinding
import com.orhunkupeli.livecode.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val people = listOf(
                Person("Bob", 34),
                Person("John", 21),
                Person("Doe", 49),
        )
    }
}