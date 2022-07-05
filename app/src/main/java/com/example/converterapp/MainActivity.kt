package com.example.converterapp

import android.location.Location.convert
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.converterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var lastNumber: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addCallbacks()

    }

    private fun addCallbacks() {
        binding.textCount.text = "0"
        if (binding.textCount.text.isNotEmpty()) {
            binding.apply {
                clearNumber.setOnClickListener {
                    clearInput()
                }
                btnCelciusToFarenheit.setOnClickListener {
                    prepareOperation(celciusToFarenheit(lastNumber))
                    binding.textCount.text = celciusToFarenheit(lastNumber)
                }
                btnCelciusToDelisle.setOnClickListener {
                    prepareOperation(celciusToDelisle(lastNumber))
                    binding.textCount.text = celciusToDelisle(lastNumber)
                }
                btnCelciusToNewton.setOnClickListener {
                    prepareOperation(celciusToNewton(lastNumber))
                    binding.textCount.text = celciusToNewton(lastNumber)
                }
                btnCelciusToRankine.setOnClickListener {
                    prepareOperation(celciusToRankine(lastNumber))
                    binding.textCount.text = celciusToRankine(lastNumber)
                }
                btnRankineToNewton.setOnClickListener {
                    prepareOperation(rankineToNewton(lastNumber))
                    binding.textCount.text = rankineToNewton(lastNumber)
                }
                btnFahrenheitToCelcius.setOnClickListener {
                    prepareOperation(fahrenheitToCelcius(lastNumber))
                    binding.textCount.text = fahrenheitToCelcius(lastNumber)
                }
                btnFahrenheitToDelisle.setOnClickListener {
                    prepareOperation(fahrenheitToDelisle(lastNumber))
                    binding.textCount.text = fahrenheitToDelisle(lastNumber)
                }
                btnFahrenheitToNewton.setOnClickListener {
                    prepareOperation(fahrenheitToNewton(lastNumber))
                    binding.textCount.text = fahrenheitToNewton(lastNumber)
                }
                btnFahrenheitToRankine.setOnClickListener {
                    prepareOperation(fahrenheitToRankine(lastNumber))
                    binding.textCount.text = fahrenheitToRankine(lastNumber)
                }
                btnKelvinToDelisle.setOnClickListener {
                    prepareOperation(kelvinToDelisle(lastNumber))
                    binding.textCount.text = kelvinToDelisle(lastNumber)
                }
                btnKelvinToFahrenheit.setOnClickListener {
                    prepareOperation(kelvinToFahrenheit(lastNumber))
                    binding.textCount.text = kelvinToFahrenheit(lastNumber)
                }
                btnKelvinToCelcius.setOnClickListener {
                    prepareOperation(kelvinToCelcius(lastNumber))
                    binding.textCount.text = kelvinToCelcius(lastNumber)
                }
                btnKelvinToFahrenheit.setOnClickListener {
                    prepareOperation(kelvinToFahrenheit(lastNumber))
                    binding.textCount.text = kelvinToFahrenheit(lastNumber)
                }
                btnFahrenheitToRankine.setOnClickListener {
                    prepareOperation(fahrenheitToRankine(lastNumber))
                    binding.textCount.text = fahrenheitToRankine(lastNumber)
                }
                btnFahrenheitToKelvin.setOnClickListener {
                    prepareOperation(fahrenheitToKelvin(lastNumber))
                    binding.textCount.text = fahrenheitToKelvin(lastNumber)
                }
                btnKelvinToNewton.setOnClickListener {
                    prepareOperation(kelvinToNewton(lastNumber))
                    binding.textCount.text = kelvinToNewton(lastNumber)
                }
                btnKelvinToFahrenheit.setOnClickListener {
                    prepareOperation(kelvinToFahrenheit(lastNumber))
                    binding.textCount.text = kelvinToFahrenheit(lastNumber)
                }
            }
        }else{
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
        }

        }

    fun onClickNumber(view: View) {
        val newDigits = (view as Button).text.toString()
        val oldDigits = binding.textCount.text.toString()
        val newTextNumber = oldDigits + newDigits
        binding.textCount.text = newTextNumber
    }

    fun prepareOperation(convert: String?) {
        lastNumber = binding.textCount.text.toString().toDouble()
        clearInput()
        binding.textCount.text = convert(lastNumber.toString()).toString()
    }


    private fun clearInput() {
        binding.textCount.text = ""
    }


    //celcius
    private fun celciusToKelvin(celsius: Double): String? {
        val kelvin = celsius + 273.15
        return kelvin.toString()
    }

    private fun celciusToRankine(celsius: Double): String? {
        val rankine = celsius * 1.8 + 32 + 459.67
        return rankine.toString()
    }

    private fun celciusToNewton(celsius: Double): String? {
        val newton = celsius * 0.33000
        return newton.toString()
    }

    private fun celciusToDelisle(celsius: Double): String? {
        val delisle = celsius * 0.33000
        return delisle.toString()
    }

    private fun celciusToFarenheit(celsius: Double): String? {
        val fahrenheit = celsius * 9 / 5 + 32
        return fahrenheit.toString()
    }

    //fahrenheit
    private fun fahrenheitToKelvin(fahrenheit: Double): String? {
        val kelvin = 273.5 + (fahrenheit - 32.0) * (5.0 / 9.0)
        return kelvin.toString()
    }

    private fun fahrenheitToRankine(fahrenheit: Double): String? {
        val rankine = fahrenheit + 459.67
        return rankine.toString()
    }

    private fun fahrenheitToNewton(fahrenheit: Double): String? {
        val newton = (fahrenheit - 32) * 0.18333
        return newton.toString()
    }

    private fun fahrenheitToDelisle(fahrenheit: Double): String? {
        val delisle = (212 - fahrenheit) * 5 / 6
        return delisle.toString()
    }

    private fun fahrenheitToCelcius(fahrenheit: Double): String? {
        val celcius = (fahrenheit - 32) * 5 / 9
        return celcius.toString()
    }

    //Kelvin
    private fun kelvinToRankine(kelvin: Double): String? {
        val rankine = kelvin * 9 / 5
        return rankine.toString()
    }

    private fun kelvinToNewton(kelvin: Double): String? {
        val newton = (kelvin - 273.15) * 0.33000
        return newton.toString()
    }

    private fun kelvinToDelisle(kelvin: Double): String? {
        val delisle = (373.15 - kelvin) * 3 / 2
        return delisle.toString()
    }

    private fun kelvinToCelcius(kelvin: Double): String? {
        val celcius = kelvin - 273.15
        return celcius.toString()
    }

    private fun kelvinToFahrenheit(kelvin: Double): String? {
        val fahrenheit = (kelvin - 273.15) * 1.8 + 32
        return fahrenheit.toString()
    }

    //Rankine
    private fun rankineToNewton(rankine: Double): String? {
        val newton = (rankine - 491.67) * 0.18333
        return newton.toString()
    }
}