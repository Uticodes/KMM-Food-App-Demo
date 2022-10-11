package uticodes.tutorials.kmmfoodappdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform