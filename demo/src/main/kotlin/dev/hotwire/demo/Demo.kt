package dev.hotwire.demo

object Demo {
    // Update this to choose which demo is run
    val current: Environment = Environment.Local

    enum class Environment(val url: String) {
        Remote("https://hotwire-native-demo.dev"),
        Local("http://172.16.1.120:3000")
    }
}
