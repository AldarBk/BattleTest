class Battle(
    private val team1: MutableList<AbstractWarrior> = Teams().draftTeam(),
    private val team2: MutableList<AbstractWarrior> = Teams().draftTeam(),
    private var battleEnd: Boolean = false
) {
    fun getBattleState(): BattleState {
        return if (team1.size == 0 && team2.size == 0) {
            BattleState.Draw.draw()
            battleEnd = true
            BattleState.Draw
        } else if (BattleState.Progress.intRound >= 700) {
            BattleState.Draw.draw()
            battleEnd = true
            BattleState.Draw
        } else if (team1.size > 0 && team2.size == 0) {
            BattleState.Team1Wins.team1Wins()
            battleEnd = true
            BattleState.Team1Wins
        } else if (team2.size > 0 && team1.size == 0) {
            BattleState.Team2Wins.team2Wins()
            battleEnd = true
            BattleState.Team2Wins
        } else {
            println(
                "Team 1 overall health: ${team1.sumOf { warrior: AbstractWarrior -> warrior.currentHealth }}\n" +
                        "Team 2 overall health: ${team2.sumOf { warrior: AbstractWarrior -> warrior.currentHealth }}\n" +
                        "Team 1 warriors left: ${team1.size}: $team1\n" +
                        "Team 2 warriors left: ${team2.size}: $team2"
            )
            BattleState.Progress
        }
    }

    fun iteration() {
        val war1 = team1.random()
        var war2 = team2.random()

        war1.attack(war2)
        if (war2.isKilled) {
            team2.remove(war2)
            if (team2.isNotEmpty()) {
                war2 = team2.random()
                war2.attack(war1)
                return if (war1.isKilled) {
                    team1.remove(war1)
                    if (team1.isNotEmpty() && team2.isNotEmpty()) {
                        BattleState.Progress.progress()
                    } else battleEnd = true
                } else BattleState.Progress.progress()
            }
        } else war2.attack(war1)
        if (war1.isKilled) {
            team1.remove(war1)
            if (team1.isNotEmpty() && team2.isNotEmpty()) {
                return BattleState.Progress.progress()
            } else battleEnd = true
        } else return BattleState.Progress.progress()
    }
}

