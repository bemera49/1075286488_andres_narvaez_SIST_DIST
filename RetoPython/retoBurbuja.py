# import random
# import time

# inicio_tiempo = time.time()
# # Genera una lista de 10 números aleatorios
# numeros = [random.randint(1, 1000) for _ in range(10000)]

# print("Lista original:", numeros)

# # Algoritmo de ordenamiento burbuja
# def ordenamiento_burbuja(lista):
#     n = len(lista)
#     for i in range(n):
#         for j in range(0, n-i-1):
#             if lista[j] > lista[j+1]:
#                 lista[j], lista[j+1] = lista[j+1], lista[j]

# fin_tiempo = time.time()
# duracion_total = fin_tiempo - inicio_tiempo

# # Aplica el algoritmo de ordenamiento burbuja a la lista
# ordenamiento_burbuja(numeros)

# print("Lista ordenada:", numeros)
# print(f'Duración total de la ejecución: {duracion_total} segundos')



# **********************************************************************


#******************************************************
import random
import time

# Inicia el cronómetro
inicio_tiempo = time.time()

# Genera 100,000,000 números aleatorios únicos
num_registros = 30000
numeros_por_parte = 1000  # 10,000 números por parte

# Generar y ordenar números únicos por partes
with open('numeros_aleatorios.csv', 'w') as archivo:
    for i in range(0, num_registros, numeros_por_parte):
        numeros = random.sample(range(1, 30000), numeros_por_parte)
        numeros.sort()
        archivo.write('\n'.join(str(n) for n in numeros))
        archivo.write('\n')

# Detiene el cronómetro
fin_tiempo = time.time()

# Calcula la duración total
duracion_total = fin_tiempo - inicio_tiempo

print(f'Se han generado y ordenado {num_registros} números aleatorios únicos en base_de_datos.txt')
print(f'Duración total de la ejecución: {duracion_total} segundos')
