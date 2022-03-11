#include <iostream>

int main()
{
	int x = 12;
	int *puntero = &x;

	std::cout << "Variable:" << std::endl;
	std::cout << x << std::endl;
	std::cout << "" << std::endl;
	std::cout << "Dirección de memoria:" << std::endl;
	std::cout << puntero << std::endl;

	*puntero = 15;

	std::cout << "" << std::endl;
	std::cout << "Variable:" << std::endl;
	std::cout << x << std::endl;
	std::cout << "" << std::endl;
	std::cout << "Puntero:" << std::endl;
	std::cout << *puntero;
	return 0;
	}
