fun main() {
    // units
    val celsius: String = "Celsius"
    val fahrenheit: String = "Fahrenheit"
    val kelvin: String = "Kelvin"

    // conversionFormula
    val celsiusToFahrenheit = { input: Double -> (9.0 / 5.0) * input + 32 }
    val kelvintoCelsius = { input: Double -> input - 273.15 }
    val fahrenheittoKelvin = { input: Double -> (5.0 / 9.0) * (input - 32) + 273.15 }

    printFinalTemperature(27.0, celsius, fahrenheit, celsiusToFahrenheit)
    printFinalTemperature(350.0, kelvin, celsius, kelvintoCelsius)
    printFinalTemperature(10.0, fahrenheit, kelvin, fahrenheittoKelvin)
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}