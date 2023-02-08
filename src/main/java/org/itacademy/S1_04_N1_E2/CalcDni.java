package org.itacademy.S1_04_N1_E2;

public class CalcDni {

    //Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
    //Crea una classe jUnit que verifiqui el seu correcte funcionament,
    // parametritzant-la perquè el test rebi un espectre de dades ampli
    // i validi si el càlcul és correcte per a 10 números de DNI predefinits.

    public String calcDNI(Integer numero) {
        //Para calcular la letra del DNI, debemos dividir el número entre 23.
        //El resto, que estará entre 0 y 22, está asociado a una letra según la siguiente tabla:
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero%23;
        return String.valueOf(caracteres.charAt(resto));
    }

}
