package com.example.bakingrecipe

class name {

    private lateinit var sname:String

    constructor(sname:String){
        this.setSname(sname)

    }

    fun getSname():String{
        return sname
    }

    fun setSname(sname: String){
        this.sname = this.sname
    }

}