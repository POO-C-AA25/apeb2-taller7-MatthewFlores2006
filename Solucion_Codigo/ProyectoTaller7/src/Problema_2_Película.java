
import java.util.ArrayList;

/**
*
* Un videoclub dispone de una serie de películas que pueden estar en **DVD** _(con capacidad en Gb.)_ o en 
* **VHS** _(una sola cinta por película y con cierto tipo de cinta magnetica)_. 
* De las películas interesa guardar el título, el autor, el año de edición y el 
* idioma _(o los idiomas, en caso de DVD)_. El precio de alquiler de las películas 
* varía en función del tipo de película. Las **DVD** siempre son 10% mas caras que 
* las de **VHS**.
* [!Note]
* - Analice los tipos de relación de las siguientes posibles clases: Pelicula, Dvd, Vhs, Soporte, etc, y justifique su diseño.
* - Para probar el diseño jerarquico de clases, instancia en el clase de prueba Ejecutor _(la-s clase-s respectiva-s)_, con datos aleatorios.  
* - Los escenarios de prueba pueden darse para el alquiler de una o varias peliculas según la preferencia del usuario. 
* 
* @author Matthew Flores 
*/

public class Problema_2_Película
{
    public static void main(String[] args) 
    {
        Película peli = new Película("Stitch");
        Película peli2 = new Película("La monja");
        VHS vhs = new VHS("ESP", peli, 1.5);
        System.out.println(vhs);
    }
}

class SoportePelícula
{
    public double precioAlq;

    SoportePelícula(){}
    
    SoportePelícula(double precioAlq)
    {
        this.precioAlq = precioAlq;
    }
    
    @Override
    public String toString()
    {
        return "SoportePel\u00edcula{" + "precioAlq=" + precioAlq + " } ";
    }    
}
class DVD extends SoportePelícula
{   
    public String idioma[];
    public ArrayList<Película> películas;
    
    public void calcularPrecioAlq()
    {
        this.precioAlq += this.precioAlq * 0.1;
    }

    public DVD(String[] idioma, ArrayList<Película> películas, double precioAlq)
    {
        super(precioAlq);
        this.idioma = idioma;
        this.películas = películas;
    }    
}

class VHS extends SoportePelícula
{
    public String idioma;
    public Película película;
    
    public VHS(){}
    
    public VHS(String idioma, Película película, double precioAlq)
    {
        super(precioAlq);
        this.idioma = idioma;
        this.película = película;
    }
    
    
}

class Película
{
    public String título;
    public String autor;
    public int añoEdición;
    
    Película(){}
    
    public Película(String título, String autor, int añoEdición)
    {
        this.título = título;
        this.autor = autor;
        this.añoEdición = añoEdición;
    }
    
    public Película(String título)
    {
        this.título = título;
    }
}