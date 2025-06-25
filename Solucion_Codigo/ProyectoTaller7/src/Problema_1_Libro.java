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

import java.util.ArrayList;

public class Problema_1_Libro
{	
	public static void main(String[] args)
	{
            Libro libroX = new Libro("Cien años de soledad", "Gabriel García Marquez", 1967);
            System.out.println(libroX);
	}
}

class Libro
{
	ArrayList<Capítulo> listaCapítulo = new ArrayList();
	public String título;
	public String autor;
	public int añoPublicación;
	Libro(){}
	Libro(String título, String autor, int añoPublicación)
	{
		this.título = título;
		this.autor = autor;
		this.añoPublicación = añoPublicación;
	}
	@Override
	public String toString()
	{
		return "Libro: {" + "\nTítulo: " + this.título + "\nAutor: " + this.autor + "\nañoPublicación: " + this.añoPublicación + "} "; 
	}
}

class Capítulo
{
    ArrayList<Sección> listaSección = new ArrayList();
    Capítulo(){}
}

class Sección
{
    ArrayList<Párrafo> listaPárrafo = new ArrayList();
    Sección(){}
}

class Párrafo extends Sección
{
    ArrayList<Sentencia> listaSentencia = new ArrayList();
    Párrafo(){}
}

class Figura extends Sección
{
    Figura(){}
}

class Tabla extends Sección
{
    Tabla(){}
}

class Lista extends Sección
{
    Lista(){}
}

class Viñeta extends Sección
{
    Viñeta(){}
}

class Sentencia
{
    ArrayList<Palabra> listaPalabra = new ArrayList();
    Sentencia(){}
    Sentencia(ArrayList listaPalabra)
    {
        this.listaPalabra = listaPalabra;
    }
}

class Palabra
{
    public char palabra;
    Palabra(char palabra)
    {
        this.palabra = palabra;
    }
}