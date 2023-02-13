package com.xa.device.export

object DevManager {
    var myDev : IDevice?=null

    fun setDevie(dev: IDevice){
        myDev = dev
    }

    fun getDevice(): IDevice?{
        return myDev
    }
}