package org.itacademy.S1_04_N1_E3;


public class LanzaException {
    //Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
    //Verifica el seu correcte funcionament amb un test jUnit.

    public void checkException(Integer size, Integer numoutOfBound) throws ArrayIndexOutOfBoundsException  {

        Integer[] list = new Integer[size];

        try {
            for (int i = 0; i < size; i++) {
                list[i] = i;
            }
            Integer number = list[numoutOfBound];

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Exception " + e.getMessage());

            throw new ArrayIndexOutOfBoundsException();

        }
    }

}


