package com.github.anupdey99.ccp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import com.github.anupdey99.ccp.databinding.ActivityMainBinding
import com.github.anupdey99.ccplib.CountryCodePicker

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.countryCodePicker.apply {
            registerCarrierNumberEditText(binding.phoneNumberET)
            binding.countryCodePicker.setCountryForPhoneCode(88)
            //binding.countryCodePicker.fullNumber = "+8801555555555"
        }

        binding.phoneNumberET.doAfterTextChanged {
            val isValid = binding.countryCodePicker.isValidFullNumber
            if (isValid) {
                Toast.makeText(this, "Valid phone number", Toast.LENGTH_SHORT).show()
                //binding.countryCodePicker.fullNumber = "+8801555555555"
            }

        }




    }
}