object Weapon {
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.SingleShot(7),
            maxAmmo = 7,
            typeWeapon = "Pistol"
        ) {
            override fun creatingPatron(): Ammo {
                return Ammo.SIMPLE
            }
        }
    }

    fun createMachineGun(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.ShotsBurst(30),
            maxAmmo = 30,
            typeWeapon = "Kalashnikov"
        ) {
            override fun creatingPatron(): Ammo {
                return Ammo.EXPLOSIVE
            }
        }
    }

    fun createShotgun(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.Fraction(5),
            maxAmmo = 5,
            typeWeapon = " BERETTA TX4 STORM"
        ) {
            override fun creatingPatron(): Ammo {
                return Ammo.BUCKSHOT
            }
        }
    }
}