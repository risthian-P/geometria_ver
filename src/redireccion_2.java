
public class redireccion_2 {
    //triangulo equilatero y cuadrado
    private int nLados;//número de lados
    public float lado;//longitud del lado

    //Constructor
    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public figuras2D(float lado) {
        this.lado = lado;
    }

    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }

    //Setters y getters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }


    public float areaCuadrado(int lado){
        return this.lado*this.lado;
    };
    private float perimetroCuadrado(){
        return 0;
    };

    private float areaTriangulo(){
        return 0;

    };
    private float perimetroTriangulo(){
        return 0;

    };
}

