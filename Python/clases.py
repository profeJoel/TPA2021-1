##### Clase : Atributos y Métodos
class Persona:

    def __init__(self, nombre, edad, domicilio, rut):
        self.nombre = nombre # publico
        self.edad = edad #publico
        self._domicilio = domicilio #privado o protegido segun convesion de desarrolladores
        self.__rut = rut

    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self,nombre):
        self.nombre = nombre

    def get_rut(self):
        return self.__rut

class Estudiante(Persona):
    def __init__(self, nombre, edad, domicilio, rut):
        super().__init__(nombre, edad, domicilio, rut)
    
    def get_rut(self):
        return "NO tiene acceso"

if __name__ == "__main__" :
    alumno = Persona("Happy8", 19, "Happylandia", 12345678)

    print(alumno.nombre)
    print(alumno.edad)
    print(alumno._domicilio)
    print(alumno.get_rut())

    
    universitaria = Estudiante("Toro", 19, "Torolandia", 87654321)

    print(universitaria.nombre)
    print(universitaria.edad)
    print(universitaria._domicilio)
    print(universitaria.get_rut())