abstract class AbstractWeapon(
    var maxAmmo: Int,
    var fireType: FireType,
    var magazine: Stack<Ammo> = Stack(),
    var typeWeapon: String,
) {

    private fun reloadWeapon() {
        while (magazine.elements.size < maxAmmo) {
            magazine.push(creatingPatron())
        }
    }

    abstract fun creatingPatron(): Ammo


    fun getAmmo(): Stack<Ammo> {
        val stackForShot: Stack<Ammo> = Stack()

        when (fireType) {
            is FireType.SingleShot -> {
                stackForShot.push(creatingPatron())
            }
            is FireType.ShotsBurst -> {
                while (stackForShot.elements.size < 35)
                    stackForShot.push(creatingPatron())
            }
            is FireType.Fraction -> {
                while (stackForShot.elements.size < 5)
                    stackForShot.push(creatingPatron())
            }
        }
        return stackForShot
    }
}
