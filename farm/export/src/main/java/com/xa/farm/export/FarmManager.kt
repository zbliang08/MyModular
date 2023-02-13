package com.xa.farm.export


object FarmManager {
    var mySome : Isome?=null

    fun setSome(some:Isome){
        mySome = some
    }

    fun getSome():Isome?{
        return mySome
    }

}