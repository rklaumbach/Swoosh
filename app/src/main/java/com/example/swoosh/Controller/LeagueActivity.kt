package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    var player = Player("","")

    fun leagueNextClicked(view: View){
        if(mensLeagueBtn.isChecked ||womensLeagueBtn.isChecked ||coedLeagueBtn.isChecked) {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select league", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"

    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"

    }
    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "coed"

    }
}


