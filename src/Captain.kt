class Captain(
    var maxHp: Int = 60,
    override var dodgeChance: Int = 20,
    var accuracy:Int = 45,
    var weapon: Weapon,
    override var currentHealth: Int
) : AbstractWarrior(maxHp, dodgeChance, accuracy, Weapon.createShotgun()) {
    override fun takeDamage(damage: Int) {
        maxHp -= damage
    }
}