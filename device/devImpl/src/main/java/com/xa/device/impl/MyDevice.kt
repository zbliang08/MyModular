package com.xa.device.impl

import com.xa.device.export.IDevice

class MyDevice : IDevice {
    override fun getName() :String{
        return "apc"
    }
}