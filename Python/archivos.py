import os

if __name__ == "__main__" :
    archivo = open("archivo.txt", "r") # opcion r para leer, se añade rt si es texto o rb si es binario
    #print(archivo.read())
    #print(archivo.read(10))
    print(archivo.readline())

    escritura = open("nuevoarchivo.txt", "w") # opcion w sobre escribe
    escritura.write("Este es un ejemplo de escritura")
    escritura.close()

    escritura = open("nuevoarchivo.txt", "a") # opcion a añade elementos al final
    escritura.write("\nEste ejemplo es sobre añadir un nuevo contenido")
    escritura.close()

    escritura = open("nuevoarchivo.txt", "w") # opcion w sobre escribe
    escritura.write("Ejemplo de sobre escritura")
    escritura.close()

    escritura = open("archivolimpio.txt", "x") # opcion x crea un nuevo archivo

    os.remove("nuevoarchivo.txt")