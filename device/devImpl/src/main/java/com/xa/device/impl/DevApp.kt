package com.xa.device.impl

import com.xa.device.export.ConstantDev
import com.xa.device.export.DevManager
import com.xa.farm.export.Constant
import com.xa.farm.export.FarmManager

class DevApp {
    fun init(){
        //调用其他同级库,用它的export就好
        Constant.FARM_SERVICE
        FarmManager.getSome()

        ConstantDev.DEV_SERVICE
        DevManager.setDevie(MyDevice())
    }
}