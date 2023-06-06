public class menuPrincipal {
    public static void main(String[] args) {
        redireccion_2 miFigura=new redireccion_2(4,2);
        miFigura.setLado(3);
        redireccion_2 mi2figura = new redireccion_2(3,10);
        System.out.println(miFigura.areaCuadrado(7));
        System.out.println(mi2figura.areaCuadrado(7));
    }
}
