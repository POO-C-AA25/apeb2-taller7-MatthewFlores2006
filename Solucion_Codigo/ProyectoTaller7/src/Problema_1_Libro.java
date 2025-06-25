/**
*## Problema 1 - Jerarquía de clases para el capítulo de libro
* Dibujad un diagrama de clases que muestre la estructura de un 
* **capítulo de libro**; un capítulo está compuesto por varias **secciones**, 
* cada una de las cuales comprende varios **párrafos** y **figuras**. 
* Un párrafo incluye varias **sentencias**, 
* cada una de las cuales contiene varias **palabras**.
* > [!Note]
* > - Suponga que en un futuro se prevé que el sistema gestione además de párrafos y figuras otros componentes, como tablas, listas, viñetas, etc.
* > - Suponga además que una palabra puede aparecer en varias sentencias.
* 
* @author Matthew Flores
*/
public class Problema_1_Libro
{	
	public static void main(String[] args)
	{


	}
}

class Libro
{
	ArrayList listaCapítulo = new ArrayList<Capítulo>;
	Libro(){}
}

class Capítulo
{
	ArrayList listaSección = new ArrayList<Capítulo>;
}

class Sección
{

}

class Párrafo
{

}

class Figura
{

}

class Sentencia
{

}

class Palabra
{

}