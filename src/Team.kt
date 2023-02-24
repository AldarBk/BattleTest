class Teams {

     val team: MutableList<AbstractWarrior> = mutableListOf()

    fun draftTeam(): MutableList<AbstractWarrior> {
        println("Enter a number of warriors for a Team")
        val n = readln().toInt()
        for (i in 1..n)
            if (45.chanceCalculator()) {
                team.add(Captain(60,20,45,60))
            } else if (90.chanceCalculator()) {
                team.add(Soldier(20,5,10,20))
            } else
                team.add(General(100,60,85,100))

        println(team.toString())
        return team
    }
}
