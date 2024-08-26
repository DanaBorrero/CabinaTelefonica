class CabinaTel(var numCab: Int) {

    fun crearCabina(): CabinaTel {
        //listaCabinas.add(numCab)
        println("Ingrese el número de la nueva cabina: ")
        val numCab = readln().toInt()
        val cabina = CabinaTel(numCab)
        println("Cabina creada con número: $numCab")
        return cabina
    }
    fun numLlam() {
        println("Ingrese el número de teléfono que desea: ")
        val numero = readln().toInt()
        println("Llamando al número $numero desde la cabina $numCab.")
    }

    fun cosTotal(valor: Int){
        println("Cuantos minutos desea usar: ")
        val minTotal = readln().toInt()
        val cosTotal : Int = minTotal*valor
        println("El costo total de la llamada es de: $cosTotal")
    }

    fun datosCabina() {
        val datosT: MutableList <CabinaTel> = mutableListOf()
        datosT.add(crearCabina())
        for (item in datosT) {
            println(item)
        }
    }

    override fun toString(): String {
        return "CabinaTel(numCab=$numCab)"
    }


}




