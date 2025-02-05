    package esquinaalvaro_examen2_modelob;

    import java.util.Scanner;
    import java.util.Arrays;

    public class EsquinaAlvaro_examen2_modeloB_Ej1 {

        static double[] llenaPrecios(){ //Funcion que pide y asigna valores al array

            Scanner sc = new Scanner (System.in);
            double t [] = new double [6]; //crear el array

            for (int i = 0; i < t.length; i++) { //recorrer el array

                System.out.println("Dame el numero " + (i + 1) + " de tu tabla");//Pedir valores y asignar valores a cada posicion del array
                t[i] =  sc.nextDouble();
            }

            return t; // devuleve el array
        }  

        static double [] eliminaPrecioMinimo(double t[]){ //Funcion que encuentra y elimina el numero minimo del array y lo pasa a otro array

            // si pones 2 valores iguales la tabla elimina uno pero da 6 valores, si no da 5 valores pero todo 0.0

            double[] tCopia = new double [t.length - 1]; //crea el nuevo array

            //crear variable de numero minimo

            double numPequeño = 0;

            for (int i = 0; i < t.length; i++) {//recorre el array

                if (t[i] < numPequeño){ //si la posicion del array es mas peqeuña que numero pequeño, el numero de esta posicion se le asigna al la variable
                    numPequeño = t[i];
                }
            }
            int numMinimo =  (int) numPequeño;
            int indiceMenor = Arrays.binarySearch(t, numPequeño); //busca el numero minimo en la tabla

            if (indiceMenor >= 0){  //si el resultado es positivo
               System.arraycopy(t, 0, tCopia, 0, numMinimo);//copia la tabla desde le princicpio hasta el numero  a eliminar
               System.arraycopy(t, indiceMenor + 1, tCopia, indiceMenor, t.length - numMinimo - 1); //copia la tabla desde le nuemro posteior al minimo hasta el final
            }

            System.out.println("La tabla sin el numero pequeño quedaria tal que:" + Arrays.toString(tCopia));
            return tCopia; //devuelve el la nueva tabla sin el numero minimo
        }

        static void muestraDatosPrecio(double t[]){// funcion q ordena y devuelve el array

            Arrays.sort(t); //ordena el array

            System.out.println(Arrays.toString(t)); //devuelve el array ordenado

        }

        public static void main(String[] args) {

            double t[] = llenaPrecios(); // se crea la tabla t que se le asiggnan los valores de la funcion llenaPrecios

            eliminaPrecioMinimo(t); //funcion que elimina el precio minimio de la tabla
            muestraDatosPrecio(t); //funcion que muestra los datos ordenados de la tabla
        }

    }
