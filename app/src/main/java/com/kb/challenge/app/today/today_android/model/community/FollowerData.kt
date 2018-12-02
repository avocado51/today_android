package com.kb.challenge.app.today.today_android.model.community

import com.google.gson.annotations.Expose

/**
 * Created by shineeseo on 2018. 11. 15..
 */
data class FollowerData (
        var profile_img :String,
        var id : String,
        var name : String,
        var following : Int
)