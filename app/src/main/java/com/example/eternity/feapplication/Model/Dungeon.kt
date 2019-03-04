package com.example.eternity.feapplication.Model

public class Dungeon{
    private var id : Int? = null
    private var shortName : String? = null
    private var name : String? = null
    private var fieldId : Int? = null

    public var Id : Int
    get(){
        return id!!
    }
    set(value) {this.Id = value}

    public var ShortName : String
        get(){
            return shortName!!
        }
        set(value) {this.shortName = value}

    public var Name : String
        get(){
            return name!!
        }
        set(value) {this.name = value}

    public var FiledId : Int
        get(){
            return fieldId!!
        }
        set(value) {this.fieldId = value}

    constructor(id: Int?, shortName: String?, name: String? , fieldId : Int?) {
        this.id = id
        this.shortName = shortName
        this.name = name
        this.fieldId = fieldId
    }
}