class Team(var teamName: String, var numberOfWarriors: Int) {
    var warrior = mutableListOf<AbstractWarrior>()

    init {

        for (i in 1 .. numberOfWarriors) {
            if (50.chanceCalculator()){
                warrior.add(Soldier(20,5,10, weapon = Weapon,5))
            } else if (30.chanceCalculator()){
                warrior.add(Captain(60,20,45, weapon = Weapon,20))
            } else {
                warrior.add(General(100,60,85, weapon = Weapon,60))
            }
        }
    }
}