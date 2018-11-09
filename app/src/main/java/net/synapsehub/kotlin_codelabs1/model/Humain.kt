package net.synapsehub.kotlin_codelabs1.model

class Humain{

    var id:Int=0
    var name:String=""
    var email:String=""
    var password:String=""

    constructor(name:String,email:String,password:String){
        this.name=name
        this.email=email
        this.password=password
    }

}