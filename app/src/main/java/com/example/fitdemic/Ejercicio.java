package com.example.fitdemic;

public class Ejercicio {
    private int id;
    private String nombre;
    private String descripcion;
    private int imagen;

    public static final Ejercicio[] ejerciciosPerdidaGrasa = {
            new Ejercicio(1, "Abdominales", "En el suelo boca arriba, con las piernas flexionadas realice 4 series de 10 repeticiones", R.drawable.abdominales),
            new Ejercicio(2, "Saltos", "Salta abriendo las piernas y levantando los brazos estirados por encima de la cabeza", R.drawable.salto),
            new Ejercicio(3, "Skipping", "Durante 20 segundos hacer skipping en el sitio", R.drawable.skipping),
            new Ejercicio(4, "Plancha", "sostener el cuerpo en horizontal con respecto al suelo activando fuertemente el abdomen durante 30 segundos", R.drawable.plancha),
            new Ejercicio(5, "Sentadillas", "De pie se hace el ademán de sentarse, ejerciendo presión en las piernas y glúteos. 4 sesiones de 10 repeticiones.", R.drawable.sentadilla),
    };

    public static final Ejercicio[] ejerciciosTonificacionMuscular = {
            new Ejercicio(6, "Flexiones de pecho", "boca abajo con las manos a la altura de los hombros, empuja el suelo para elevar tu cuerpo. repite 4 sesiones de 12 repeticiones.", R.drawable.flexionesdepecho),
            new Ejercicio(7, "Dips de tríceps", "con ayuda de una silla y de espalda a esta, colocar las manos apoyándose en la silla y flexionar los codos para bajar y subir. 4 sesiones de 12 repeticiones.", R.drawable.dipsdetriceps),
            new Ejercicio(8, "Zancadas alternas", "da un paso largo hacia adelante hasta que la rodilla de la pierna trasera tenga contacto con el suelo y cambia de pierna. 30 pasos.",0),
            new Ejercicio(9, "Abdominales", "En el suelo boca arriba, con las piernas flexionadas realice 4 series de 10 repeticiones", R.drawable.abdominales),
            new Ejercicio(10, "Superman", "En el suelo boca abajo, estira los brazos hacia adelante y sube y baja simultaneamente tus piernas y brazos. 20 repeticiones", R.drawable.superman),
    };

    public static final Ejercicio[] ejerciciosEstiramiento = {
            new Ejercicio(11, "Cuello", "Inclina la cabeza de un lado a otro, mantener durante 20 segundos 5 veces en cada dirección", R.drawable.cuello),
            new Ejercicio(12, "Hombro", "Lleva un brazo hacia el lado contrario y con el brazo libre hacer presión sobre el codo, mantener durante 15 segundos, 3 veces cada brazo.", R.drawable.hombros),
            new Ejercicio(13, "Brazo", "Pasa el brazo por detrás de la cabeza, y con la otra mano toma el codo tira de él hacia atrás, mantener 15 segundos repetir 3 veces con cada brazo.", R.drawable.biceps),
            new Ejercicio(14, "Pierna", "Flexiona la rodilla al máximo, sujetando el pie con la mano del lado contrario. Mantener 15 segundos repetir 3 veces con cada pierna ", R.drawable.pierna),
            new Ejercicio(15, "Parte superior", "Brazos estirados y cruzados sobre la cabeza y las palmas de las manos unidas, mantener 15 segundos", R.drawable.partesuperior),
    };

    public static final Ejercicio[] ejerciciosBajoImpacto = {
            new Ejercicio(16, "Boxeo", "Lanzar puños hacia el frente mientras se hacen pequeñas flexiones con cada puño. hacerlo durante 30 segundos.", R.drawable.boxeo),
            new Ejercicio(17, "Elevación de rodillas", "De pie, sube cada rodilla lo más alto posible, repetir durante 30 segundos", R.drawable.elevacionrodilla),
            new Ejercicio(18, "Sentadilla con elevación de rodilla", "En el suelo boca arriba, con las piernas flexionadas realice 4 series de 10 repeticiones", R.drawable.sentadillarodilla),
            new Ejercicio(19, "Abdominales Bicicleta", "En el suelo boca arriba, eleve las piernas y pedalee lentamente con las piernas en el aire. repetir durante 30 segundos.", R.drawable.abdominalesbicicleta),
            new Ejercicio(20, "Flexiones de pecho", "boca abajo con las manos a la altura de los hombros, empuja el suelo para elevar tu cuerpo. repite 4 sesiones de 12 repeticiones.", R.drawable.flexionesdepecho),
    };


    public Ejercicio(int id, String nombre, String descripcion, int imagen){
        this.id = id;
        this.nombre = nombre;
        this.descripcion=descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getImagen() {
        return imagen;
    }
}
