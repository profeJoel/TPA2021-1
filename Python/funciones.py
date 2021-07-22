#-----------------funciones------------
# def nombre_funcion(parametros):
#   rutinas de codigo
#   return valor o variable

def sumar_dos_numeros(num1, num2):
    #print(num1+num2)
    return num1+num2

'''
def mostrar_numero(num):
    num += 1
    print(num)#local
'''

def mostrar_numero():
    global num
    num += 1
    print(num)#local

#------------------llamadas a las funciones----
if __name__ == "__main__" :
    #sumar_dos_numeros(2,6)
    resultado = sumar_dos_numeros(2,6)
    print(resultado)

    num = 0
    #mostrar_numero(num)
    mostrar_numero()
    print(num) #local
