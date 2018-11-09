package net.synapsehub.kotlin_codelabs1.model

class Humain{

    var id:Int=0
    var name:String=""
    var username:String=""
    var password:String=""

    constructor(name:String,username:String,pasword:String){
        this.name=name
        this.username=username
        this.password=password
    }

}