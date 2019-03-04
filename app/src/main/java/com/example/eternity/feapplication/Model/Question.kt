package com.example.eternity.feapplication.Model

public class Question{
    private var title : String ? = null
    private var content : String ? = null
    private var ans : String ? = null
    private var fie : String ? = null

    public var Title : String
        get(){
            return title!!
        }
        set(value){
            title = value
        }

    public var Content : String
        get(){
            return content!!
        }
        set(value){
            content = value
        }

    public var Ans : String
        get(){
            return ans!!
        }
        set(value){
            ans = value
        }

    public var Fie : String
        get(){
            return fie!!
        }
        set(value){
            fie = value
        }

    constructor(title: String?, content: String?, ans: String?, fie: String?) {
        this.title = title
        this.content = content
        this.ans = ans
        this.fie = fie
    }
}