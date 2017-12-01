# include <iostream>
# include <stdlib.h>
# include <stdio.h>




using namespace std;

int main()
{

	int m;

	printf("Tamaño del arreglo: "); // imprimimos
	cin >> m; //guardamos el valor en m

	int a[m][m];  //arreglo del tamaño seleccionado

	printf("Numeros del arreglo\n");
	for (int i =0; i<m;i++){ // llenamos el arreglo en cada posicion
		for (int j =0; j<m;j++){

				cin >> a[i][j];


	}}

	for (int i =0; i<m;i++){ // imprimimos el arreglo
		for (int j =0; j<m;j++){
			printf("[");
			cout<<a[j][i] ;
			printf("]");
	}printf("\n");
}
system("pause");
	return 0;}
