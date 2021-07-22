#funcion main

if __name__ == "__main__" :

    alumnos = ["beff", "deimHT", "Guachaca", "gasspy", "happy8"]
    print(alumnos)
    print(alumnos[2])
    print(alumnos[1:4])
    print(alumnos[1:])
    print(alumnos[:4])
    print(alumnos[-1])
    print(alumnos[-4:-2])
    print(alumnos[-4:])

    print(len(alumnos))
    print(alumnos.__len__())

    alumnos[2] = "roc3l"
    print(alumnos)


    alumnos.insert(4, "|Jean")
    print(alumnos)

    alumnos.append("Majimmy") # add end -> agrega al final
    print(alumnos)

    listado2 = ["SterbenGW", "Toro", "Muhamed"]
    alumnos.extend(listado2)
    print(alumnos)

    for alumno in alumnos:
        print(alumno)

    for i in range(len(alumnos)):
        print(i)

    alumnos.sort() # ordena por defecto ascendentemente [a-z] [0-inf] 
    print(alumnos)

    
    alumnos.sort(reverse=True) # ordena por defecto descendete [z-a] [inf-0] 
    print(alumnos)


    alumnos.remove("beff")
    print(alumnos)

    print(alumnos.pop())
    print(alumnos)

    del alumnos[0]
    print(alumnos)

    #del alumnos
    #print(alumnos)

    alumnos.clear()
    print(alumnos)