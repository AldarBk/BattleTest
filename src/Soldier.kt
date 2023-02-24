class Soldier(
    var maxHp: Int = 20,
    override var dodgeChance: Int = 5,
    var accuracy: Int = 10,
    var weapon: Int
) : AbstractWarrior(maxHp, dodgeChance, accuracy, Weapon.createPistol()) {
    override fun takeDamage(damage: Int) {
        maxHp -= damage
    }
}