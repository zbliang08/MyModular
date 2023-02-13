package com.xa.farm.impl

import android.util.Log
import com.xa.farm.export.Isome

class Mysome : Isome {
    override fun isTouchingChangeData(): Boolean {
        Log.d("aaa", "Mysome isTouchingChangeData")
        return true
    }
}