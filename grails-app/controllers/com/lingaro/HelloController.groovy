package com.lingaro

class HelloController {

    def index() {
        return this.sayHello()
    }

    def sayHello(){
        render("Hello there!")
    }
}
