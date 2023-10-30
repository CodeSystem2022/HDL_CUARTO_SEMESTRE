
# Bool contiene los valores de true y false
# Los tipos numericos es false para el 0 (cero), true para los demas valores
valor = 0
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 1
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo string -> False '' , True para demas valores
valor = ''
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado = bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para todas las demas
# Lista
valor = []
resultado = bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2,3,4]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')

# Tupla
valor = ()
resultado = bool(valor)
print(f'valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5,)
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

# Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de una diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de una diccionario con elementos: {valor}, Resultado: {resultado}')

# Sentencias de control con bool
if 'hola':
    print('Regresa verdadero')
else:
    print('Regresa falso')

# Ciclos
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
