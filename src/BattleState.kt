sealed class BattleState {

    var intRound = 0

    object Progress : BattleState() {
        fun progress() {
            intRound++
        }
    }

    object Team1Wins : BattleState() {
        fun team1Wins() {
            println("Team 1 wins!")
        }
    }

    object Team2Wins : BattleState() {
        fun team2Wins() {
            println("Team 2 wins!")
        }
    }

    object Draw : BattleState() {
        fun draw() {
            println("The battle ended in a draw")
        }
    }
}

