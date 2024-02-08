package eu.tutorials.inheritanceapp

class Offspring : Secondary(), Archery, Singer{
    override fun archery() {
        //super<Archery>.archery() // <Archer> <= Interface name
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by offspring")
    }
}
