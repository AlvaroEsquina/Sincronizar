package esquinaalvaro_examen2_modelob;
import java.util.Scanner;

public class EsquinaAlvaro_examen2_modeloB_Ej2 {
    
    static boolean esHashtagValido(String hashtag){
        
        boolean conHashtag = false; //la variable es falsa
        
        if (hashtag.startsWith(hashtag)) { //empieza por '#' devuelve true
            conHashtag = true;
        }
        else if(!hashtag.startsWith(hashtag)){ //si no false
            conHashtag = false;
        }
        return conHashtag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce una lista de hashtag separados por comas: "); //Pedir valores y colocar en string
        String texto = sc.nextLine(); 
        
        texto = texto.trim(); //eliminar espacios
        
        String t[] = texto.split(",");//convertir String en tablas
        String hashtag = "#"; //crear variable     
        
         esHashtagValido(hashtag); //referencia de funcion
         for (int i = 0; i < t.length; i++) {//recorer tabla
            
            if (true){ //si el valor i de la tabla empieza por hashtag, excribir:
                System.out.println(t[i] + " es valido");
            }
            else if (false){///si el valor i de la tabla no empieza por hashtag, excribir:
                System.out.println(t[i] + " no es valido");
            }
        }
    }
}
    

