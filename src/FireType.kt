sealed class FireType {


    data class SingleShot(val shotsCount: Int) : FireType()

    data class Fraction(val shotsCount: Int) : FireType()

    data class ShotsBurst(val shotsCount: Int) : FireType()
}
