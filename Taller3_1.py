import random
tamaño = int(input("Tamaño del Arreglo: "))
fn=tamaño
cn=tamaño

mitad_1 = int(tamaño/2)
mitad_2 = mitad_1-1

matriz = [] #Creamos la matriz
matriz_2 = []

for i in range(fn): # llenamos la matriz con el tamaño asignado
    matriz.append([])
    matriz_2.append([])
    for j in range(cn):
        matriz[i].append(0)
        matriz_2[i].append(0)
print (matriz) # imprimimos la matriz en ceros


for i in range(fn): #llenamos la matriz de numeros aleatorios
    for j in range(cn):
        matriz[i][j]=random.randrange(1,10)

print (matriz)


for i in range (0,mitad_1):
    matriz_2[i][mitad_1-1]=matriz[i][mitad_1-1]
    matriz_2[i][mitad_1+1]=matriz[i][mitad_1+1]

    matriz_2[i][mitad_2]=matriz[i][mitad_2]
    matriz_2[i][mitad_1]=matriz[i][mitad_1]

    matriz_2[fn - i - 1][mitad_2] = matriz[fn - i - 1][mitad_2];
    matriz_2[fn - i - 1][mitad_1] = matriz[fn - i - 1][mitad_1];

    matriz_2[i][mitad_2 - i] = matriz[i][mitad_2 - i];
    matriz_2[i][mitad_2 + i] = matriz[i][mitad_2 + i];

    matriz_2[fn - i - 1][mitad_1 - i] = matriz[fn - i - 1][mitad_1 - i];
    matriz_2[fn - i - 1][mitad_1 + i] = matriz[fn - i - 1][mitad_1 - i];

    matriz_2[fn - i - 1][mitad_2 - i] = matriz[fn - i - 1][mitad_2 - i];
    matriz_2[fn - i - 1][mitad_2 + i] = matriz[fn - i - 1][mitad_2 - i];

for i in range(fn): #imprimimos la matriz cambiando sus lados
    print ()
    for j in range(cn):
        print ("[", matriz_2[i][j], "]", end="")