package com.xa.farm.impl

import com.xa.device.export.ConstantDev
import com.xa.device.export.DevManager
import com.xa.farm.export.Constant
import com.xa.farm.export.FarmManager

class FarmApp {
    fun init(){
        //调用其他同级库,用它的export就好
        ConstantDev.DEV_SERVICE
        DevManager.getDevice()


        Constant.FARM_SERVICE
        FarmManager.setSome(Mysome())
    }
}